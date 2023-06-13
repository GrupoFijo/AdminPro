-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 13-06-2023 a las 17:09:30
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
-- Estructura de tabla para la tabla `detalleventas`
--

DROP TABLE IF EXISTS `detalleventas`;
CREATE TABLE IF NOT EXISTS `detalleventas` (
  `idDetalle` int NOT NULL AUTO_INCREMENT,
  `precio_unit` decimal(5,2) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `Producto_idProducto` int NOT NULL,
  `Venta_idVenta` int NOT NULL,
  PRIMARY KEY (`idDetalle`,`Producto_idProducto`,`Venta_idVenta`),
  KEY `fk_DetalleVentas_Producto_idx` (`Producto_idProducto`),
  KEY `fk_DetalleVentas_Venta1_idx` (`Venta_idVenta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalleventas`
--
ALTER TABLE `detalleventas`
  ADD CONSTRAINT `fk_DetalleVentas_Producto` FOREIGN KEY (`Producto_idProducto`) REFERENCES `producto` (`idProducto`),
  ADD CONSTRAINT `fk_DetalleVentas_Venta1` FOREIGN KEY (`Venta_idVenta`) REFERENCES `venta` (`idVenta`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `fk_Venta_Trabajador1` FOREIGN KEY (`Trabajador_idTrabajador`) REFERENCES `trabajador` (`idTrabajador`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
