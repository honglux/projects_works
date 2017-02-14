-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: rest
-- ------------------------------------------------------
-- Server version	5.5.40

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
-- Table structure for table `boss`
--

DROP TABLE IF EXISTS `boss`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `boss` (
  `boss_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `boss_name` varchar(45) DEFAULT NULL,
  `boss_address` varchar(45) DEFAULT NULL,
  `boss_age` int(11) DEFAULT NULL,
  `boss_gender` varchar(45) DEFAULT NULL,
  `boss_ssn` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`boss_id`),
  KEY `boss_user_idx` (`user_id`),
  CONSTRAINT `boss_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `boss`
--

LOCK TABLES `boss` WRITE;
/*!40000 ALTER TABLE `boss` DISABLE KEYS */;
INSERT INTO `boss` VALUES (4,11,'Lei','sp',25,'M','0000'),(5,13,'Zekun','Duck village',25,'M','0000');
/*!40000 ALTER TABLE `boss` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `customer_name` varchar(45) DEFAULT NULL,
  `customer_address` varchar(45) DEFAULT NULL,
  `customer_age` varchar(45) DEFAULT NULL,
  `customer_gender` varchar(45) DEFAULT NULL,
  `customer_ssn` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  KEY `customer_user_idx` (`user_id`),
  CONSTRAINT `customer_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (5,9,'Honglu','18th ave','25','M','0000'),(6,10,'Qili','Duck village','24','M','0000');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dish`
--

DROP TABLE IF EXISTS `dish`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dish` (
  `dish_id` int(11) NOT NULL AUTO_INCREMENT,
  `dish_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`dish_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dish`
--

LOCK TABLES `dish` WRITE;
/*!40000 ALTER TABLE `dish` DISABLE KEYS */;
INSERT INTO `dish` VALUES (15,'chicken'),(16,'soup'),(17,'beef'),(19,'teriyaki chicken'),(20,'teriyaki beff'),(21,'fried rice'),(22,'noodle soup'),(23,'spicy chicken'),(24,'spicy tofu'),(25,'spicy soup');
/*!40000 ALTER TABLE `dish` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_dish`
--

DROP TABLE IF EXISTS `order_dish`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_dish` (
  `order_id` int(11) NOT NULL,
  `dish_id` int(11) NOT NULL,
  `dish_amount` int(11) DEFAULT NULL,
  KEY `toOrder_idx` (`order_id`),
  KEY `ord_dis_to_dish_idx` (`dish_id`),
  CONSTRAINT `ord_dis_to_dish` FOREIGN KEY (`dish_id`) REFERENCES `dish` (`dish_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `toOrder` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_dish`
--

LOCK TABLES `order_dish` WRITE;
/*!40000 ALTER TABLE `order_dish` DISABLE KEYS */;
INSERT INTO `order_dish` VALUES (1,15,1),(1,16,1),(9,19,1),(10,16,0),(10,22,1),(11,23,1),(11,24,1),(11,25,1);
/*!40000 ALTER TABLE `order_dish` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `rest_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `statu` varchar(45) NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `order_to_cust_idx` (`customer_id`),
  KEY `order_to_rests_idx` (`rest_id`),
  CONSTRAINT `order_to_cust` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `order_to_rests` FOREIGN KEY (`rest_id`) REFERENCES `rests` (`rest_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,6,5,'N'),(6,8,6,'US'),(9,7,6,'N'),(10,8,5,'SUN'),(11,9,5,'SUN');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rest_to_dish`
--

DROP TABLE IF EXISTS `rest_to_dish`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rest_to_dish` (
  `rest_id` int(11) NOT NULL,
  `dish_id` int(11) NOT NULL,
  `dish_price` decimal(2,0) NOT NULL,
  KEY `toDish_idx` (`dish_id`),
  KEY `toRest_idx` (`rest_id`),
  CONSTRAINT `toDish` FOREIGN KEY (`dish_id`) REFERENCES `dish` (`dish_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `toRest` FOREIGN KEY (`rest_id`) REFERENCES `rests` (`rest_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rest_to_dish`
--

LOCK TABLES `rest_to_dish` WRITE;
/*!40000 ALTER TABLE `rest_to_dish` DISABLE KEYS */;
INSERT INTO `rest_to_dish` VALUES (6,15,9),(6,16,7),(6,17,10),(7,15,5),(7,19,12),(7,20,13),(8,16,7),(8,21,9),(8,22,9),(9,23,11),(9,24,10),(9,25,9);
/*!40000 ALTER TABLE `rest_to_dish` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rests`
--

DROP TABLE IF EXISTS `rests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rests` (
  `rest_id` int(11) NOT NULL AUTO_INCREMENT,
  `rest_name` varchar(45) NOT NULL,
  `rest_address` varchar(45) NOT NULL,
  `boss_id` int(11) NOT NULL,
  `open_time` int(11) NOT NULL,
  `close_time` int(11) NOT NULL,
  PRIMARY KEY (`rest_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rests`
--

LOCK TABLES `rests` WRITE;
/*!40000 ALTER TABLE `rests` DISABLE KEYS */;
INSERT INTO `rests` VALUES (6,'eastmeetwest','campus',5,8,20),(7,'Tanggoodmeal','18th ave',5,12,23),(8,'Fenglin','campus',4,10,20),(9,'LeiSpicyHouse','17th ave',4,15,20);
/*!40000 ALTER TABLE `rests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) NOT NULL,
  `customer_boss` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (9,'customer1','c'),(10,'customer2','c'),(11,'boss1','b'),(13,'boss2','b');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-09 22:48:35
