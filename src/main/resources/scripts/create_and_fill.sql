-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: ssdshop
-- ------------------------------------------------------
-- Server version	8.0.33

DROP DATABASE IF EXISTS `ssdshop`;
CREATE DATABASE `ssdshop`;
USE `ssdshop`;

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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `Id` bigint NOT NULL AUTO_INCREMENT,
  `Name` varchar(250) NOT NULL,
  `Maker` varchar(250) NOT NULL,
  `CapacityInGb` int NOT NULL,
  `FormFactor` int NOT NULL,
  `ReadingSpeed` int NOT NULL,
  `WritingSpeed` int NOT NULL,
  `Price` int NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'480 ГБ 2.5\" SATA накопитель Kingston A400','Kingston',480,0,500,450,2500),(2,'500 ГБ 2.5\" SATA накопитель Samsung 870 EVO','Samsung',500,0,560,530,4500),(3,'5073028 480 ГБ 2.5\" SATA накопитель Crucial BX500','Crucial',480,0,540,500,2950),(4,'128 ГБ SSD M.2 накопитель Silicon Power A55','Silicon',128,1,460,360,600),(5,'1000 ГБ SSD M.2 накопитель Samsung 980','Samsung',1000,1,3500,3000,7000),(6,' 1000 ГБ SSD M.2 накопитель Kingston FURY Renegade','Kingston',1000,1,7300,6000,9700),(7,'4000 ГБ SSD M.2 накопитель WD Red SN700','Western Digital',4000,1,3400,3100,43000),(8,'1354945 256 ГБ SSD M.2 накопитель Transcend MTS430','Transcend',256,2,560,500,3600),(9,'240 ГБ SSD M.2 накопитель Transcend MTS420','Transcend',240,2,500,430,2400),(10,'128 ГБ SSD M.2 накопитель Netac N930ES','Netac',128,2,1650,1500,1800);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-25 13:11:39
