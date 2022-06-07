-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 07-06-2022 a las 20:13:13
-- Versión del servidor: 5.7.36
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `jobber`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id_usuario` int(10) NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `correo_usuario` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `contrasena_usuario` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombre_usuario`, `correo_usuario`, `contrasena_usuario`) VALUES
(1, 'Sabri', 'saabb.tod@gmail.com', '84b0a83ce223f8f419a4cd12ee6d77a8'),
(2, 'Kalaitos', 'kalaitos@gmail.com', '151fe8012259b4a254595ad334e0f269'),
(3, 'AndresBless', 'andresbless@yahoo.es', 'f3b1a7dc134ed9259735eb3cd1fba4fe'),
(4, 'Adrian', 'adrianmrv@gmail.com', 'bef27466a245ce3ec692bd25409c2549'),
(9, 'aguacate', 'aguacate@gmail.es', '4eeffaf6a2d5ad47ba7966283b7ab'),
(7, 'limon', 'limon@gmail.com', '3019fe416015554b2d24dc38935c1');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
