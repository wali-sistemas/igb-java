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
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

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
  PRIMARY KEY (`idpacking_order`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

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
  `picked_qty` int(11) NOT NULL,
  `packed_qty` int(11) NOT NULL,
  PRIMARY KEY (`idpacking_order_item_bin`),
  KEY `fk_packing_order_item_idx` (`idpacking_order_item`),
  CONSTRAINT `fk_packing_order_item` FOREIGN KEY (`idpacking_order_item`) REFERENCES `packing_order_item` (`idpacking_order_item`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

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
  PRIMARY KEY (`idpicking_record`),
  KEY `idx_picking_emp_id` (`emp_id`),
  KEY `idx_picking_order` (`order_number`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

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
  `storage` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-17 22:54:32
