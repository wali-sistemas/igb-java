-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: igb
-- ------------------------------------------------------
-- Server version	5.7.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `assigned_orders`
--

DROP TABLE IF EXISTS `assigned_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assigned_orders` (
  `idassigned_orders` int(11) NOT NULL AUTO_INCREMENT,
  `emp_id` varchar(15) NOT NULL,
  `order_number` int(11) NOT NULL,
  `datetime_assigned` datetime NOT NULL,
  `assigned_by` varchar(80) NOT NULL,
  `status` varchar(8) DEFAULT NULL,
  `customer_id` varchar(45) NOT NULL,
  `customer_name` varchar(100) NOT NULL,
  `company` varchar(10) NOT NULL,
  PRIMARY KEY (`idassigned_orders`)
) ENGINE=MyISAM AUTO_INCREMENT=47 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assigned_orders`
--

LOCK TABLES `assigned_orders` WRITE;
/*!40000 ALTER TABLE `assigned_orders` DISABLE KEYS */;
INSERT INTO `assigned_orders` VALUES (1,'wms.med1',185315,'2018-03-30 07:42:13','wms.med','closed','C4845673','CAICEDO WILLINTON','IGB'),(2,'wms.med1',185374,'2018-03-19 17:28:10','wms.med','open','C1036220721','GOMEZ ORREGO EDWIN ALEXANDER','IGB'),(16,'wms.med1',185970,'2018-04-05 18:38:12','wms.med','open','C900255414','MOTO ZONE SAS','IGB'),(3,'wms.med1',185932,'2018-02-21 21:04:22','wms.med','open','C1017194589','CASTRILLON ALVEREZ HECTOR DANIEL','IGB'),(4,'wms.med1',185934,'2018-02-21 21:04:22','wms.med','open','C70907182','GENUINA MOTOS Y/O  ARBELAEZ RAMIREZ EDWIN','IGB'),(5,'wms.med1',185929,'2018-02-21 21:04:22','wms.med','open','C15524894','ORBIMOTOS Y/O ANTONIO ZAPATA','IGB'),(6,'wms.med1',185926,'2018-02-21 21:04:22','wms.med','open','C15524894','ORBIMOTOS Y/O ANTONIO ZAPATA','IGB'),(7,'wms.med1',185924,'2018-03-25 16:27:47','wms.med','closed','C1037322670','MERKAMOTOS CO Y/O MARIN GALLEGO JORGE ANDRES','IGB'),(8,'wms.med1',185922,'2018-02-21 21:04:22','wms.med','open','C73232611','MOREPUETOS EL REPOSO Y/O HERRERA RICARDO JORGE LUIS','IGB'),(9,'wms.med1',185925,'2018-02-21 21:04:22','wms.med','closed','C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','IGB'),(10,'wms.med1',185927,'2018-02-21 21:04:22','wms.med','open','C65497447','TECNIMOTOS MAS Y/O LOZANO FRASSER LILIA','IGB'),(11,'wms.med1',185967,'2018-03-11 19:19:27','wms.med','closed','C6137803','MOTO REPUESTOS NUEVO LATIR Y/O SANCHEZ MARTINEZ JULIAN','IGB'),(12,'desarrollo.med',185355,'2018-03-19 18:02:03','wms.med','open','C39388965','BERMUDEZ BETANCUR LICED MARJEY','IGB'),(13,'wms.med1',185363,'2018-03-19 17:28:10','wms.med','open','C25956629','SABANA MOTO Y/O PORTILLO PADILLA MARTA DEL CARMEN','IGB'),(14,'wms.med1',185387,'2018-03-19 17:28:10','wms.med','open','C91233076','WORLD MOTOS RACER Y/O ANGARITA JAIME  GUILLERMO','IGB'),(15,'wms.med1',185972,'2018-03-25 16:47:09','wms.med','closed','C1037322670','MERKAMOTOS CO Y/O MARIN GALLEGO JORGE ANDRES','IGB'),(17,'wms.med1',185969,'2018-04-05 18:38:12','wms.med','closed','C900255414','MOTO ZONE SAS','IGB'),(18,'wms.med1',185968,'2018-04-05 18:38:12','wms.med','open','C900255414','MOTO ZONE SAS','IGB'),(19,'wms.med1',185977,'2018-04-07 18:34:17','wms.med','closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(20,'wms.med1',185979,'2018-04-07 18:49:20','wms.med','closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(21,'wms.med1',185978,'2018-04-07 18:49:20','wms.med','closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(22,'wms.med1',185976,'2018-04-07 18:49:20','wms.med','closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(23,'wms.med1',185975,'2018-04-07 18:49:20','wms.med','closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(24,'wms.med',185974,'2018-04-07 19:23:54','wms.med','closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(25,'wms.med',185973,'2018-04-12 21:40:21','wms.med','open','C900255414','MOTO ZONE SAS','IGB'),(26,'wms.med',185981,'2018-04-07 19:32:27','wms.med','closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(27,'wms.med',185980,'2018-04-07 19:32:28','wms.med','closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(28,'wms.med',185982,'2018-04-07 19:42:28','wms.med','closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(29,'wms.med',185983,'2018-04-07 19:48:03','wms.med','closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(30,'wms.med',185921,'2018-04-08 22:25:32','wms.med','open','C15533147','METROMOTOS Y/O MARIN RODRIGUEZ GUSTAVO  ADOLFO','IGB'),(31,'wms.med1',185919,'2018-04-08 22:25:32','wms.med','open','C93403038','JAPONESA DE MOTOS Y/O NEIRA DIAZ WILSON ANDRES','IGB'),(32,'wms.med1',185920,'2018-04-08 22:25:32','wms.med','open','C15533147','METROMOTOS Y/O MARIN RODRIGUEZ GUSTAVO  ADOLFO','IGB'),(33,'wms.med1',185918,'2018-04-08 22:25:32','wms.med','open','C93403038','JAPONESA DE MOTOS Y/O NEIRA DIAZ WILSON ANDRES','IGB'),(34,'wms.med1',185916,'2018-04-08 22:25:32','wms.med','open','C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','IGB'),(35,'wms.med1',185914,'2018-04-08 22:25:32','wms.med','open','C93403038','JAPONESA DE MOTOS Y/O NEIRA DIAZ WILSON ANDRES','IGB'),(36,'wms.med1',185917,'2018-04-08 22:25:32','wms.med','open','C12022077','DIAZ CASTRILLON EDIER ALBEIRO','IGB'),(37,'wms.med1',185915,'2018-04-08 22:25:32','wms.med','open','C93403038','JAPONESA DE MOTOS Y/O NEIRA DIAZ WILSON ANDRES','IGB'),(38,'wms.med1',185913,'2018-04-08 22:25:32','wms.med','open','C93403038','JAPONESA DE MOTOS Y/O NEIRA DIAZ WILSON ANDRES','IGB'),(39,'wms.med1',185912,'2018-04-08 22:25:32','wms.med','open','C32638148','MOTOATLANTIC F.H. Y/O HERRERA ROCHA FABIOLA DEL CARMEN','IGB'),(40,'wms.med1',185907,'2018-04-08 22:25:33','wms.med','open','C43919991','TECNIMOTOS CENTELLA Y/O ARIAS MONSALVE MABEL ANDREA','IGB'),(41,'wms.med1',185911,'2018-04-08 22:25:33','wms.med','open','C32638148','MOTOATLANTIC F.H. Y/O HERRERA ROCHA FABIOLA DEL CARMEN','IGB'),(42,'wms.med1',185908,'2018-04-08 22:25:33','wms.med','open','C71396653','CHALMOTOS Y/O TOBON ACEVEDO RUBEN DARIO','IGB'),(43,'wms.med1',185906,'2018-04-08 22:25:33','wms.med','open','C70907182','GENUINA MOTOS Y/O  ARBELAEZ RAMIREZ EDWIN','IGB'),(44,'wms.med1',185904,'2018-04-08 22:25:33','wms.med','open','C13535557','VARGAS CAMACHO LUIS ALFREDO','IGB'),(45,'wms.med',185987,'2018-04-12 20:29:00','wms.med','closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(46,'wms.med',185988,'2018-04-12 21:42:55','wms.med','closed','C8359734','ZAPATA ZAPATA RICARDO','IGB');
/*!40000 ALTER TABLE `assigned_orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` datetime NOT NULL,
  `status` varchar(2) NOT NULL,
  `whscode` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `company` varchar(45) NOT NULL,
  `transfer` INT(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (4,'2018-03-10 10:22:44','F','01','0101011101010201','IGB');
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory_detail`
--

DROP TABLE IF EXISTS `inventory_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory_detail` (
  `idinventory_detail` int(11) NOT NULL AUTO_INCREMENT,
  `item` varchar(45) NOT NULL,
  `quantity` int(11) NOT NULL,
  `date` datetime NOT NULL,
  `idinventory` int(11) NOT NULL,
  PRIMARY KEY (`idinventory_detail`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory_detail`
--

LOCK TABLES `inventory_detail` WRITE;
/*!40000 ALTER TABLE `inventory_detail` DISABLE KEYS */;
INSERT INTO `inventory_detail` VALUES (1,'U0112',40,'2018-03-07 21:30:27',1),(2,'U5010',44,'2018-03-07 21:36:49',2),(3,'SC0052',704,'2018-03-10 10:25:19',4);
/*!40000 ALTER TABLE `inventory_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory_difference`
--

DROP TABLE IF EXISTS `inventory_difference`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory_difference` (
  `idinventory_difference` int(11) NOT NULL AUTO_INCREMENT,
  `idinventory` int(11) NOT NULL,
  `item` varchar(45) NOT NULL,
  `expected` int(11) NOT NULL,
  `found` int(11) NOT NULL,
  PRIMARY KEY (`idinventory_difference`),
  KEY `id_idx` (`idinventory`),
  CONSTRAINT `id` FOREIGN KEY (`idinventory`) REFERENCES `inventory` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory_difference`
--

LOCK TABLES `inventory_difference` WRITE;
/*!40000 ALTER TABLE `inventory_difference` DISABLE KEYS */;
INSERT INTO `inventory_difference` VALUES (1,4,'TP5096',189,0),(2,4,'TP0623',585,0),(3,4,'GP0385',16,0),(4,4,'YA1225',1116,0),(5,4,'GP0573',3,0),(6,4,'YC4533',2688,0),(7,4,'YE1480',3009,0),(8,4,'YE1482',3083,0),(9,4,'YE1483',430,0),(10,4,'YE1488',219,0),(11,4,'U0112',40,0),(12,4,'U5010',44,0),(13,4,'U5060',37,0),(14,4,'TP0890',8890,0);
/*!40000 ALTER TABLE `inventory_difference` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `packing_list_record`
--

DROP TABLE IF EXISTS `packing_list_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `packing_list_record` (
  `idpacking_list_record` int(11) NOT NULL AUTO_INCREMENT,
  `idpacking_list` int(11) NOT NULL,
  `order_number` int(11) NOT NULL,
  `customer_id` varchar(45) NOT NULL,
  `customer_name` varchar(100) NOT NULL,
  `datetime_packed` datetime NOT NULL,
  `idpacking_order` int(11) NOT NULL,
  `item_code` varchar(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `bin_abs` int(11) NOT NULL,
  `bin_code` varchar(45) NOT NULL,
  `box_number` int(11) NOT NULL,
  `status` varchar(10) NOT NULL,
  `employee` varchar(45) NOT NULL,
  `company_name` varchar(45) NOT NULL,
  PRIMARY KEY (`idpacking_list_record`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `packing_list_record`
--

LOCK TABLES `packing_list_record` WRITE;
/*!40000 ALTER TABLE `packing_list_record` DISABLE KEYS */;
INSERT INTO `packing_list_record` VALUES (16,1,185925,'C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','2018-03-21 20:42:57',8,'SC0080',10,3,'01PC01',1,'closed','wms.med','IGB'),(17,1,185925,'C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','2018-03-21 20:44:35',3,'SC0050',10,3,'01PC01',2,'closed','wms.med','IGB'),(18,1,185925,'C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','2018-03-21 20:45:23',3,'TP0160',5,3,'01PC01',1,'closed','wms.med','IGB'),(19,1,185925,'C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','2018-03-21 20:45:50',3,'TP0160',5,3,'01PC01',2,'closed','wms.med','IGB'),(20,20,185925,'C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','2018-03-22 20:14:51',8,'TP0824',10,3,'01PC01',1,'closed','wms.med','IGB'),(21,20,185925,'C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','2018-03-22 20:15:13',8,'SC0052',8,3,'01PC01',1,'closed','wms.med','IGB'),(22,20,185925,'C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','2018-03-22 20:15:29',8,'SC0230',8,3,'01PC01',1,'closed','wms.med','IGB'),(23,20,185925,'C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','2018-03-22 20:15:45',8,'SC0230',2,3,'01PC01',2,'closed','wms.med','IGB'),(24,20,185925,'C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','2018-03-22 20:16:06',8,'SC0165',5,3,'01PC01',1,'closed','wms.med','IGB'),(25,20,185925,'C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','2018-03-22 20:16:22',8,'SC0210',15,3,'01PC01',1,'closed','wms.med','IGB'),(26,20,185925,'C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','2018-03-22 20:16:33',8,'SC0210',5,3,'01PC01',2,'closed','wms.med','IGB'),(27,20,185925,'C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','2018-03-22 20:16:49',8,'SC0200',10,3,'01PC01',2,'closed','wms.med','IGB'),(28,20,185925,'C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','2018-03-22 21:23:10',8,'TP0826',5,3,'01PC01',1,'closed','wms.med','IGB'),(29,20,185925,'C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','2018-03-22 21:29:05',8,'TP3176',10,3,'01PC01',1,'closed','wms.med','IGB'),(30,30,185924,'C1037322670','MERKAMOTOS CO Y/O MARIN GALLEGO JORGE ANDRES','2018-03-24 08:29:36',9,'U0228',2,3,'01PC01',1,'closed','wms.med','IGB'),(31,30,185924,'C1037322670','MERKAMOTOS CO Y/O MARIN GALLEGO JORGE ANDRES','2018-03-24 08:30:39',9,'U5010',2,7,'01PC05',2,'closed','wms.med','IGB'),(32,30,185924,'C1037322670','MERKAMOTOS CO Y/O MARIN GALLEGO JORGE ANDRES','2018-03-25 12:21:45',9,'U0112',1,7,'01PC05',3,'closed','wms.med','IGB'),(33,30,185924,'C1037322670','MERKAMOTOS CO Y/O MARIN GALLEGO JORGE ANDRES','2018-03-25 12:22:13',9,'U0114',1,7,'01PC05',1,'closed','wms.med','IGB'),(34,30,185924,'C1037322670','MERKAMOTOS CO Y/O MARIN GALLEGO JORGE ANDRES','2018-03-25 12:22:28',9,'U0116',1,7,'01PC05',2,'closed','wms.med','IGB'),(35,30,185924,'C1037322670','MERKAMOTOS CO Y/O MARIN GALLEGO JORGE ANDRES','2018-03-25 12:22:44',9,'U5060',2,7,'01PC05',3,'closed','wms.med','IGB'),(36,30,185972,'C1037322670','MERKAMOTOS CO Y/O MARIN GALLEGO JORGE ANDRES','2018-03-25 16:51:37',10,'U0114',4,3,'01PC01',1,'closed','wms.med','IGB'),(37,30,185972,'C1037322670','MERKAMOTOS CO Y/O MARIN GALLEGO JORGE ANDRES','2018-03-25 16:51:53',10,'U0228',4,3,'01PC01',2,'closed','wms.med','IGB'),(38,30,185972,'C1037322670','MERKAMOTOS CO Y/O MARIN GALLEGO JORGE ANDRES','2018-03-25 16:52:06',10,'U0114',4,3,'01PC01',3,'closed','wms.med','IGB'),(39,30,185924,'C1037322670','MERKAMOTOS CO Y/O MARIN GALLEGO JORGE ANDRES','2018-03-25 16:52:35',9,'U5070',2,7,'01PC05',3,'closed','wms.med','IGB'),(41,31,185977,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 18:38:02',12,'TP0100',10,6,'01PC04',1,'closed','wms.med','IGB'),(42,31,185977,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 18:38:20',12,'TP0725',5,6,'01PC04',1,'closed','wms.med','IGB'),(43,32,185975,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 18:50:01',13,'ed0029',1,3,'01PC01',1,'closed','wms.med','IGB'),(44,33,185976,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 19:00:54',14,'TP0100',10,3,'01PC01',1,'closed','wms.med','IGB'),(45,33,185976,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 19:01:11',14,'TP0725',5,3,'01pc01',2,'closed','wms.med','IGB'),(46,34,185978,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 19:03:47',15,'ED0029',1,3,'01pc01',1,'closed','wms.med','IGB'),(47,35,185979,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 19:09:26',17,'ED0105',1,3,'01PC01',1,'closed','wms.med','IGB'),(48,36,185969,'C900255414','MOTO ZONE SAS','2018-04-07 19:15:41',19,'U0025',10,3,'01PC01',1,'closed','wms.med','IGB'),(49,36,185969,'C900255414','MOTO ZONE SAS','2018-04-07 19:15:59',19,'U0048',5,3,'01PC01',2,'closed','wms.med','IGB'),(50,36,185969,'C900255414','MOTO ZONE SAS','2018-04-07 19:16:18',19,'U0063',11,3,'01PC01',2,'closed','wms.med','IGB'),(51,36,185969,'C900255414','MOTO ZONE SAS','2018-04-07 19:16:33',19,'U0070',1,3,'01PC01',1,'closed','wms.med','IGB'),(52,37,185974,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 19:25:56',20,'ED0105',1,3,'01PC01',1,'closed','wms.med','IGB'),(53,38,185980,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 19:34:50',21,'TP0100',10,3,'01PC01',1,'closed','wms.med','IGB'),(54,38,185980,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 19:35:09',21,'TP0725',5,3,'01PC01',2,'closed','wms.med','IGB'),(55,39,185981,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 19:37:48',22,'TP0100',10,3,'01PC01',1,'closed','wms.med','IGB'),(56,39,185981,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 19:38:00',22,'TP0725',5,3,'01PC01',2,'closed','wms.med','IGB'),(57,40,185982,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 19:43:39',23,'TP0100',10,3,'01PC01',1,'closed','wms.med','IGB'),(58,40,185982,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 19:43:51',23,'TP0725',5,3,'01PC01',2,'closed','wms.med','IGB'),(59,41,185983,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 19:48:54',24,'TP0100',10,3,'01PC01',1,'closed','wms.med','IGB'),(60,41,185983,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-07 19:49:08',24,'TP0725',5,3,'01PC01',2,'closed','wms.med','IGB'),(61,42,185987,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-12 20:34:06',25,'TP0100',10,9570,'01PC06',1,'closed','wms.med','IGB'),(62,42,185987,'C8359734','ZAPATA ZAPATA RICARDO','2018-04-12 20:34:25',25,'TP0725',5,9570,'01pc06',2,'closed','wms.med','IGB');
/*!40000 ALTER TABLE `packing_list_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `packing_order`
--

DROP TABLE IF EXISTS `packing_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `packing_order` (
  `idpacking_order` int(11) NOT NULL AUTO_INCREMENT,
  `order_number` int(11) NOT NULL,
  `status` varchar(10) NOT NULL,
  `customer_id` varchar(45) NOT NULL,
  `customer_name` varchar(100) NOT NULL,
  `company_name` varchar(45) NOT NULL DEFAULT 'IGB',
  PRIMARY KEY (`idpacking_order`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `packing_order`
--

LOCK TABLES `packing_order` WRITE;
/*!40000 ALTER TABLE `packing_order` DISABLE KEYS */;
INSERT INTO `packing_order` VALUES (8,185925,'closed','C12266215','CHIQUIMOTOS Y/O MU¥OZ MORENO EDISON ALBERTO','IGB'),(9,185924,'closed','C1037322670','MERKAMOTOS CO Y/O MARIN GALLEGO JORGE ANDRES','IGB'),(10,185972,'open','C1037322670','MERKAMOTOS CO Y/O MARIN GALLEGO JORGE ANDRES','IGB'),(12,185977,'closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(13,185975,'closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(14,185976,'closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(15,185978,'closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(17,185979,'closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(19,185969,'closed','C900255414','MOTO ZONE SAS','IGB'),(20,185974,'closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(21,185980,'closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(22,185981,'closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(23,185982,'closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(24,185983,'closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(25,185987,'closed','C8359734','ZAPATA ZAPATA RICARDO','IGB'),(26,185988,'open','C8359734','ZAPATA ZAPATA RICARDO','IGB');
/*!40000 ALTER TABLE `packing_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `packing_order_item`
--

DROP TABLE IF EXISTS `packing_order_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `packing_order_item` (
  `idpacking_order_item` int(11) NOT NULL AUTO_INCREMENT,
  `idpacking_order` int(11) NOT NULL,
  `item_code` varchar(20) NOT NULL,
  PRIMARY KEY (`idpacking_order_item`),
  KEY `fk_packing_order_idx` (`idpacking_order`),
  CONSTRAINT `fk_packing_order` FOREIGN KEY (`idpacking_order`) REFERENCES `packing_order` (`idpacking_order`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=72 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `packing_order_item`
--

LOCK TABLES `packing_order_item` WRITE;
/*!40000 ALTER TABLE `packing_order_item` DISABLE KEYS */;
INSERT INTO `packing_order_item` VALUES (25,8,'SC0080'),(26,8,'SC0050'),(27,8,'TP0160'),(28,8,'TP0824'),(29,8,'SC0052'),(30,8,'SC0230'),(31,8,'SC0165'),(32,8,'SC0210'),(33,8,'SC0200'),(34,8,'TP0826'),(35,8,'TP3176'),(36,9,'U0112'),(37,9,'U0228'),(38,9,'U5010'),(39,9,'U5060'),(40,9,'U0114'),(41,9,'U5070'),(42,9,'U0116'),(43,10,'U0228'),(44,10,'U0114'),(46,12,'TP0725'),(47,12,'TP0100'),(48,13,'ED0029'),(49,14,'TP0725'),(50,14,'TP0100'),(51,15,'ED0029'),(53,17,'ED0105'),(55,19,'U0063'),(56,19,'U0070'),(57,19,'U0025'),(58,19,'U0048'),(59,20,'ED0105'),(60,21,'TP0725'),(61,21,'TP0100'),(62,22,'TP0725'),(63,22,'TP0100'),(64,23,'TP0725'),(65,23,'TP0100'),(66,24,'TP0725'),(67,24,'TP0100'),(68,25,'TP0725'),(69,25,'TP0100'),(70,26,'TP0725'),(71,26,'TP0100');
/*!40000 ALTER TABLE `packing_order_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `packing_order_item_bin`
--

DROP TABLE IF EXISTS `packing_order_item_bin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `packing_order_item_bin` (
  `idpacking_order_item_bin` int(11) NOT NULL AUTO_INCREMENT,
  `idpacking_order_item` int(11) NOT NULL,
  `bin_code` varchar(45) NOT NULL,
  `bin_abs` int(11) NOT NULL,
  `bin_name` varchar(45) DEFAULT NULL,
  `picked_qty` int(11) NOT NULL,
  `packed_qty` int(11) NOT NULL,
  PRIMARY KEY (`idpacking_order_item_bin`),
  KEY `fk_packing_order_item_idx` (`idpacking_order_item`),
  CONSTRAINT `fk_packing_order_item` FOREIGN KEY (`idpacking_order_item`) REFERENCES `packing_order_item` (`idpacking_order_item`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `packing_order_item_bin`
--

LOCK TABLES `packing_order_item_bin` WRITE;
/*!40000 ALTER TABLE `packing_order_item_bin` DISABLE KEYS */;
INSERT INTO `packing_order_item_bin` VALUES (26,25,'01PC01',3,NULL,10,10),(27,26,'01PC01',3,NULL,10,10),(28,27,'01PC01',3,NULL,10,10),(29,28,'01PC01',3,NULL,10,10),(30,29,'01PC01',3,NULL,8,8),(31,30,'01PC01',3,NULL,10,10),(32,31,'01PC01',3,NULL,5,5),(33,32,'01PC01',3,NULL,20,20),(34,33,'01PC01',3,NULL,10,10),(35,34,'01PC01',3,NULL,5,5),(36,35,'01PC01',3,NULL,10,10),(37,36,'01PC05',7,NULL,1,1),(38,37,'01PC01',3,NULL,2,2),(39,38,'01PC05',7,NULL,2,2),(40,39,'01PC05',7,NULL,2,2),(41,40,'01PC05',7,NULL,1,1),(42,41,'01PC05',7,NULL,2,2),(43,42,'01PC05',7,NULL,1,1),(44,43,'01PC01',3,NULL,4,4),(45,44,'01PC01',3,NULL,8,8),(47,46,'01PC04',6,NULL,5,5),(48,47,'01PC04',6,NULL,10,10),(49,48,'01PC01',3,NULL,1,1),(50,49,'01PC01',3,NULL,5,5),(51,50,'01PC01',3,NULL,10,10),(52,51,'01PC01',3,NULL,1,1),(54,53,'01PC01',3,NULL,1,1),(56,55,'01PC01',3,NULL,11,11),(57,56,'01PC01',3,NULL,1,1),(58,57,'01PC01',3,NULL,10,10),(59,58,'01PC01',3,NULL,5,5),(60,59,'01PC01',3,NULL,1,1),(61,60,'01PC01',3,NULL,5,5),(62,61,'01PC01',3,NULL,10,10),(63,62,'01PC01',3,NULL,5,5),(64,63,'01PC01',3,NULL,10,10),(65,64,'01PC01',3,NULL,5,5),(66,65,'01PC01',3,NULL,10,10),(67,66,'01PC01',3,NULL,5,5),(68,67,'01PC01',3,NULL,10,10),(69,68,'01PC06',9570,NULL,5,5),(70,69,'01PC06',9570,NULL,10,10),(71,70,'01PC06',9570,'Carrito #6',5,0),(72,71,'01PC06',9570,'Carrito #6',10,0);
/*!40000 ALTER TABLE `packing_order_item_bin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `picking_record`
--

DROP TABLE IF EXISTS `picking_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `picking_record` (
  `idpicking_record` int(11) NOT NULL AUTO_INCREMENT,
  `order_number` int(11) NOT NULL,
  `item_code` varchar(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `bin_from` int(11) NOT NULL,
  `bin_to` int(11) NOT NULL,
  `stock_transfer_doc_entry` int(11) NOT NULL,
  `emp_id` varchar(15) NOT NULL,
  `transaction_date` datetime NOT NULL,
  `status` varchar(1) DEFAULT NULL,
  `expires` datetime DEFAULT NULL,
  `company_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idpicking_record`),
  KEY `idx_picking_emp_id` (`emp_id`),
  KEY `idx_picking_order` (`order_number`)
) ENGINE=InnoDB AUTO_INCREMENT=108 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `picking_record`
--

LOCK TABLES `picking_record` WRITE;
/*!40000 ALTER TABLE `picking_record` DISABLE KEYS */;
INSERT INTO `picking_record` VALUES (1,185922,'GN9085',16,6190,4,41195,'wms.med','2018-02-21 21:27:31','P',NULL,NULL),(2,185922,'TP0250',6,1586,4,41196,'wms.med','2018-02-21 21:44:52','P',NULL,NULL),(3,185922,'TP5008',6,8790,4,41197,'wms.med','2018-02-21 21:45:14','P',NULL,NULL),(4,185922,'TP0622',10,1758,4,41198,'wms.med','2018-02-21 21:45:35','P',NULL,NULL),(5,185922,'TP5096',3,1758,3,41201,'wms.med','2018-02-22 19:58:55','P',NULL,NULL),(6,185922,'TP5096',1,1758,3,41203,'wms.med','2018-02-22 20:20:32','P',NULL,NULL),(7,185922,'TP0623',15,1752,3,41205,'wms.med','2018-02-22 20:22:09','P',NULL,NULL),(8,185922,'TP4590',3,1752,3,41206,'wms.med','2018-02-22 20:22:37','P',NULL,NULL),(9,185922,'TP4593',12,1583,3,41207,'wms.med','2018-02-22 20:22:46','P',NULL,NULL),(10,185922,'GN6075',6,1777,3,41208,'wms.med','2018-02-22 20:22:53','P',NULL,NULL),(11,185922,'TP0623',16,5671,3,41209,'wms.med','2018-02-22 20:23:05','P',NULL,NULL),(12,185922,'TP0132',10,5640,3,41210,'wms.med','2018-02-22 20:23:12','P',NULL,NULL),(13,185922,'TP0595',10,1565,3,41211,'wms.med','2018-02-22 20:23:20','P',NULL,NULL),(14,185922,'GW0125',3,1566,5,41212,'wms.med','2018-02-25 12:21:58','P',NULL,NULL),(15,185922,'TP0594',2,1567,5,41213,'wms.med','2018-02-25 12:22:13','P',NULL,NULL),(16,185922,'TP0602',3,5616,5,41214,'wms.med','2018-02-25 12:34:07','P',NULL,NULL),(17,185922,'TP0585',10,5625,5,41215,'wms.med','2018-02-25 12:34:22','P',NULL,NULL),(18,185922,'TP4557',3,1553,5,41216,'wms.med','2018-02-25 12:34:29','P',NULL,NULL),(19,185922,'TP5061',3,1554,5,41217,'wms.med','2018-02-25 12:35:57','P',NULL,NULL),(20,185922,'TP5081',8,1548,5,41218,'wms.med','2018-02-25 12:36:09','P',NULL,NULL),(21,185922,'TP0580',10,5564,5,41219,'wms.med','2018-02-25 12:36:19','P',NULL,NULL),(22,185922,'TP4544',6,9430,5,41220,'wms.med','2018-02-25 12:36:30','P',NULL,NULL),(23,185922,'TP5063',3,1806,5,41221,'wms.med','2018-02-25 12:36:39','P',NULL,NULL),(24,185922,'TP0640',8,1517,5,41222,'wms.med','2018-02-25 12:36:48','P',NULL,NULL),(25,185922,'TP0220',17,1517,5,41223,'wms.med','2018-02-25 12:36:57','P',NULL,NULL),(26,185922,'TP5003',5,1820,5,41224,'wms.med','2018-02-25 12:37:06','P',NULL,NULL),(27,185922,'TP0150',6,1823,5,41225,'wms.med','2018-02-25 12:37:16','P',NULL,NULL),(28,185922,'TP5095',4,5169,5,41226,'wms.med','2018-02-25 12:37:26','P',NULL,NULL),(29,185922,'VA0737',3,950,5,41227,'wms.med','2018-02-25 12:37:38','P',NULL,NULL),(30,185922,'GN6071',16,977,5,41228,'wms.med','2018-02-25 12:37:51','P',NULL,NULL),(31,185922,'VA1848',4,5833,5,41229,'wms.med','2018-02-25 12:38:03','P',NULL,NULL),(32,185922,'VA1847',3,4329,5,41230,'wms.med','2018-02-25 12:38:12','P',NULL,NULL),(33,185922,'VA1142',6,1111,5,41231,'wms.med','2018-02-25 12:38:21','P',NULL,NULL),(34,185922,'GP0544',5,561,5,41232,'wms.med','2018-02-25 12:38:31','P',NULL,NULL),(35,185922,'GP0385',2,7394,5,41236,'wms.med','2018-02-26 20:58:13','P',NULL,NULL),(36,185922,'GP0385',3,578,5,41238,'wms.med','2018-02-26 21:07:00','P',NULL,NULL),(37,185922,'YA1225',4,536,5,41240,'wms.med','2018-02-26 21:18:57','P',NULL,NULL),(38,185922,'GP0573',2,6526,5,41242,'wms.med','2018-02-26 21:23:39','P',NULL,NULL),(39,185925,'SC0052',8,2512,3,41267,'wms.med','2018-03-11 18:05:17','P',NULL,NULL),(40,185924,'U0228',2,2164,3,41268,'wms.med','2018-03-11 18:05:30','P',NULL,NULL),(41,185925,'SC0210',20,2550,3,41269,'wms.med','2018-03-11 18:05:55','P',NULL,NULL),(42,185925,'SC0230',10,2492,3,41270,'wms.med','2018-03-11 18:06:03','P',NULL,NULL),(43,185925,'SC0165',5,2574,3,41271,'wms.med','2018-03-11 18:06:10','P',NULL,NULL),(44,185925,'SC0050',10,5793,3,41272,'wms.med','2018-03-11 18:06:17','P',NULL,NULL),(45,185925,'SC0200',10,5789,3,41273,'wms.med','2018-03-11 18:06:25','P',NULL,NULL),(46,185925,'SC0080',10,1642,3,41274,'wms.med','2018-03-11 18:06:32','P',NULL,NULL),(47,185925,'TP3176',10,1581,3,41275,'wms.med','2018-03-11 18:06:39','P',NULL,NULL),(48,185925,'TP0826',5,6053,3,41276,'wms.med','2018-03-11 18:06:47','P',NULL,NULL),(49,185925,'TP0160',10,1766,3,41277,'wms.med','2018-03-11 18:06:55','P',NULL,NULL),(50,185925,'TP0824',10,1543,3,41278,'wms.med','2018-03-11 18:07:04','P',NULL,NULL),(51,185922,'GP8012',7,6510,3,41279,'wms.med','2018-03-11 18:08:24','P',NULL,NULL),(52,185922,'GP6054',10,6454,3,41280,'wms.med','2018-03-11 18:08:34','P',NULL,NULL),(53,185967,'GA1200',5,7924,7,41281,'wms.med','2018-03-11 19:20:07','P',NULL,NULL),(54,185967,'GA2390',20,1266,7,41282,'wms.med','2018-03-11 19:20:14','P',NULL,NULL),(55,185967,'GA1126',5,4992,7,41283,'wms.med','2018-03-11 19:20:22','P',NULL,NULL),(56,185967,'GA2394',20,7499,7,41284,'wms.med','2018-03-11 19:20:30','P',NULL,NULL),(57,185967,'GA1635',8,1213,7,41285,'wms.med','2018-03-11 19:20:40','P',NULL,NULL),(58,185967,'GA1490',5,1200,7,41286,'wms.med','2018-03-11 19:20:49','P',NULL,NULL),(59,185924,'U5060',2,2508,7,41317,'wms.med','2018-03-21 20:32:27','P',NULL,NULL),(60,185924,'U5010',2,2506,7,41318,'wms.med','2018-03-21 20:32:35','P',NULL,NULL),(61,185924,'U5070',2,2498,7,41319,'wms.med','2018-03-21 20:32:42','P',NULL,NULL),(62,185924,'U0114',1,2258,7,41320,'wms.med','2018-03-21 20:32:49','P',NULL,NULL),(63,185924,'U0112',1,2254,7,41321,'wms.med','2018-03-21 20:32:57','P',NULL,NULL),(64,185924,'U0116',1,2268,7,41322,'wms.med','2018-03-21 20:33:03','P',NULL,NULL),(65,185972,'U0228',4,2164,3,41323,'wms.med','2018-03-25 16:50:46','P',NULL,NULL),(66,185972,'U0114',8,2258,3,41324,'wms.med','2018-03-25 16:50:55','P',NULL,NULL),(67,185315,'ED0071',1,2532,4,41326,'wms.med','2018-03-30 08:04:55','P',NULL,NULL),(68,185922,'GP11023',7,6345,4,41328,'wms.med','2018-03-30 09:17:22','P',NULL,NULL),(69,185922,'GP3018',15,3242,4,41329,'wms.med','2018-03-30 09:17:51','P',NULL,NULL),(70,185977,'TP0100',10,1399,6,41366,'wms.med','2018-04-07 18:34:51','P',NULL,NULL),(71,185977,'TP0725',5,1510,6,41367,'wms.med','2018-04-07 18:35:00','P',NULL,NULL),(72,185975,'ED0029',1,787,3,41368,'wms.med','2018-04-07 18:49:41','P',NULL,NULL),(73,185976,'TP0100',10,1399,3,41369,'wms.med','2018-04-07 18:53:49','P',NULL,NULL),(74,185976,'TP0725',5,1510,3,41370,'wms.med','2018-04-07 18:53:58','P',NULL,NULL),(75,185978,'ED0029',1,787,3,41371,'wms.med','2018-04-07 18:54:12','P',NULL,NULL),(76,185979,'ED0105',1,832,3,41372,'wms.med','2018-04-07 18:54:27','P',NULL,NULL),(77,185969,'U0063',11,9050,3,41373,'wms.med','2018-04-07 19:14:43','P',NULL,NULL),(78,185969,'U0048',5,1891,3,41374,'wms.med','2018-04-07 19:14:51','P',NULL,NULL),(79,185969,'U0070',1,1913,3,41375,'wms.med','2018-04-07 19:15:00','P',NULL,NULL),(80,185969,'U0025',10,1933,3,41376,'wms.med','2018-04-07 19:15:08','P',NULL,NULL),(81,185974,'ED0105',1,832,3,41377,'wms.med','2018-04-07 19:24:45','P',NULL,NULL),(82,185980,'TP0100',10,1399,3,41378,'wms.med','2018-04-07 19:33:11','P',NULL,NULL),(83,185980,'TP0725',5,1510,3,41379,'wms.med','2018-04-07 19:33:21','P',NULL,NULL),(84,185981,'TP0100',10,1399,3,41380,'wms.med','2018-04-07 19:34:12','P',NULL,NULL),(85,185981,'TP0725',5,1510,3,41381,'wms.med','2018-04-07 19:34:21','P',NULL,NULL),(86,185982,'TP0100',10,1399,3,41382,'wms.med','2018-04-07 19:42:46','P',NULL,NULL),(87,185982,'TP0725',5,1510,3,41383,'wms.med','2018-04-07 19:42:53','P',NULL,NULL),(88,185983,'TP0100',10,1399,3,41384,'wms.med','2018-04-07 19:48:24','P',NULL,NULL),(89,185983,'TP0725',5,1510,3,41385,'wms.med','2018-04-07 19:48:31','P',NULL,NULL),(92,177926,'TP1013',10,2532,3,41404,'wms.med','2018-04-09 21:20:13','P',NULL,NULL),(93,177926,'TP1013',10,2532,3,41406,'wms.med','2018-04-09 21:24:33','P',NULL,NULL),(94,177926,'TP1013',10,2532,3,41407,'wms.med','2018-04-09 21:24:39','P',NULL,NULL),(96,185907,'YB2010',1,28,3,41409,'wms.med','2018-04-09 21:50:50','P',NULL,NULL),(100,185921,'TS39BGL',1,112,3,41424,'wms.med','2018-04-12 20:25:37','P',NULL,'IGB'),(101,185973,'ED0023',20,2523,3,41425,'wms.med','2018-04-12 20:25:49','P',NULL,'IGB'),(102,185987,'TP0100',10,1399,9570,41426,'wms.med','2018-04-12 20:30:29','P',NULL,'IGB'),(103,185987,'TP0725',5,1510,9570,41427,'wms.med','2018-04-12 20:30:39','P',NULL,'IGB'),(106,185988,'TP0100',10,1399,9570,41432,'wms.med','2018-04-12 21:51:09','P',NULL,'IGB'),(107,185988,'TP0725',5,1510,9570,41433,'wms.med','2018-04-12 21:51:19','P',NULL,'IGB');
/*!40000 ALTER TABLE `picking_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `printer`
--

DROP TABLE IF EXISTS `printer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `printer` (
  `idprinter` int(11) NOT NULL AUTO_INCREMENT,
  `printer_name` varchar(45) NOT NULL,
  `print_service_name` varchar(45) NOT NULL,
  PRIMARY KEY (`idprinter`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `printer`
--

LOCK TABLES `printer` WRITE;
/*!40000 ALTER TABLE `printer` DISABLE KEYS */;
INSERT INTO `printer` VALUES (1,'Zebra CEDI Med','Zebra S4M-203dpi ZPL');
/*!40000 ALTER TABLE `printer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `username` varchar(30) NOT NULL,
  `name` varchar(45) NOT NULL,
  `surname` varchar(45) NOT NULL,
  `email` varchar(80) NOT NULL,
  `lastUpdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('wms.med','Daniel','Botero','wms.med@igbcolombia.local','2018-04-10 02:06:19');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-12 22:43:10
