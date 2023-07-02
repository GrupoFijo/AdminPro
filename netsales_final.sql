-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 02-07-2023 a las 22:08:37
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `netsales`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleventa`
--

DROP TABLE IF EXISTS `detalleventa`;
CREATE TABLE IF NOT EXISTS `detalleventa` (
  `idDetalle` int NOT NULL AUTO_INCREMENT,
  `precio_unit` decimal(5,2) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `cantidad` int NOT NULL,
  `idProd` int NOT NULL,
  `idVenta` int NOT NULL,
  PRIMARY KEY (`idDetalle`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalleventa`
--

INSERT INTO `detalleventa` (`idDetalle`, `precio_unit`, `descripcion`, `cantidad`, `idProd`, `idVenta`) VALUES
(1, '1.20', 'pan', 1, 0, 22),
(2, '2.00', 'Arroz', 1, 1001, 23),
(3, '1.20', 'pan', 2, 1000, 23);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
  `idProducto` int NOT NULL,
  `cantidad` int NOT NULL,
  `precio` decimal(3,2) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `disponible` tinyint NOT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `cantidad`, `precio`, `descripcion`, `disponible`) VALUES
(1000, 20, '1.20', 'pan', 1),
(1001, 3, '2.00', 'Arroz', 1),
(1002, 3, '2.00', '1', 1),
(1003, 3, '2.00', '12', 1),
(1004, 3, '2.00', '12', 1),
(1005, 2, '3.00', '1', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajador`
--

DROP TABLE IF EXISTS `trabajador`;
CREATE TABLE IF NOT EXISTS `trabajador` (
  `idTrabajador` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `edad` int NOT NULL,
  `contrasenia` varchar(8) NOT NULL,
  `usuario` varchar(12) NOT NULL,
  `activo` tinyint NOT NULL,
  `sueldo` float NOT NULL,
  `comision` int NOT NULL,
  `total` int NOT NULL,
  PRIMARY KEY (`idTrabajador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `trabajador`
--

INSERT INTO `trabajador` (`idTrabajador`, `nombre`, `apellido`, `edad`, `contrasenia`, `usuario`, `activo`, `sueldo`, `comision`, `total`) VALUES
(0, 'Antonio', 'Vargas Vega', 20, '123456', 'Antony20', 1, 2000, 25, 2100),
(1, 'Jose', 'Capcha', 18, 'joca18', 'JoseCapcha', 1, 500, 1, 502);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

DROP TABLE IF EXISTS `venta`;
CREATE TABLE IF NOT EXISTS `venta` (
  `idVenta` int NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `cliente` varchar(45) NOT NULL,
  `total` decimal(5,2) NOT NULL,
  `Trabajador_idTrabajador` int NOT NULL,
  PRIMARY KEY (`idVenta`),
  KEY `fk_Venta_Trabajador1_idx` (`Trabajador_idTrabajador`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idVenta`, `fecha`, `cliente`, `total`, `Trabajador_idTrabajador`) VALUES
(1, '2023-07-02', 'Daniel ', '6.20', 0),
(2, '2023-07-02', 'Dani2', '7.40', 0),
(3, '2023-07-02', '1123', '1.20', 0),
(4, '2023-07-02', '123456', '1.20', 0),
(5, '2023-07-02', '1213', '1.20', 0),
(6, '2023-07-02', '11234', '3.20', 0),
(7, '2023-07-02', '123', '1.20', 0),
(8, '2023-07-02', '11234', '1.20', 0),
(9, '2023-07-02', '123456', '1.20', 0),
(10, '2023-07-02', '1', '1.20', 0),
(11, '2023-07-02', '1', '1.20', 0),
(12, '2023-07-02', '1', '1.20', 0),
(13, '2023-07-02', '1', '1.20', 0),
(14, '2023-07-02', '1', '1.20', 0),
(15, '2023-07-02', '1', '1.20', 0),
(16, '2023-07-02', '1', '1.20', 0),
(17, '2023-07-02', '1', '1.20', 0),
(18, '2023-07-02', '1', '1.20', 0),
(19, '2023-07-02', '1', '1.20', 0),
(20, '2023-07-02', '123', '1.20', 0),
(21, '2023-07-02', '12', '1.20', 0),
(22, '2023-07-02', 'ultimo', '1.20', 0),
(23, '2023-07-02', 'Dani', '4.40', 1);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `fk_Venta_Trabajador1` FOREIGN KEY (`Trabajador_idTrabajador`) REFERENCES `trabajador` (`idTrabajador`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
