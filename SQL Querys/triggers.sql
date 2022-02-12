/*
SQLyog Community v13.1.7 (64 bit)
MySQL - 10.5.7-MariaDB-1:10.5.7+maria~focal : Database - bd2_202215_grupo3
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bd2_202215_grupo3` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `bd2_202215_grupo3`;

/* Trigger structure for table `Encomiendas` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `actualizarPrecioTotal` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'bd2_202215_26599849'@'%' */ /*!50003 TRIGGER `actualizarPrecioTotal` BEFORE UPDATE ON `Encomiendas` FOR EACH ROW BEGIN
    set New.precio_total=New.precio_peso + (New.distancia_recorrida*0.4);

    END */$$


DELIMITER ;

/* Trigger structure for table `Encomiendas` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `eliminarSolicitud` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'bd2_202215_26599849'@'%' */ /*!50003 TRIGGER `eliminarSolicitud` BEFORE UPDATE ON `Encomiendas` FOR EACH ROW BEGIN
    If(New.estatusE='T')
    then
    delete from Solicitan where identificacionT=New.identificacionT and cod_encomienda=New.cod_encomienda;
    END IF;

    END */$$


DELIMITER ;

/* Trigger structure for table `Encomiendas` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `eliminarSolicitudes` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'bd2_202215_26599849'@'%' */ /*!50003 TRIGGER `eliminarSolicitudes` BEFORE UPDATE ON `Encomiendas` FOR EACH ROW BEGIN
    if(New.estatusE='A')
    then
    delete from Solicitan WHERE cod_encomienda=New.cod_encomienda;
    end if;

    END */$$


DELIMITER ;

/* Trigger structure for table `Encomiendas` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `nuevoStatusT` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'bd2_202215_26599849'@'%' */ /*!50003 TRIGGER `nuevoStatusT` BEFORE UPDATE ON `Encomiendas` FOR EACH ROW BEGIN
    if((New.identificacionT!=Old.identificacionT)&&(Old.estatusE='T'))
    then
    SET New.estatusE='P';
    end if;

    END */$$


DELIMITER ;

/* Trigger structure for table `Encomiendas` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `nuevoEstatusT` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'bd2_202215_26599849'@'%' */ /*!50003 TRIGGER `nuevoEstatusT` BEFORE UPDATE ON `Encomiendas` FOR EACH ROW BEGIN
    if(New.estatusE='T' && Old.estatusE='P')
    then
    Set New.fecha_salida=current_date();
    end if;

    END */$$


DELIMITER ;

/* Trigger structure for table `Encomiendas` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `nuevoEstatusA` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'bd2_202215_26599849'@'%' */ /*!50003 TRIGGER `nuevoEstatusA` BEFORE UPDATE ON `Encomiendas` FOR EACH ROW BEGIN
    IF(New.estatusE='A' && Old.estatusE='T')
    THEN
    SET New.fecha_llegada=CURRENT_DATE();
    END IF;

    END */$$


DELIMITER ;

/* Trigger structure for table `Encomiendas` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `validacion_status` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'bd2_202215_26599849'@'%' */ /*!50003 TRIGGER `validacion_status` AFTER UPDATE ON `Encomiendas` FOR EACH ROW 
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
END */$$


DELIMITER ;

/* Trigger structure for table `Encomiendas` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `pagoTransportista` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'bd2_202215_26599849'@'%' */ /*!50003 TRIGGER `pagoTransportista` AFTER UPDATE ON `Encomiendas` FOR EACH ROW BEGIN
    IF( (New.estatusE='A'))
    then
    Update Transportista
    set saldoT=saldoT+(Old.precio_total*0,7),pedidos_realizados=pedidos_realizados+1
    where Transportista.identificacionT=Old.identificacionT;
    end if;

    END */$$


DELIMITER ;

/* Trigger structure for table `Encomiendas` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `eliminarEncomiendaSolicitada` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'bd2_202215_26599849'@'%' */ /*!50003 TRIGGER `eliminarEncomiendaSolicitada` AFTER UPDATE ON `Encomiendas` FOR EACH ROW 
BEGIN
    IF((Old.identificacionT!=NULL)&&(New.identificacionT=NULL))
    THEN
        UPDATE Encomiendas
        SET Encomiendas.estatusE='P'
        WHERE cod_encomienda=New.cod_encomienda;
    END IF;
END */$$


DELIMITER ;

/* Trigger structure for table `Paquetes` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `actualizacionVolumen` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'bd2_202215_26599849'@'%' */ /*!50003 TRIGGER `actualizacionVolumen` AFTER INSERT ON `Paquetes` FOR EACH ROW 
BEGIN
	UPDATE  Encomiendas
        SET precio_peso = precio_peso + ((New.alto_paq*New.ancho_paq*New.profundidad)*10)
        WHERE Encomiendas.cod_encomienda = New.cod_destino;

END */$$


DELIMITER ;

/* Trigger structure for table `Paquetes` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `actualizarVolumen3` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'bd2_202215_26599849'@'%' */ /*!50003 TRIGGER `actualizarVolumen3` BEFORE UPDATE ON `Paquetes` FOR EACH ROW BEGIN
    UPDATE Encomiendas
    SET precio_peso = precio_peso - ((Old.alto_paq*Old.ancho_paq*Old.profundidad)*10) + ((New.alto_paq*New.ancho_paq*New.profundidad)*10)
    WHERE Encomiendas.cod_encomienda = Old.cod_destino;

    END */$$


DELIMITER ;

/* Trigger structure for table `Paquetes` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `actualizaronVolumen2` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'bd2_202215_26599849'@'%' */ /*!50003 TRIGGER `actualizaronVolumen2` BEFORE DELETE ON `Paquetes` FOR EACH ROW BEGIN
    update Encomiendas
    set precio_peso = precio_peso - ((Old.alto_paq*Old.ancho_paq*Old.profundidad)*10)
    WHERE Encomiendas.cod_encomienda = Old.cod_destino;

    END */$$


DELIMITER ;

/* Trigger structure for table `Recargas` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `recarga_cliente` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'bd2_202215_26599849'@'%' */ /*!50003 TRIGGER `recarga_cliente` AFTER INSERT ON `Recargas` FOR EACH ROW BEGIN
    Update Clientes
    set saldoC=saldoC+New.saldo_recarga
    where Clientes.identificacionC=New.identificacionC;

    END */$$


DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
