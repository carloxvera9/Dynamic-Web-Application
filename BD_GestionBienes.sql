-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: gestionbienes
-- ------------------------------------------------------
-- Server version	5.6.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `acceso`
--

DROP TABLE IF EXISTS `acceso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `acceso` (
  `id_acceso` int(11) NOT NULL,
  `lvl_acceso` varchar(100) NOT NULL,
  `nom_acceso` varchar(100) NOT NULL,
  `ape_acceso` varchar(100) NOT NULL,
  `login_acceso` varchar(100) NOT NULL,
  `pass_acceso` varchar(100) NOT NULL,
  PRIMARY KEY (`id_acceso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acceso`
--

LOCK TABLES `acceso` WRITE;
/*!40000 ALTER TABLE `acceso` DISABLE KEYS */;
INSERT INTO `acceso` VALUES (1,'Admin','Carlos','Vera','Carlos','Vera'),(2,'User','Oscar','Ledesma','Oscarcito','111'),(3,'User','Daniel','Moreno','Daniel','123'),(4,'User','Fabian','Rojas','Fabi','Fabi');
/*!40000 ALTER TABLE `acceso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bienes`
--

DROP TABLE IF EXISTS `bienes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bienes` (
  `codigo_bien` int(11) NOT NULL AUTO_INCREMENT,
  `descrip_bien` varchar(45) NOT NULL,
  `cantidad_bien` int(11) NOT NULL,
  `nom_provee` varchar(45) NOT NULL,
  `fecha_llegada` date NOT NULL,
  `codigo_ordencompra` int(11) NOT NULL,
  PRIMARY KEY (`codigo_bien`),
  KEY `fk_BIENES_GRR-ORDENDECOMPRA1_idx` (`codigo_ordencompra`),
  CONSTRAINT `fk_BIENES_GRR-ORDENDECOMPRA1` FOREIGN KEY (`codigo_ordencompra`) REFERENCES `grr-ordendecompra` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bienes`
--

LOCK TABLES `bienes` WRITE;
/*!40000 ALTER TABLE `bienes` DISABLE KEYS */;
INSERT INTO `bienes` VALUES (1,'Colchones ',170,'Juan','2019-12-05',1),(5,'Pan BIMBO',700,'Carlos Vera','2020-11-11',1),(6,'Chocolate BOMBOM',900,'Mirco Yucsa','2022-05-10',2),(8,'Maletas',170,'Enrique Iglesias','2022-06-01',3),(12,'Postres',100,'Pinonos SAC','2022-05-10',4);
/*!40000 ALTER TABLE `bienes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grr-ordendecompra`
--

DROP TABLE IF EXISTS `grr-ordendecompra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grr-ordendecompra` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `proveedor` varchar(45) NOT NULL,
  `fecha_compra` date NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `cantidad` varchar(45) NOT NULL,
  `precio` double NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grr-ordendecompra`
--

LOCK TABLES `grr-ordendecompra` WRITE;
/*!40000 ALTER TABLE `grr-ordendecompra` DISABLE KEYS */;
INSERT INTO `grr-ordendecompra` VALUES (1,'Juan','2019-05-01','Repisa de Libros','2',260),(2,'Carlos','2019-05-01','Maletas','14',190),(3,'Mark','2019-05-05','Carruajes','15',250),(4,'Muebles SAC','2022-06-28','Mesas','150',3500),(5,'Pinonos SAC','2022-06-28','Postres','100',50);
/*!40000 ALTER TABLE `grr-ordendecompra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inscripcion_sunarp`
--

DROP TABLE IF EXISTS `inscripcion_sunarp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inscripcion_sunarp` (
  `codigo_inscri` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion_bien` varchar(45) NOT NULL,
  `cantidad_bien` int(11) NOT NULL,
  `precio_bien` double NOT NULL,
  `nom_provee` varchar(45) NOT NULL,
  `fecha_llegada` date NOT NULL,
  PRIMARY KEY (`codigo_inscri`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inscripcion_sunarp`
--

LOCK TABLES `inscripcion_sunarp` WRITE;
/*!40000 ALTER TABLE `inscripcion_sunarp` DISABLE KEYS */;
INSERT INTO `inscripcion_sunarp` VALUES (1,'Repisa de Libros',2,260,'Juan','2019-05-12'),(2,'Postres',100,50,'Pinonos SAC','2022-07-01');
/*!40000 ALTER TABLE `inscripcion_sunarp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu` (
  `id_acceso` int(11) NOT NULL,
  `descrip_menu` varchar(100) NOT NULL,
  `url_menu` varchar(100) NOT NULL,
  `icon_menu` varchar(100) NOT NULL,
  KEY `fkAccesoID` (`id_acceso`),
  CONSTRAINT `fkAccesoID` FOREIGN KEY (`id_acceso`) REFERENCES `acceso` (`id_acceso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,'Bienes','ServletBienes?tipo=LISTAR','bx bx-purchase-tag-alt'),(1,'Guia','ServletGuia?tipo=LISTAR','bx bx-book-content'),(2,'Bienes','ServletBienes?tipo=LISTAR','bx bx-purchase-tag-alt'),(3,'Proveedor','ServletProveedor?tipo=LISTAR','bx bxs-face'),(1,'Proveedor','ServletProveedor?tipo=LISTAR','bx bxs-face'),(1,'Operador','ServletOperador?tipo=LISTAR','bx bx-male'),(4,'Inscripcion Sunarp','ServletSunarp?tipo=LISTAR','bx bxs-business'),(1,'Inscripcion Sunarp','ServletSunarp?tipo=LISTAR','bx bxs-business'),(1,'Consultar','ConsultarBienPorOrdendeCompra.jsp','bx bx-clipboard');
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operador`
--

DROP TABLE IF EXISTS `operador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operador` (
  `id_ope` int(11) NOT NULL AUTO_INCREMENT,
  `nom_ope` varchar(45) NOT NULL,
  `dist_ope` varchar(45) NOT NULL,
  `cel_ope` int(11) NOT NULL,
  `estado_ope` varchar(45) NOT NULL,
  PRIMARY KEY (`id_ope`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operador`
--

LOCK TABLES `operador` WRITE;
/*!40000 ALTER TABLE `operador` DISABLE KEYS */;
INSERT INTO `operador` VALUES (1,'Renzo','San Isidro',987789654,'Activo');
/*!40000 ALTER TABLE `operador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor` (
  `id_prove` int(11) NOT NULL AUTO_INCREMENT,
  `nom_prove` varchar(45) NOT NULL,
  `dist_prove` varchar(45) NOT NULL,
  `telf_prove` varchar(15) NOT NULL,
  `estado_prove` varchar(45) NOT NULL,
  PRIMARY KEY (`id_prove`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (1,'Ancor','Comas','540-1080','ACTIVO'),(3,'Muebles SAC','San Martin de Porres','936647222','Activo');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_bienes`
--

DROP TABLE IF EXISTS `tb_bienes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_bienes` (
  `codBien` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `unidMed` varchar(15) CHARACTER SET latin1 DEFAULT NULL,
  `precUni` decimal(5,2) DEFAULT NULL,
  `idCategoria` char(3) CHARACTER SET latin1 DEFAULT NULL,
  `stockDisponible` int(11) DEFAULT NULL,
  `fecIngreso` date DEFAULT NULL,
  PRIMARY KEY (`codBien`),
  KEY `fkBien_Cate` (`idCategoria`),
  CONSTRAINT `fkBien_Cate` FOREIGN KEY (`idCategoria`) REFERENCES `tb_categorias` (`idCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1 COLLATE=latin1_bin KEY_BLOCK_SIZE=2;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_bienes`
--

LOCK TABLES `tb_bienes` WRITE;
/*!40000 ALTER TABLE `tb_bienes` DISABLE KEYS */;
INSERT INTO `tb_bienes` VALUES (1,'FRESAS','UNIDAD',5.20,'C03',120,'2022-06-28'),(2,'ARMARIO DE MADERA','UNIDAD',80.50,'C06',150,'2008-09-20'),(3,'PAQUETE OFFICE DE WINDOWS','UNIDAD',130.50,'C04',125,'2022-05-31'),(4,'DEPARTAMENTE DE 2 CUARTOS','UNIDAD',450.50,'C01',300,'2014-07-30'),(5,'SILLA GAMER','UNIDAD',600.50,'C06',99,'2019-10-25'),(6,'SILLA DE MADERA','UNIDAD',20.50,'C04',50,'2021-10-26'),(7,'VERDURAS','KILO',63.95,'C03',78,'2022-05-21'),(8,'MOUSE INAHALAMBRICO RGBA','UNIDAD',25.95,'C05',29,'2021-10-31'),(9,'ESCRITORIO DE MADERA','UNIDAD',30.00,'C06',50,'2021-09-25'),(10,'SILLA DE MADERA','UNIDAD',20.00,'C06',90,'2021-09-25'),(11,'SILLA DE METAL','UNIDAD',35.00,'C06',100,'2022-05-28'),(13,'LAPICEROS','UNIDAD',1.00,'C05',85,'2021-09-10'),(14,'PAPEL','UNIDAD',60.00,'C05',90,'2021-08-15'),(15,'SILLA DE ESCRITORIO','UNIDAD',50.00,'C06',75,'2021-07-25'),(16,'ESTANTE ','UNIDAD',20.00,'C06',65,'2021-10-25'),(17,'ARCHIVERO','UNIDAD',35.00,'C05',100,'2021-10-23'),(18,'MUEBLE OFICINA','UNIDAD',40.00,'C06',800,'2021-09-22'),(19,'MOSTRADOR','UNIDAD',40.00,'C06',100,'2021-09-21'),(20,'ROPERO','UNIDAD',30.00,'C06',100,'2021-10-20'),(21,'CAJON DE MANERA','UNIDAD',15.00,'C05',20,'2021-11-20');
/*!40000 ALTER TABLE `tb_bienes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-26 15:33:32
