-- MySQL dump 10.13  Distrib 5.5.41, for Win64 (x86)
--
-- Host: 192.168.56.102    Database: hopIn
-- ------------------------------------------------------
-- Server version	5.5.43-0ubuntu0.14.04.1

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
-- Table structure for table `EventAddress`
--

DROP TABLE IF EXISTS `EventAddress`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EventAddress` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `street` varchar(100) DEFAULT NULL,
  `brgy` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `town` varchar(100) DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `state` varchar(100) DEFAULT NULL,
  `user_id` varchar(100) DEFAULT NULL,
  `eventId` int(11) DEFAULT NULL,
  `isActive` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EventAddress`
--

LOCK TABLES `EventAddress` WRITE;
/*!40000 ALTER TABLE `EventAddress` DISABLE KEYS */;
INSERT INTO `EventAddress` VALUES (28,'San Lorenzo','Kapitolyo','Pasig','boystown','NCR','Manila','PH','null',NULL,55,'false');
/*!40000 ALTER TABLE `EventAddress` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Events`
--

DROP TABLE IF EXISTS `Events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Events` (
  `address` text,
  `type` varchar(20) DEFAULT NULL,
  `name` varchar(500) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `datePosted` date DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `organizing_user` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eventId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `Events_EventAddress_FK` (`eventId`),
  CONSTRAINT `Events_EventAddress_FK` FOREIGN KEY (`eventId`) REFERENCES `EventAddress` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Events`
--

LOCK TABLES `Events` WRITE;
/*!40000 ALTER TABLE `Events` DISABLE KEYS */;
INSERT INTO `Events` VALUES (NULL,'PAID','1970-01-01','1970-01-01','1970-01-01','1970-01-01','ACTIVE',15,55,NULL);
/*!40000 ALTER TABLE `Events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `autoIncTutorial`
--

DROP TABLE IF EXISTS `autoIncTutorial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `autoIncTutorial` (
  `priKey` int(11) NOT NULL AUTO_INCREMENT,
  `dataField` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`priKey`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autoIncTutorial`
--

LOCK TABLES `autoIncTutorial` WRITE;
/*!40000 ALTER TABLE `autoIncTutorial` DISABLE KEYS */;
INSERT INTO `autoIncTutorial` VALUES (1,'Can I Get the Auto Increment Field?'),(2,'Can I Get the Auto Increment Field?'),(3,'Can I Get the Auto Increment Field?'),(4,'Can I Get the Auto Increment Field?'),(5,'Can I Get the Auto Increment Field?'),(6,'Can I Get the Auto Increment Field?');
/*!40000 ALTER TABLE `autoIncTutorial` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-06-27  2:41:44
