/*
Created: 1/2/2022
Modified: 1/2/2022
Model: MySQL 5.7
Database: MySQL 5.7
*/


-- Create tables section -------------------------------------------------

-- Table Clientes

CREATE TABLE `Clientes`
(
  `identificacionC` Varchar(15) NOT NULL,
  `nacionalidadC` Char(1) NOT NULL,
  `nombreC` Varchar(50) NOT NULL,
  `apellidoC` Varchar(50) NOT NULL,
  `emailC` Varchar(50) NOT NULL,
  `telefono1C` Varchar(20) NOT NULL,
  `telefono2C` Varchar(20),
  `saldoC` Float NOT NULL,
  `cod_ciudades` Varchar(10),
  `cod_estados` Varchar(10),
  `cod_pais` Varchar(10)
)
;

CREATE INDEX `IX_Relationship29` ON `Clientes` (`cod_ciudades`,`cod_estados`,`cod_pais`)
;

ALTER TABLE `Clientes` ADD PRIMARY KEY (`identificacionC`)
;

-- Table Transportistas

CREATE TABLE `Transportistas`
(
  `identificacionT` Char(15) NOT NULL,
  `nacionalidadT` Char(1) NOT NULL,
  `nombreT` Varchar(50) NOT NULL,
  `apellidoT` Varchar(50) NOT NULL,
  `emailT` Varchar(50) NOT NULL,
  `telefono1T` Varchar(15) NOT NULL,
  `telefono2T` Varchar(15),
  `lic_conducirT` Char(1) NOT NULL,
  `fecha_ingreso` Date NOT NULL,
  `antecedentes_penalesT` Varchar(1000) NOT NULL,
  `pedidos_realizadosT` Int NOT NULL,
  `horarioT` Varchar(200) NOT NULL,
  `saldoT` Char(20) NOT NULL,
  `codigo_curso` Varchar(10) NOT NULL,
  `nombre_nucleos` Varchar(50) NOT NULL,
  `cod_ciudades` Varchar(10) NOT NULL,
  `cod_estados` Varchar(10) NOT NULL,
  `cod_pais` Varchar(10) NOT NULL
)
;

CREATE INDEX `IX_Relationship14` ON `Transportistas` (`codigo_curso`)
;

CREATE INDEX `IX_Relationship25` ON `Transportistas` (`nombre_nucleos`)
;

CREATE INDEX `IX_Relationship28` ON `Transportistas` (`cod_ciudades`,`cod_estados`,`cod_pais`)
;

ALTER TABLE `Transportistas` ADD PRIMARY KEY (`identificacionT`)
;

-- Table Encomiendas

CREATE TABLE `Encomiendas`
(
  `cod_encomienda` Varchar(10) NOT NULL,
  `estatusE` Char(1) NOT NULL,
  `precio_peso` Float NOT NULL,
  `precio_distancia` Float NOT NULL,
  `precio_total` Float NOT NULL,
  `identificacionT` Char(15) NOT NULL,
  `identificacionC` Varchar(15) NOT NULL,
  `identificacionE` Varchar(10) NOT NULL,
  `cod_ciudades` Varchar(10) NOT NULL,
  `cod_estados` Varchar(10) NOT NULL,
  `cod_pais` Varchar(10) NOT NULL
)
;

CREATE INDEX `IX_Relationship15` ON `Encomiendas` (`identificacionT`)
;

CREATE INDEX `IX_Relationship16` ON `Encomiendas` (`identificacionC`)
;

CREATE INDEX `IX_Relationship27` ON `Encomiendas` (`cod_ciudades`,`cod_estados`,`cod_pais`)
;

CREATE INDEX `IX_Relationship32` ON `Encomiendas` (`identificacionE`)
;

ALTER TABLE `Encomiendas` ADD PRIMARY KEY (`cod_encomienda`)
;

-- Table Cursos

CREATE TABLE `Cursos`
(
  `codigo_curso` Varchar(10) NOT NULL,
  `fecha_curso` Date NOT NULL,
  `cod_ciudades` Varchar(10) NOT NULL,
  `cod_estados` Varchar(10) NOT NULL,
  `cod_pais` Varchar(10) NOT NULL,
  `nombre_nucleos` Varchar(50) NOT NULL
)
;

CREATE INDEX `IX_Relationship13` ON `Cursos` (`cod_ciudades`,`cod_estados`,`cod_pais`)
;

CREATE INDEX `IX_Relationship20` ON `Cursos` (`nombre_nucleos`)
;

ALTER TABLE `Cursos` ADD PRIMARY KEY (`codigo_curso`)
;

-- Table Nucleos

CREATE TABLE `Nucleos`
(
  `nombre_nucleos` Varchar(50) NOT NULL,
  `num_telefonoN` Varchar(15) NOT NULL,
  `identificacionE` Varchar(10),
  `cod_ciudades` Varchar(10) NOT NULL,
  `cod_estados` Varchar(10) NOT NULL,
  `cod_pais` Varchar(10) NOT NULL
)
;

CREATE INDEX `IX_Relationship24` ON `Nucleos` (`identificacionE`)
;

CREATE INDEX `IX_Relationship26` ON `Nucleos` (`cod_ciudades`,`cod_estados`,`cod_pais`)
;

ALTER TABLE `Nucleos` ADD PRIMARY KEY (`nombre_nucleos`)
;

-- Table Detalles_Art

CREATE TABLE `Detalles_Art`
(
  `nombreArt` Varchar(50) NOT NULL,
  `cantidad_art` Int NOT NULL,
  `precio_art` Float NOT NULL,
  `cod_paquete` Varchar(10) NOT NULL,
  `cod_encomienda` Varchar(10) NOT NULL
)
;

ALTER TABLE `Detalles_Art` ADD PRIMARY KEY (`nombreArt`,`cod_paquete`,`cod_encomienda`)
;

-- Table Empleados

CREATE TABLE `Empleados`
(
  `identificacionE` Varchar(10) NOT NULL,
  `nombreE` Varchar(50) NOT NULL,
  `apellidoE` Varchar(50) NOT NULL,
  `emailE` Varchar(50) NOT NULL,
  `telefono1E` Varchar(15) NOT NULL,
  `telefono2E` Varchar(15) NOT NULL,
  `nombre_nucleos` Varchar(50) NOT NULL
)
;

CREATE INDEX `IX_Relationship23` ON `Empleados` (`nombre_nucleos`)
;

ALTER TABLE `Empleados` ADD PRIMARY KEY (`identificacionE`)
;

-- Table Vehiculos_Motor

CREATE TABLE `Vehiculos_Motor`
(
  `cod_vehiculos` Varchar(10) NOT NULL,
  `placa` Varchar(10) NOT NULL,
  `modeloV` Varchar(50) NOT NULL,
  `marcaV` Varchar(20) NOT NULL,
  `colorV` Varchar(20) NOT NULL,
  `tipoV` Varchar(20) NOT NULL,
  `identificacionT` Char(15) NOT NULL
)
;

ALTER TABLE `Vehiculos_Motor` ADD PRIMARY KEY (`cod_vehiculos`,`identificacionT`)
;

-- Table Vuelos

CREATE TABLE `Vuelos`
(
  `cod_vuelos` Varchar(20) NOT NULL,
  `hora_salida` Time NOT NULL,
  `hora_llegada` Time NOT NULL,
  `hora_estimada_S` Time NOT NULL,
  `hora_estimada_LL` Time NOT NULL,
  `hora_retraso` Time,
  `descripcion_retraso` Varchar(100),
  `fecha_llegada` Date NOT NULL,
  `fecha_salida` Date NOT NULL,
  `identificacionT` Char(15) NOT NULL
)
;

ALTER TABLE `Vuelos` ADD PRIMARY KEY (`cod_vuelos`,`identificacionT`)
;

-- Table Recargas

CREATE TABLE `Recargas`
(
  `identificacionC` Varchar(15) NOT NULL,
  `identificacionE` Varchar(10) NOT NULL,
  `fecha_recarga` Datetime NOT NULL,
  `saldo_recarga` Float NOT NULL
)
;

ALTER TABLE `Recargas` ADD PRIMARY KEY (`identificacionC`,`identificacionE`,`fecha_recarga`)
;

-- Table Paquetes

CREATE TABLE `Paquetes`
(
  `cod_paquete` Varchar(10) NOT NULL,
  `peso_paq` Float NOT NULL,
  `alto_paq` Float NOT NULL,
  `ancho_paq` Float NOT NULL,
  `profundidad` Float NOT NULL,
  `cod_destino` Varchar(10) NOT NULL
)
;

ALTER TABLE `Paquetes` ADD PRIMARY KEY (`cod_paquete`,`cod_destino`)
;

-- Table Paises

CREATE TABLE `Paises`
(
  `cod_pais` Varchar(10) NOT NULL,
  `nombre_pais` Varchar(40) NOT NULL
)
;

ALTER TABLE `Paises` ADD PRIMARY KEY (`cod_pais`)
;

-- Table Estados

CREATE TABLE `Estados`
(
  `cod_estados` Varchar(10) NOT NULL,
  `nombre_estados` Varchar(50) NOT NULL,
  `cod_pais` Varchar(10) NOT NULL
)
;

ALTER TABLE `Estados` ADD PRIMARY KEY (`cod_estados`,`cod_pais`)
;

-- Table Ciudades

CREATE TABLE `Ciudades`
(
  `cod_ciudades` Varchar(10) NOT NULL,
  `nombre_ciudades` Varchar(50) NOT NULL,
  `cod_estados` Varchar(10) NOT NULL,
  `cod_pais` Varchar(10) NOT NULL
)
;

ALTER TABLE `Ciudades` ADD PRIMARY KEY (`cod_ciudades`,`cod_estados`,`cod_pais`)
;

-- Table Solicitan

CREATE TABLE `Solicitan`
(
  `identificacionT` Char(15) NOT NULL,
  `cod_encomienda` Varchar(10) NOT NULL
)
;

ALTER TABLE `Solicitan` ADD PRIMARY KEY (`identificacionT`,`cod_encomienda`)
;

-- Create foreign keys (relationships) section ------------------------------------------------- 


ALTER TABLE `Recargas` ADD CONSTRAINT `Realiza` FOREIGN KEY (`identificacionC`) REFERENCES `Clientes` (`identificacionC`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Recargas` ADD CONSTRAINT `Confirma` FOREIGN KEY (`identificacionE`) REFERENCES `Empleados` (`identificacionE`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Estados` ADD CONSTRAINT `Posee` FOREIGN KEY (`cod_pais`) REFERENCES `Paises` (`cod_pais`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Ciudades` ADD CONSTRAINT `Existen` FOREIGN KEY (`cod_estados`, `cod_pais`) REFERENCES `Estados` (`cod_estados`, `cod_pais`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Cursos` ADD CONSTRAINT `Relationship13` FOREIGN KEY (`cod_ciudades`, `cod_estados`, `cod_pais`) REFERENCES `Ciudades` (`cod_ciudades`, `cod_estados`, `cod_pais`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Transportistas` ADD CONSTRAINT `Cursa` FOREIGN KEY (`codigo_curso`) REFERENCES `Cursos` (`codigo_curso`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Encomiendas` ADD CONSTRAINT `Transporta` FOREIGN KEY (`identificacionT`) REFERENCES `Transportistas` (`identificacionT`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Encomiendas` ADD CONSTRAINT `Envia` FOREIGN KEY (`identificacionC`) REFERENCES `Clientes` (`identificacionC`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Paquetes` ADD CONSTRAINT `Es_formada` FOREIGN KEY (`cod_destino`) REFERENCES `Encomiendas` (`cod_encomienda`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Detalles_Art` ADD CONSTRAINT `Contiene` FOREIGN KEY (`cod_paquete`, `cod_encomienda`) REFERENCES `Paquetes` (`cod_paquete`, `cod_destino`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Cursos` ADD CONSTRAINT `Dicta` FOREIGN KEY (`nombre_nucleos`) REFERENCES `Nucleos` (`nombre_nucleos`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Vehiculos_Motor` ADD CONSTRAINT `Dispone_de` FOREIGN KEY (`identificacionT`) REFERENCES `Transportistas` (`identificacionT`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Vuelos` ADD CONSTRAINT `Se_traslada` FOREIGN KEY (`identificacionT`) REFERENCES `Transportistas` (`identificacionT`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Empleados` ADD CONSTRAINT `Trabaja` FOREIGN KEY (`nombre_nucleos`) REFERENCES `Nucleos` (`nombre_nucleos`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Nucleos` ADD CONSTRAINT `Se_encarga` FOREIGN KEY (`identificacionE`) REFERENCES `Empleados` (`identificacionE`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Transportistas` ADD CONSTRAINT `Se_registro` FOREIGN KEY (`nombre_nucleos`) REFERENCES `Nucleos` (`nombre_nucleos`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Nucleos` ADD CONSTRAINT `Se_encuentra` FOREIGN KEY (`cod_ciudades`, `cod_estados`, `cod_pais`) REFERENCES `Ciudades` (`cod_ciudades`, `cod_estados`, `cod_pais`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Encomiendas` ADD CONSTRAINT `Se_envia` FOREIGN KEY (`cod_ciudades`, `cod_estados`, `cod_pais`) REFERENCES `Ciudades` (`cod_ciudades`, `cod_estados`, `cod_pais`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Transportistas` ADD CONSTRAINT `Reside_en` FOREIGN KEY (`cod_ciudades`, `cod_estados`, `cod_pais`) REFERENCES `Ciudades` (`cod_ciudades`, `cod_estados`, `cod_pais`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Clientes` ADD CONSTRAINT `Reside` FOREIGN KEY (`cod_ciudades`, `cod_estados`, `cod_pais`) REFERENCES `Ciudades` (`cod_ciudades`, `cod_estados`, `cod_pais`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Solicitan` ADD CONSTRAINT `Solicitan_una` FOREIGN KEY (`identificacionT`) REFERENCES `Transportistas` (`identificacionT`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Solicitan` ADD CONSTRAINT `Es_solicitada` FOREIGN KEY (`cod_encomienda`) REFERENCES `Encomiendas` (`cod_encomienda`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Encomiendas` ADD CONSTRAINT `Gestiona` FOREIGN KEY (`identificacionE`) REFERENCES `Empleados` (`identificacionE`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


