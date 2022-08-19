-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: db_tickets
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `historial_atencion`
--

DROP TABLE IF EXISTS `historial_atencion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historial_atencion` (
  `id_historial` int NOT NULL AUTO_INCREMENT,
  `id_ticket` int NOT NULL,
  `usuario_soporte` varchar(45) NOT NULL,
  `fecha_atencion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `trabajo_realizado` varchar(45) NOT NULL,
  `estado` varchar(1) NOT NULL DEFAULT 'A',
  PRIMARY KEY (`id_historial`),
  KEY `fk_historial_atencion_ticket_atencion_idx` (`id_ticket`) /*!80000 INVISIBLE */,
  CONSTRAINT `fk_historial_atencion_ticket_atencion` FOREIGN KEY (`id_ticket`) REFERENCES `ticket_atencion` (`id_ticket`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historial_atencion`
--

LOCK TABLES `historial_atencion` WRITE;
/*!40000 ALTER TABLE `historial_atencion` DISABLE KEYS */;
INSERT INTO `historial_atencion` VALUES (1,1,'VALERIA CASTRO SUAREZ','2022-08-19 05:00:00','SE REALIZÓ UNA FUSION DE C ABLE EN EL POSTE','A'),(2,2,'VALERIA CASTRO SUAREZ','2022-08-19 05:00:00','SE REALIZÓ UNA FUSION DE C ABLE EN EL POSTE','A'),(3,3,'VALERIA CASTRO SUAREZ','2022-08-19 05:00:00','SE REALIZÓ UNA FUSION DE C ABLE EN EL POSTE','A');
/*!40000 ALTER TABLE `historial_atencion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket_atencion`
--

DROP TABLE IF EXISTS `ticket_atencion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket_atencion` (
  `id_ticket` int NOT NULL AUTO_INCREMENT,
  `solicitante` varchar(45) NOT NULL,
  `fecha_ingreso` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `asunto` varchar(45) NOT NULL,
  `descripcion_incidencia` varchar(45) NOT NULL,
  `atencion` varchar(45) NOT NULL DEFAULT 'PENDIENTE',
  `estado` varchar(1) NOT NULL DEFAULT 'A',
  PRIMARY KEY (`id_ticket`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_atencion`
--

LOCK TABLES `ticket_atencion` WRITE;
/*!40000 ALTER TABLE `ticket_atencion` DISABLE KEYS */;
INSERT INTO `ticket_atencion` VALUES (1,'JOSE LUNA ARIAS','2022-08-17 05:00:00','DESCONECCION INTERNET','HUBO UN CORTO EN LA ESQUINA','ATENDIDO','A'),(2,'NATHALIA MORENO TIERRA','2022-08-18 05:00:00','DESCONECCION INTERNET','HUBO UN CORTO EN LA ESQUINA','ATENDIDO','A'),(3,'JUAN SOLIS LAINEZ','2022-08-19 05:00:00','DESCONECCION INTERNET','HUBO UN CORTO EN LA ESQUINA','ATENDIDO','A'),(4,'PEDRO VERA REYES','2022-08-19 05:00:00','INTERNET LENTO','MANTENIMIENTO','PENDIENTE','A');
/*!40000 ALTER TABLE `ticket_atencion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-19 17:47:42
