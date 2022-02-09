/*Table structure for table `Ciudades` */

CREATE TABLE `Ciudades` (
  `cod_ciudades` varchar(10) NOT NULL,
  `nombre_ciudades` varchar(50) NOT NULL,
  `cod_estados` varchar(10) NOT NULL,
  `cod_pais` varchar(10) NOT NULL,
)

/*Table structure for table `Clientes` */

CREATE TABLE `Clientes` (
  `identificacionC` varchar(15) NOT NULL,
  `nacionalidadC` char(1) NOT NULL,
  `nombreC` varchar(50) NOT NULL,
  `apellidoC` varchar(50) NOT NULL,
  `emailC` varchar(50) NOT NULL,
  `telefono1C` varchar(20) NOT NULL,
  `telefono2C` varchar(20) DEFAULT NULL,
  `saldoC` float NOT NULL,
  `cod_ciudades` varchar(10) DEFAULT NULL,
  `cod_estados` varchar(10) DEFAULT NULL,
  `cod_pais` varchar(10) DEFAULT NULL,
)
/*Table structure for table `Cursos` */

CREATE TABLE `Cursos` (
  `codigo_curso` varchar(10) NOT NULL,
  `fecha_curso` date NOT NULL,
  `cod_ciudades` varchar(10) NOT NULL,
  `cod_estados` varchar(10) NOT NULL,
  `cod_pais` varchar(10) NOT NULL,
  `nombre_nucleos` varchar(50) NOT NULL,
)

/*Table structure for table `Detalles_Art` */

CREATE TABLE `Detalles_Art` (
  `nombreArt` varchar(50) NOT NULL,
  `cantidad_art` int(11) NOT NULL,
  `precio_art` float NOT NULL,
  `cod_paquete` varchar(10) NOT NULL,
  `cod_encomienda` varchar(10) NOT NULL,
)

/*Table structure for table `Empleados` */

CREATE TABLE `Empleados` (
  `identificacionE` varchar(10) NOT NULL,
  `nombreE` varchar(50) NOT NULL,
  `apellidoE` varchar(50) NOT NULL,
  `emailE` varchar(50) NOT NULL,
  `telefono1E` varchar(15) NOT NULL,
  `telefono2E` varchar(15) NOT NULL,
  `nombre_nucleos` varchar(50) NOT NULL,
)

/*Table structure for table `Encomiendas` */

CREATE TABLE `Encomiendas` (
  `cod_encomienda` varchar(10) NOT NULL,
  `estatusE` char(1) NOT NULL,
  `distancia_recorrida` float NOT NULL,
  `precio_peso` float NOT NULL,
  `precio_total` float NOT NULL,
  `identificacionT` char(15) DEFAULT NULL,
  `identificacionC` varchar(15) NOT NULL,
  `identificacionE` varchar(10) NOT NULL,
  `cod_ciudades` varchar(10) NOT NULL,
  `cod_estados` varchar(10) NOT NULL,
  `cod_pais` varchar(10) NOT NULL,
)

/*Table structure for table `Estados` */

CREATE TABLE `Estados` (
  `cod_estados` varchar(10) NOT NULL,
  `nombre_estados` varchar(50) NOT NULL,
)

/*Table structure for table `Nucleos` */

CREATE TABLE `Nucleos` (
  `nombre_nucleos` varchar(50) NOT NULL,
  `num_telefonoN` varchar(15) NOT NULL,
  `identificacionE` varchar(10) DEFAULT NULL,
  `cod_ciudades` varchar(10) NOT NULL,
  `cod_estados` varchar(10) NOT NULL,
  `cod_pais` varchar(10) NOT NULL,
)

/*Table structure for table `Paises` */

CREATE TABLE `Paises` (
  `cod_pais` varchar(10) NOT NULL,
  `nombre_pais` varchar(40) NOT NULL,
)

/*Table structure for table `Paquetes` */

CREATE TABLE `Paquetes` (
  `cod_paquete` varchar(10) NOT NULL,
  `peso_paq` float NOT NULL,
  `alto_paq` float NOT NULL,
  `ancho_paq` float NOT NULL,
  `profundidad` float NOT NULL,
  `cod_destino` varchar(10) NOT NULL,
)

/*Table structure for table `Recargas` */

CREATE TABLE `Recargas` (
  `identificacionC` varchar(15) NOT NULL,
  `identificacionE` varchar(10) NOT NULL,
  `fecha_recarga` datetime NOT NULL,
  `saldo_recarga` float NOT NULL,
)

/*Table structure for table `Solicitan` */

CREATE TABLE `Solicitan` (
  `identificacionT` char(15) NOT NULL,
  `cod_encomienda` varchar(10) NOT NULL,
)

/*Table structure for table `Transportistas` */

CREATE TABLE `Transportistas` (
  `identificacionT` char(15) NOT NULL,
  `nacionalidadT` char(1) NOT NULL,
  `nombreT` varchar(50) NOT NULL,
  `apellidoT` varchar(50) NOT NULL,
  `emailT` varchar(50) NOT NULL,
  `telefono1T` varchar(15) NOT NULL,
  `telefono2T` varchar(15) DEFAULT NULL,
  `lic_conducirT` char(1) NOT NULL,
  `fecha_ingreso` date NOT NULL,
  `antecedentes_penalesT` varchar(1000) NOT NULL,
  `pedidos_realizadosT` int(11) NOT NULL,
  `horarioT` varchar(200) NOT NULL,
  `saldoT` char(20) NOT NULL,
  `codigo_curso` varchar(10) NOT NULL,
  `nombre_nucleos` varchar(50) NOT NULL,
  `cod_ciudades` varchar(10) NOT NULL,
  `cod_estados` varchar(10) NOT NULL,
  `cod_pais` varchar(10) NOT NULL,
)

/*Table structure for table `Vehiculos_Motor` */

CREATE TABLE `Vehiculos_Motor` (
  `cod_vehiculos` varchar(10) NOT NULL,
  `placa` varchar(10) NOT NULL,
  `modeloV` varchar(50) NOT NULL,
  `marcaV` varchar(20) NOT NULL,
  `colorV` varchar(20) NOT NULL,
  `tipoV` varchar(20) NOT NULL,
  `identificacionT` char(15) NOT NULL,
)

/*Table structure for table `Vuelos` */

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
)
