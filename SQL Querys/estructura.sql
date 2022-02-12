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

/*Table structure for table `Ciudades` */

DROP TABLE IF EXISTS `Ciudades`;

CREATE TABLE `Ciudades` (
  `cod_ciudades` varchar(10) NOT NULL,
  `nombre_ciudades` varchar(50) NOT NULL,
  `cod_estados` varchar(10) NOT NULL,
  `cod_pais` varchar(10) NOT NULL,
  PRIMARY KEY (`cod_ciudades`,`cod_estados`,`cod_pais`),
  KEY `Existen` (`cod_estados`,`cod_pais`),
  CONSTRAINT `Existen` FOREIGN KEY (`cod_estados`, `cod_pais`) REFERENCES `Estados` (`cod_estados`, `cod_pais`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Clientes` */

DROP TABLE IF EXISTS `Clientes`;

CREATE TABLE `Clientes` (
  `identificacionC` varchar(15) NOT NULL,
  `nacionalidadC` char(1) NOT NULL,
  `nombreC` varchar(50) NOT NULL,
  `apellidoC` varchar(50) NOT NULL,
  `emailC` varchar(50) NOT NULL,
  `telefono1C` varchar(20) NOT NULL,
  `telefono2C` varchar(20) DEFAULT NULL,
  `saldoC` float NOT NULL,
  `cod_ciudades` varchar(10) NOT NULL,
  `cod_estados` varchar(10) NOT NULL,
  `cod_pais` varchar(10) NOT NULL,
  PRIMARY KEY (`identificacionC`),
  KEY `IX_Relationship29` (`cod_ciudades`,`cod_estados`,`cod_pais`),
  CONSTRAINT `Reside` FOREIGN KEY (`cod_ciudades`, `cod_estados`, `cod_pais`) REFERENCES `Ciudades` (`cod_ciudades`, `cod_estados`, `cod_pais`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Cursos` */

DROP TABLE IF EXISTS `Cursos`;

CREATE TABLE `Cursos` (
  `codigo_curso` varchar(10) NOT NULL,
  `fecha_curso` date NOT NULL,
  `cod_ciudades` varchar(10) NOT NULL,
  `cod_estados` varchar(10) NOT NULL,
  `cod_pais` varchar(10) NOT NULL,
  `cod_nucleos` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo_curso`),
  KEY `IX_Relationship13` (`cod_ciudades`,`cod_estados`,`cod_pais`),
  KEY `IX_Relationship20` (`cod_nucleos`),
  CONSTRAINT `Dicta` FOREIGN KEY (`cod_nucleos`) REFERENCES `Nucleos` (`cod_nucleo`),
  CONSTRAINT `Relationship13` FOREIGN KEY (`cod_ciudades`, `cod_estados`, `cod_pais`) REFERENCES `Ciudades` (`cod_ciudades`, `cod_estados`, `cod_pais`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Detalles_Art` */

DROP TABLE IF EXISTS `Detalles_Art`;

CREATE TABLE `Detalles_Art` (
  `nombreArt` varchar(50) NOT NULL,
  `cantidad_art` int(11) NOT NULL,
  `precio_art` float NOT NULL,
  `cod_paquete` varchar(10) NOT NULL,
  `cod_encomienda` varchar(10) NOT NULL,
  PRIMARY KEY (`nombreArt`,`cod_paquete`,`cod_encomienda`),
  KEY `Contiene` (`cod_paquete`,`cod_encomienda`),
  CONSTRAINT `Contiene` FOREIGN KEY (`cod_paquete`, `cod_encomienda`) REFERENCES `Paquetes` (`cod_paquete`, `cod_destino`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Empleados` */

DROP TABLE IF EXISTS `Empleados`;

CREATE TABLE `Empleados` (
  `identificacionE` varchar(10) NOT NULL,
  `nombreE` varchar(50) NOT NULL,
  `apellidoE` varchar(50) NOT NULL,
  `emailE` varchar(50) NOT NULL,
  `telefono1E` varchar(15) NOT NULL,
  `telefono2E` varchar(15) DEFAULT NULL,
  `cod_nucleos` varchar(50) NOT NULL,
  PRIMARY KEY (`identificacionE`),
  KEY `IX_Relationship23` (`cod_nucleos`),
  CONSTRAINT `Trabaja` FOREIGN KEY (`cod_nucleos`) REFERENCES `Nucleos` (`cod_nucleo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Encomiendas` */

DROP TABLE IF EXISTS `Encomiendas`;

CREATE TABLE `Encomiendas` (
  `cod_encomienda` varchar(10) NOT NULL,
  `estatusE` char(1) NOT NULL,
  `distancia_recorrida` float NOT NULL,
  `precio_peso` float NOT NULL,
  `precio_total` float NOT NULL,
  `destinatario` varchar(100) NOT NULL,
  `fecha_creada` date NOT NULL,
  `fecha_salida` date DEFAULT NULL,
  `fecha_llegada` date DEFAULT NULL,
  `identificacionT` char(15) DEFAULT NULL,
  `identificacionC` varchar(15) NOT NULL,
  `identificacionE` varchar(10) NOT NULL,
  `cod_ciudades` varchar(10) NOT NULL,
  `cod_estados` varchar(10) NOT NULL,
  `cod_pais` varchar(10) NOT NULL,
  `cod_nucleo` varchar(10) NOT NULL,
  PRIMARY KEY (`cod_encomienda`),
  KEY `IX_Relationship15` (`identificacionT`),
  KEY `IX_Relationship16` (`identificacionC`),
  KEY `IX_Relationship27` (`cod_ciudades`,`cod_estados`,`cod_pais`),
  KEY `IX_Relationship32` (`identificacionE`),
  KEY `Cod_nucleosIndex` (`cod_nucleo`),
  CONSTRAINT `Envia` FOREIGN KEY (`identificacionC`) REFERENCES `Clientes` (`identificacionC`),
  CONSTRAINT `Gestiona` FOREIGN KEY (`identificacionE`) REFERENCES `Empleados` (`identificacionE`),
  CONSTRAINT `Se_envia` FOREIGN KEY (`cod_ciudades`, `cod_estados`, `cod_pais`) REFERENCES `Ciudades` (`cod_ciudades`, `cod_estados`, `cod_pais`),
  CONSTRAINT `Se_genera` FOREIGN KEY (`cod_nucleo`) REFERENCES `Nucleos` (`cod_nucleo`),
  CONSTRAINT `Transporta` FOREIGN KEY (`identificacionT`) REFERENCES `Transportistas` (`identificacionT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Estados` */

DROP TABLE IF EXISTS `Estados`;

CREATE TABLE `Estados` (
  `cod_estados` varchar(10) NOT NULL,
  `nombre_estados` varchar(50) NOT NULL,
  `cod_pais` varchar(10) NOT NULL,
  PRIMARY KEY (`cod_estados`,`cod_pais`),
  KEY `Posee` (`cod_pais`),
  CONSTRAINT `Posee` FOREIGN KEY (`cod_pais`) REFERENCES `Paises` (`cod_pais`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Nucleos` */

DROP TABLE IF EXISTS `Nucleos`;

CREATE TABLE `Nucleos` (
  `cod_nucleo` varchar(50) NOT NULL,
  `nombre_nucleo` varchar(50) NOT NULL,
  `num_telefonoN` varchar(15) NOT NULL,
  `identificacionE` varchar(10) DEFAULT NULL,
  `cod_ciudades` varchar(10) NOT NULL,
  `cod_estados` varchar(10) NOT NULL,
  `cod_pais` varchar(10) NOT NULL,
  PRIMARY KEY (`cod_nucleo`),
  UNIQUE KEY `Unique` (`nombre_nucleo`),
  KEY `IX_Relationship24` (`identificacionE`),
  KEY `IX_Relationship26` (`cod_ciudades`,`cod_estados`,`cod_pais`),
  CONSTRAINT `Se_encarga` FOREIGN KEY (`identificacionE`) REFERENCES `Empleados` (`identificacionE`),
  CONSTRAINT `Se_encuentra` FOREIGN KEY (`cod_ciudades`, `cod_estados`, `cod_pais`) REFERENCES `Ciudades` (`cod_ciudades`, `cod_estados`, `cod_pais`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Paises` */

DROP TABLE IF EXISTS `Paises`;

CREATE TABLE `Paises` (
  `cod_pais` varchar(10) NOT NULL,
  `nombre_pais` varchar(40) NOT NULL,
  PRIMARY KEY (`cod_pais`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Paquetes` */

DROP TABLE IF EXISTS `Paquetes`;

CREATE TABLE `Paquetes` (
  `cod_paquete` varchar(10) NOT NULL,
  `peso_paq` float NOT NULL,
  `alto_paq` float NOT NULL,
  `ancho_paq` float NOT NULL,
  `profundidad` float NOT NULL,
  `cod_destino` varchar(10) NOT NULL,
  PRIMARY KEY (`cod_paquete`,`cod_destino`),
  KEY `Es_formada` (`cod_destino`),
  CONSTRAINT `Es_formada` FOREIGN KEY (`cod_destino`) REFERENCES `Encomiendas` (`cod_encomienda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Recargas` */

DROP TABLE IF EXISTS `Recargas`;

CREATE TABLE `Recargas` (
  `identificacionC` varchar(15) NOT NULL,
  `identificacionE` varchar(10) NOT NULL,
  `fecha_recarga` datetime NOT NULL,
  `saldo_recarga` float NOT NULL,
  PRIMARY KEY (`identificacionC`,`identificacionE`,`fecha_recarga`),
  KEY `Confirma` (`identificacionE`),
  CONSTRAINT `Confirma` FOREIGN KEY (`identificacionE`) REFERENCES `Empleados` (`identificacionE`),
  CONSTRAINT `Realiza` FOREIGN KEY (`identificacionC`) REFERENCES `Clientes` (`identificacionC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Solicitan` */

DROP TABLE IF EXISTS `Solicitan`;

CREATE TABLE `Solicitan` (
  `identificacionT` char(15) NOT NULL,
  `cod_encomienda` varchar(10) NOT NULL,
  PRIMARY KEY (`identificacionT`,`cod_encomienda`),
  KEY `Es_solicitada` (`cod_encomienda`),
  CONSTRAINT `Es_solicitada` FOREIGN KEY (`cod_encomienda`) REFERENCES `Encomiendas` (`cod_encomienda`),
  CONSTRAINT `Solicitan_una` FOREIGN KEY (`identificacionT`) REFERENCES `Transportistas` (`identificacionT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Transportistas` */

DROP TABLE IF EXISTS `Transportistas`;

CREATE TABLE `Transportistas` (
  `identificacionT` char(15) NOT NULL,
  `nacionalidadT` char(1) NOT NULL,
  `nombreT` varchar(50) NOT NULL,
  `apellidoT` varchar(50) NOT NULL,
  `emailT` varchar(50) NOT NULL,
  `telefono1T` varchar(15) NOT NULL,
  `telefono2T` varchar(15) DEFAULT NULL,
  `lic_conducirT` varchar(12) DEFAULT NULL,
  `fecha_ingreso` date NOT NULL,
  `antecedentes_penalesT` varchar(1000) DEFAULT NULL,
  `pedidos_realizadosT` int(11) NOT NULL,
  `saldoT` float NOT NULL,
  `codigo_curso` varchar(10) DEFAULT NULL,
  `cod_nucleos` varchar(50) NOT NULL,
  `cod_ciudades` varchar(10) DEFAULT NULL,
  `cod_estados` varchar(10) DEFAULT NULL,
  `cod_pais` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`identificacionT`),
  KEY `IX_Relationship14` (`codigo_curso`),
  KEY `IX_Relationship28` (`cod_ciudades`,`cod_estados`,`cod_pais`),
  KEY `IX_Relationship25` (`cod_nucleos`),
  CONSTRAINT `Cursa` FOREIGN KEY (`codigo_curso`) REFERENCES `Cursos` (`codigo_curso`),
  CONSTRAINT `Reside_en` FOREIGN KEY (`cod_ciudades`, `cod_estados`, `cod_pais`) REFERENCES `Ciudades` (`cod_ciudades`, `cod_estados`, `cod_pais`),
  CONSTRAINT `Se_registro` FOREIGN KEY (`cod_nucleos`) REFERENCES `Nucleos` (`cod_nucleo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Usuarios` */

DROP TABLE IF EXISTS `Usuarios`;

CREATE TABLE `Usuarios` (
  `identificacion` varchar(15) NOT NULL,
  `clave` varchar(15) NOT NULL,
  PRIMARY KEY (`identificacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Vehiculos_Motor` */

DROP TABLE IF EXISTS `Vehiculos_Motor`;

CREATE TABLE `Vehiculos_Motor` (
  `cod_vehiculos` varchar(10) NOT NULL,
  `placa` varchar(10) NOT NULL,
  `modeloV` varchar(50) NOT NULL,
  `marcaV` varchar(20) NOT NULL,
  `colorV` varchar(20) NOT NULL,
  `tipoV` varchar(20) NOT NULL,
  `identificacionT` char(15) NOT NULL,
  PRIMARY KEY (`cod_vehiculos`,`identificacionT`),
  UNIQUE KEY `placa` (`placa`),
  KEY `Dispone_de` (`identificacionT`),
  CONSTRAINT `Dispone_de` FOREIGN KEY (`identificacionT`) REFERENCES `Transportistas` (`identificacionT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `Vuelos` */

DROP TABLE IF EXISTS `Vuelos`;

CREATE TABLE `Vuelos` (
  `cod_vuelos` varchar(20) NOT NULL,
  `hora_salida` time NOT NULL,
  `hora_llegada` time NOT NULL,
  `hora_estimada_S` time NOT NULL,
  `hora_estimada_LL` time NOT NULL,
  `hora_retraso` time DEFAULT NULL,
  `descripcion_retraso` varchar(100) DEFAULT NULL,
  `fecha_llegada` date NOT NULL,
  `fecha_salida` date NOT NULL,
  `identificacionT` char(15) NOT NULL,
  PRIMARY KEY (`cod_vuelos`,`identificacionT`),
  KEY `Se_traslada` (`identificacionT`),
  CONSTRAINT `Se_traslada` FOREIGN KEY (`identificacionT`) REFERENCES `Transportistas` (`identificacionT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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

/* Procedure structure for procedure `descontar_saldo` */

/*!50003 DROP PROCEDURE IF EXISTS  `descontar_saldo` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`bd2_202215_26599849`@`%` PROCEDURE `descontar_saldo`(In codigoEn varCHAR(10))
BEGIN
	UPDATE Clientes, Encomiendas
		SET Clientes.saldoC = Clientes.saldoC-Encomiendas.precio_total
		WHERE Encomiendas.cod_encomienda = codigoEn
		    AND Clientes.identificacionC = Encomiendas.identificacionC ;			
	END */$$
DELIMITER ;

/*Table structure for table `encomiendasDisponibles` */

DROP TABLE IF EXISTS `encomiendasDisponibles`;

/*!50001 DROP VIEW IF EXISTS `encomiendasDisponibles` */;
/*!50001 DROP TABLE IF EXISTS `encomiendasDisponibles` */;

/*!50001 CREATE TABLE  `encomiendasDisponibles`(
 `cod_encomienda` varchar(10) ,
 `estatusE` char(1) ,
 `distancia_recorrida` float ,
 `precio_peso` float ,
 `precio_total` float ,
 `destinatario` varchar(100) ,
 `fecha_creada` date ,
 `fecha_salida` date ,
 `fecha_llegada` date ,
 `identificacionT` char(15) ,
 `identificacionC` varchar(15) ,
 `identificacionE` varchar(10) ,
 `cod_ciudades` varchar(10) ,
 `cod_estados` varchar(10) ,
 `cod_pais` varchar(10) ,
 `cod_nucleo` varchar(10) 
)*/;

/*View structure for view encomiendasDisponibles */

/*!50001 DROP TABLE IF EXISTS `encomiendasDisponibles` */;
/*!50001 DROP VIEW IF EXISTS `encomiendasDisponibles` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`bd2_202215_26599849`@`%` SQL SECURITY DEFINER VIEW `encomiendasDisponibles` AS (select `Encomiendas`.`cod_encomienda` AS `cod_encomienda`,`Encomiendas`.`estatusE` AS `estatusE`,`Encomiendas`.`distancia_recorrida` AS `distancia_recorrida`,`Encomiendas`.`precio_peso` AS `precio_peso`,`Encomiendas`.`precio_total` AS `precio_total`,`Encomiendas`.`destinatario` AS `destinatario`,`Encomiendas`.`fecha_creada` AS `fecha_creada`,`Encomiendas`.`fecha_salida` AS `fecha_salida`,`Encomiendas`.`fecha_llegada` AS `fecha_llegada`,`Encomiendas`.`identificacionT` AS `identificacionT`,`Encomiendas`.`identificacionC` AS `identificacionC`,`Encomiendas`.`identificacionE` AS `identificacionE`,`Encomiendas`.`cod_ciudades` AS `cod_ciudades`,`Encomiendas`.`cod_estados` AS `cod_estados`,`Encomiendas`.`cod_pais` AS `cod_pais`,`Encomiendas`.`cod_nucleo` AS `cod_nucleo` from `Encomiendas` where `Encomiendas`.`estatusE` = 'P') */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
