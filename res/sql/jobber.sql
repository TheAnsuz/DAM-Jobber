-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 08-06-2022 a las 22:08:42
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
CREATE DATABASE IF NOT EXISTS `jobber` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci;
USE `jobber`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleo`
--

DROP TABLE IF EXISTS `empleo`;
CREATE TABLE IF NOT EXISTS `empleo` (
  `id_empleo` int(10) NOT NULL AUTO_INCREMENT,
  `titulo_empleo` varchar(500) COLLATE utf8_spanish2_ci NOT NULL,
  `descripcion_empleo` varchar(3000) COLLATE utf8_spanish2_ci NOT NULL,
  `localidad_empleo` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `fuente_empleo` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `url_empleo` varchar(200) COLLATE utf8_spanish2_ci NOT NULL,
  `provincia_empleo` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  PRIMARY KEY (`id_empleo`)
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `empleo`
--

INSERT INTO `empleo` (`id_empleo`, `titulo_empleo`, `descripcion_empleo`, `localidad_empleo`, `fuente_empleo`, `url_empleo`, `provincia_empleo`) VALUES
(1, 'Técnico/a de Comunicación Audiovisual para CNIEH en Burgos', '\"<p><strong>Convoca: </strong>Centro Nacional de Investigación sobre la Evolución Humana</p><p><strong>Cuerpo: </strong>TÉCNICO/A PARA LA UNIDAD DE CULTURA CIENTÍFICA Y DE LA INNOVACIÓN (UCC+I)</p><p><strong>Plazas:</strong> 1 (Temporal)</p><p><strong>Acceso: </strong>Concurso de Méritos</p><p><strong>Requisitos:</strong> Grado Universitario de Comunicación Audiovisual o similar. Nivel medio de Inglés oral y escrito. Ofimática avanzada, diseño gráfico y producción multimedia: Photoshop, Illustrator, Premier, In Design, Blender y 3DVista. Carnet de conducir tipo B.</p><p><strong>Plazo: </strong>13 de junio de 2022</p><p><strong>Observaciones:</strong> Incorporación inmediata</p><p><strong>Información obtenida de: </strong>Empleo público. <ahref=\"\"http://www.cenieh.es\"\"target=\"\"_blank\"\">http://www.cenieh.es</a></p><p><strong>Enlaces relacionados:</strong><ul><li><a href=\"\"https://www.cenieh.es/sobre-el-cenieh/empleo/022022-ucci\"\" target=\"\"_blank\"\">Consultar Bases y solicitud</a></li></ul></p>\"', 'Burgos', 'Organismo oficial', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285177057836/Empleo\r\n', 'Burgos'),
(2, 'Bolsa de Auxiliar de Régimen Interior para Diputación de Valladolid\r\n', '\"<p><strong>Convoca:</strong> Diputación de Valladolid</p>\r\n<p><strong>Cuerpo: </strong>AUXILIAR DE RÉGIMEN INTERIOR</p>\r\n<p><strong>Plazas:</strong> Bolsa de empleo</p>\r\n<p><strong>Acceso:</strong> Concurso-Oposición</p>\r\n<p><strong>Titulación:</strong> no se especifica</p>\r\n<p><strong>Plazo:</strong> 21 de junio de 2022</p>\r\n<p><strong>Observaciones:</strong> Para las categorías de Auxiliar de Régimen Interior y Auxiliar de Régimen Interior a jornada partida</p><p><strong>Información obtenida de: </strong>Empleo público. BOP Valladolid 07/06/2022</p><p><strong>Enlaces relacionados:</strong><ul><li><a href=\"\"https://bop.sede.diputaciondevalladolid.es/boletines/2022/junio/07/BOPVA-A-2022-02018.pdf\"\" target=\"\"_blank\"\">Consultar Bases en BOP Valladolid 07/06/2022</a></li></ul></p>\"\r\n', 'Valladolid', 'Organismo oficial\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285177047670/Empleo\r\n', 'Valladolid\r\n'),
(3, 'Interinidad de Técnico/a de Administración General en Ayto. de Medina del Campo (Valladolid)\r\n', '\"<p><strong>Convoca:</strong> Ayuntamiento de Medina del Campo</p>\r\n<p><strong>Cuerpo: </strong>TÉCNICO/A DE ADMINISTRACIÓN GENERAL</p>\r\n<p><strong>Plazas: </strong>1 (Interinidad) y bolsa de empleo</p>\r\n<p><strong>Acceso: </strong>Concurso-Oposición</p>\r\n<p><strong>Titulación:</strong> Licenciatura o Grado en Derecho</p>\r\n<p><strong>Plazo: </strong>14 de junio de 2022</p><p><strong>Información obtenida de: </strong>Empleo público. BOCYL 07/06/2022</p><p><strong>Enlaces relacionados:</strong><ul><li><a href=\"\"https://bocyl.jcyl.es/boletines/2022/06/07/pdf/BOCYL-D-07062022-22.pdf\"\" target=\"\"_blank\"\">Consultar Bases en BOCYL 07/06/2022</a></li></ul></p>\"\r\n', 'Medina del Campo\r\n', 'Organismo oficial\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285177047245/Empleo\r\n', 'Valladolid\r\n'),
(4, 'TERAPEUTAS OCUPACIONALES\r\n', '<p>Se necesita terapeuta ocupacional en centro residencial de Peleagonzalo (Zamora). Contrato indefinido, interesados remitir CV a ecyltoro@jcyl.es. Asunto \"terapeuta ocupacional 8633\"</p><p>Para más información acuda a <a href=\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287958\">Oficina Virtual</a></p>\r\n', 'Toro\r\n', 'ECYL\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176966594/Empleo\r\n', 'Zamora\r\n'),
(5, 'MONITORES DE EDUCACIÓN Y TIEMPO LIBRE\r\n', '\"<p>PUESTO SOLICITADO: Monitor/a de ocio y tiempo libre para programa de madrugadores del próximo curso escolar.\r\nLOCALIDAD: Lerma (Burgos).\r\nREQUISITOS: Título de monitor de ocio y tiempo libre o equivalente.\r\nSE OFRECE: Contrato de 7:30 a 9:00, de lunes a viernes, durante el curso escolar.</p><p>Para más información acuda a <a href=\"\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287967\"\">Oficina Virtual</a></p>\"\r\n', 'Lerma\r\n', 'ECYL\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176906192/Empleo\r\n', 'Burgos\r\n'),
(6, 'EDUCADORES SOCIALES\r\n', '\"<p>CENTRO DE MENORES EN VALLADOLID DEPENDIENTE DE LA GSS \r\nHORARIO : TURNOS (MAÑANA Y TARDE)\r\nJORNADA: COMPLETA</p><p>Para más información acuda a <a href=\"\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287906\"\">Oficina Virtual</a></p>\"\r\n', 'Valladolid\r\n', 'ECYL\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176837349/Empleo\r\n', 'Valladolid\r\n'),
(7, 'CONDUCTORES-OPERADORES DE GRÚA TORRE\r\n', '<p>OPERADOR GRUA TORRE. Imprescindible carnet de grua torre en vigor y carnet b, para contrato fijo de obra en Arroyo de la Encomienda. Interesados incorporarse a la oferta en a oficina virtual</p><p>Para más información acuda a <a href=\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287464\">Oficina Virtual</a></p>\r\n', 'Arroyo de la Encomienda\r\n', 'ECYL\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176693037/Empleo\r\n', 'Valladolid\r\n'),
(8, 'INSTALADORES ELECTRICISTAS, EN GENERAL\r\n', '<p>Para más información acuda a <a href=\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287908\">Oficina Virtual</a></p>\r\n', 'Cuéllar\r\n', 'ECYL\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176692850/Empleo\r\n', 'Segovia\r\n'),
(9, 'AUXILIARES DE ENFERMERÍA\r\n', '\"<p>SE NECESITAN AUXILIARES DE ENFERMERÍA PARA RESIDENCIA DE PERSONAS MAYORES EN VILLASANA DE MENA (BURGOS)\r\nINTERESADOS/AS LLAMAR AL 639139086 LUCÍA</p><p>Para más información acuda a <a href=\"\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287898\"\">Oficina Virtual</a></p>\"\r\n', 'Valle de Mena\r\n', 'ECYL\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176692720/Empleo\r\n', 'Burgos\r\n'),
(10, 'ASISTENTES DOMICILIARIOS\r\n', '\"<p>SE NECESITA AUXILIAR DE AYUDA A DOMIICLIO EN LA ZONA DE MERINDAD DE SOTOSCUEVA (BURGOS)\r\nINTERESADOS/AS ENVIAR CV A ssecos@seniorsi.es</p><p>Para más información acuda a <a href=\"\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287897\"\">Oficina Virtual</a></p>\"\r\n', 'Merindad de Sotoscueva\r\n', 'ECYL\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176658747/Empleo\r\n', 'Burgos\r\n'),
(11, 'CAMAREROS, EN GENERAL\r\n', '<p>Para más información acuda a <a href=\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287892\">Oficina Virtual</a></p>\r\n', 'Cervera de Pisuerga\r\n', 'ECYL\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176547518/Empleo\r\n', 'Palencia\r\n'),
(12, 'CAMAREROS, EN GENERAL\r\n', '<p>OFERTA 8566 CAMARERO/A PARA BOÑAR. CONTRATO TEMPORAL Y JORNADA COMPLETA. IMPRESCINDIBLE ESTUDIOS PRIMARIOS Y EXPERIENCIA. INTERESADOS/AS PONERSE EN CONTACTO CON LA OFICINA DE LA SERNA. TLFN 987215200</p><p>Para más información acuda a <a href=\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287891\">Oficina Virtual</a></p>\r\n', 'Boñar\r\n', 'ECYL\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176523229/Empleo\r\n', 'León\r\n'),
(13, 'ARQUITECTOS TÉCNICOS\r\n', '\"<p>No necesaria experiencia. \r\nMenor de 40 años.\r\nPreferiblemente hombre. Carnet de conducir.\r\nContrato temporal con posibilidad de indefinido a jornada completa en León ciudad.\r\nMas información en teléfono 987 249 530</p><p>Para más información acuda a <a href=\"\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287912\"\">Oficina Virtual</a></p>\"\r\n', 'León\r\n', 'ECYL\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176693139/Empleo\r\n', 'León\r\n'),
(14, 'ESTETICISTAS\r\n', '\"<p>Oferta nº 8579 de ESTETICISTA para centro de estética de Zamora. Interesados enviar el cv a ecyldoctorfleming.ofertas@jcyl.es (indicando en el asunto el número de oferta).\r\nFunciones: Realización de tratamientos faciales, tratamientos corporales, manicuras, estética del pie, manejo de distintos equipos etc.\r\nCondiciones: Contrato de 30 horas semanales. De Lunes a sábados ambos incluidos. El horario sería De mañanas (de 9:30 a 14:00) o de tardes de 15:30 a 20:30 horas. Contrato de 6 meses (siendo el primer mes de prueba) ampliable.\r\nRequisitos: Técnico Superior de estética y al menos 12 meses de experiencia.</p><p>Para más información acuda a <a href=\"\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287904\"\">Oficina Virtual</a></p>\"\r\n', 'Zamora\r\n', 'ECYL\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176692664/Empleo\r\n', 'Zamora\r\n'),
(15, 'ECONOMISTAS\r\n', '\"<p>EL CENIEH NECESITA 1 GESTOR DE PROYECTO DE INVESTIGACION. EL PERFIL PROFESIONAL, LAS CONDICIONES LABORALES Y LA DESCRIPCION DEL PROCESO DE SELECCION SE DESCRIBEN EN EL SIGUIENTE LINK: https://www.cenieh.es/sobre-el-cenieh/empleo/052022-erc-2021-adg-tied2teeth-project-m\r\nEL PLAZO DE PRESENTACION PERMANECERA ABIERTO HASTA EL 1 DE JULIO DE 2022 INCLUSIVE, HASTA LAS 15 HORAS. MUCHAS GRACIAS.</p><p>Para más información acuda a <a href=\"\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287884\"\">Oficina Virtual</a></p>\"\r\n', 'Burgos\r\n', 'ECYL\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176459582/Empleo\r\n', 'Burgos\r\n'),
(16, 'ANTROPÓLOGOS\r\n', '\"<p>EL CENIEH SOLICITA 3 INVESTIGADORES POSTDOCTORALES. LAS BASES DE LA CONVOCATORIA, ASI COMO LOS REQUISITOS Y PROCESO DE SELECCION ESTÁN DESCRITOS EN :https://www.cenieh.es/sobre-el-cenieh/empleo/042022-erc-2021-adg-tied2teeth \r\nEL PLAZO DE PRESENTACION PERMANECERA ABIERTO HASTA EL 1 DE JULIO DE 2022 INCLUSIVE, HASTA LAS 15 HORAS, HORA EN ESPAÑA.</p><p>Para más información acuda a <a href=\"\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287855\"\">Oficina Virtual</a></p>\"\r\n', 'Burgos\r\n', 'ECYL\r\n ', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176402668/Empleo\r\n', 'Burgos\r\n'),
(17, 'ENCARGADOS DE TIENDA\r\n', '<p>Para más información acuda a <a href=\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287863\">Oficina Virtual</a></p>\r\n', 'Carrión de los Condes\r\n', 'ECYL\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176402095/Empleo\r\n', 'Palencia\r\n'),
(18, '3 Socorristas para Ayto. de La Fuente de San Esteban (Salamanca)\r\n', '\"<p><strong>Convoca: </strong>Ayuntamiento de La Fuente de San Esteban</p>\r\n<p><strong>Cuerpo: </strong>SOCORRISTA</p>\r\n<p><strong>Plazas: </strong>3 (Fijo Discontinuo) y bolsa de empleo</p>\r\n<p><strong>Acceso:</strong> Concurso de méritos</p>\r\n<p><strong>Titulación:</strong> Título de Socorrismo habilitante para desempeñar el puesto de trabajo de Socorrista en piscinas públicas</p>\r\n<p><strong>Plazo:</strong> 16 de junio de 2022</p><p><strong>Información obtenida de: </strong>Empleo público. BOP Salamanca 06/06/2022</p><p><strong>Enlaces relacionados:</strong><ul><li><a href=\"\"https://lafuentedesanesteban.sedelectronica.es/info.0\"\" target=\"\"_blank\"\">Consultar Bases en sede electrónica municipal</a></li><li><a href=\"\"https://sede.diputaciondesalamanca.gob.es/documentacion/bop/2022/20220606/BOP-SA-20220606-018.pdf\"\" target=\"\"_blank\"\">Consultar Anuncio en BOP Salamanca 06/06/2022</a></li></ul></p>\"\r\n', 'Fuente de San Esteban (La)\r\n', 'Organismo oficial\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176394965/Empleo\r\n', 'Salamanca\r\n'),
(19, '2 Socorristas para Ayto. de Castrillo de Don Juan (Palencia)\r\n', '\"<p><strong>Convoca:</strong> Ayuntamiento de Castrillo de Don Juan</p>\r\n<p><strong>Cuerpo:</strong> SOCORRISTA</p>\r\n<p><strong>Plazas:</strong> 2 (Temporal) y bolsa de empleo</p>\r\n<p><strong>Acceso:</strong> Concurso de méritos</p>\r\n<p><strong>Titulación:</strong> Técnico Superior en Salvamento Acuático</p>\r\n<p><strong>Plazo:</strong> 27 de junio de 2022</p>\r\n<p><strong>Observaciones:</strong> Para las piscinas municipales durante la temporada estival, desde 1/7/22 a 31/8/22.</p><p><strong>Información obtenida de: </strong>Empleo público. BOP Palencia 06/06/2022</p><p><strong>Enlaces relacionados:</strong><ul><li><a href=\"\"https://www.diputaciondepalencia.es/system/files/bop/2022/20220606-bop-67-Ordinario.pdf\"\" target=\"\"_blank\"\">Consultar Bases en BOP Palencia 06/06/2022</a></li></ul></p>\"\r\n', 'Castrillo de Don Juan\r\n', 'Organismo oficial\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176370070/Empleo\r\n', 'Palencia\r\n'),
(20, 'PROFESORES DE IDIOMAS, EN GENERAL\r\n', '\"<p>Profesor de Ingles para campamento de verano en Torquemada (Palencia)\r\nDuracion: Mes de Julio\r\nInscritos en ecyl \r\nDesarrollar programa de campamento urbano de verano en inglés. Clases y actividades lúdicas para niños de 3 a 12 años. PAE proporciona el programa y los materiales necesarios para el desarrollo del campamento urbano.\r\nInteresados incorporarse a traves de la oficina virtual</p><p>Para más información acuda a <a href=\"\"http://empleocastillayleon.jcyl.es/oficinavirtual/buscoEmpleoPub.do?srvc=ver&scope=reg&cod=287856\"\">Oficina Virtual</a></p>\"\r\n', 'Torquemada\r\n', 'ECYL\r\n', 'https://empleo.jcyl.es/web/jcyl/Empleo/es/Plantilla100Detalle/1284216458054/OfertasEmpleo/1285176363797/Empleo\r\n', 'Palencia\r\n');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `interesa`
--

DROP TABLE IF EXISTS `interesa`;
CREATE TABLE IF NOT EXISTS `interesa` (
  `id_usuario` int(11) NOT NULL,
  `id_empleo` int(11) NOT NULL,
  `aceptado` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_usuario`,`id_empleo`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

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
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombre_usuario`, `correo_usuario`, `contrasena_usuario`) VALUES
(1, 'Sabri', 'saabb.tod@gmail.com', '84b0a83ce223f8f419a4cd12ee6d77a8'),
(2, 'Kalaitos', 'kalaitos@gmail.com', '151fe8012259b4a254595ad334e0f269'),
(3, 'AndresBless', 'andresbless@yahoo.es', 'f3b1a7dc134ed9259735eb3cd1fba4fe'),
(4, 'Adrian', 'adrianmrv@gmail.com', 'bef27466a245ce3ec692bd25409c2549'),
(9, 'aguacate', 'aguacate@gmail.es', '4eeffaf6a2d5ad47ba7966283b7ab'),
(7, 'limon', 'limon@gmail.com', '3019fe416015554b2d24dc38935c1'),
(11, 'mango', 'mango@gmail.com', 'ebf4f3e5ac5de57f1afb2c861547d8d9');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
