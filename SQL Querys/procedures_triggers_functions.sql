DELIMITER $$
CREATE TRIGGER validacion_status 
BEFORE UPDATE ON Encomiendas
FOR EACH ROW
BEGIN
	IF( ((New.estatusE='P')&&(Old.estatusE='D')))
	THEN
		IF( EXISTS(SELECT *
			FROM Encomiendas e, Clientes c 
			WHERE c.identificacionC = e.identificacionC 
				AND e.cod_encomienda = NEW.cod_encomienda
				AND c.saldoC > e.precio_total))
		THEN 
			CALL descontar_saldo(OLD.cod_encomienda);
		ELSE
			SIGNAL SQLSTATE '45000'
			SET MESSAGE_TEXT = 'Saldo no suficiente';
		END IF;
	END IF;
END $$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER validacion_status2
BEFORE UPDATE ON Encomiendas
FOR EACH ROW
BEGIN
	IF( ((New.estatusE='P')&&(Old.estatusE='D')))
	THEN
		IF( EXISTS(SELECT *
			FROM Encomiendas e, Clientes c 
			WHERE c.identificacionC = e.identificacionC 
				AND e.cod_encomienda = NEW.cod_encomienda
				AND c.saldoC > e.precio_total))
		THEN 
			UPDATE Clientes, Encomiendas
			SET Clientes.saldoC = Clientes.saldoC - Encomiendas.precio_total
			WHERE Encomiendas.cod_encomienda = OLD.cod_encomienda
				AND Encomiendas.identificacionC = Clientes.identificacionC;
		ELSE
			SIGNAL SQLSTATE '45000'
			SET MESSAGE_TEXT = 'Saldo no suficiente';			
		END IF;
	END IF;
END $$
DELIMITER ;

DROP TRIGGER validacion_status

DELIMITER $$
CREATE TRIGGER actualizacionVolumen
AFTER INSERT ON Paquetes
FOR EACH ROW
BEGIN
    UPDATE  Encomiendas
	SET precio_peso = precio_peso + ((New.alto_paq*New.ancho_paq*New.profundidad)//*CONSTANTE*/)
	WHERE Encomiendas.cod_encomienda = New.cod_destino;
END $$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER actualizacionPrecio_distancio
AFTER INSERT ON Encomiendas
FOR EACH ROW
BEGIN
	SET precio_distancia = precio_peso + ((New.alto_paq*New.ancho_paq*New.profundidad)//*CONSTANTE*/)
	WHERE Encomiendas.cod_encomienda = New.cod_destino;
END $$
DELIMITER ;