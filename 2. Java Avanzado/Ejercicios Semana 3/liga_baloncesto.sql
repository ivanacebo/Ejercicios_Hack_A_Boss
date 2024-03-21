-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-03-2024 a las 20:52:37
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `liga_baloncesto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `ID` bigint(20) NOT NULL,
  `CIUDAD` varchar(255) DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`ID`, `CIUDAD`, `NOMBRE`) VALUES
(1, 'Madrid', 'Real Madrid'),
(2, 'Barcelona', 'F. C. Barcelona'),
(3, 'Oviedo', 'Real Oviedo'),
(4, 'Bilbao', 'Atletic Bilbao');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partido`
--

CREATE TABLE `partido` (
  `ID` bigint(20) NOT NULL,
  `FECHA` datetime DEFAULT NULL,
  `RESULTADOEQUIPOLOCAL` int(11) DEFAULT NULL,
  `RESULTADOEQUIPOVISITANTE` int(11) DEFAULT NULL,
  `EQUIPOLOCAL_ID` bigint(20) DEFAULT NULL,
  `EQUIPOVISITANTE_ID` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `partido`
--

INSERT INTO `partido` (`ID`, `FECHA`, `RESULTADOEQUIPOLOCAL`, `RESULTADOEQUIPOVISITANTE`, `EQUIPOLOCAL_ID`, `EQUIPOVISITANTE_ID`) VALUES
(1, '2024-01-15 23:03:00', 98, 58, 1, 2),
(2, '2024-01-08 23:03:00', 78, 76, 3, 2),
(3, '2024-01-01 23:03:00', 79, 86, 4, 3),
(4, '2024-01-22 23:03:00', 108, 107, 3, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `partido`
--
ALTER TABLE `partido`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_PARTIDO_EQUIPOLOCAL_ID` (`EQUIPOLOCAL_ID`),
  ADD KEY `FK_PARTIDO_EQUIPOVISITANTE_ID` (`EQUIPOVISITANTE_ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `partido`
--
ALTER TABLE `partido`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `partido`
--
ALTER TABLE `partido`
  ADD CONSTRAINT `FK_PARTIDO_EQUIPOLOCAL_ID` FOREIGN KEY (`EQUIPOLOCAL_ID`) REFERENCES `equipo` (`ID`),
  ADD CONSTRAINT `FK_PARTIDO_EQUIPOVISITANTE_ID` FOREIGN KEY (`EQUIPOVISITANTE_ID`) REFERENCES `equipo` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
