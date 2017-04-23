-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: bms
-- ------------------------------------------------------
-- Server version	5.7.17-log

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `UNAME` varchar(50) DEFAULT NULL,
  `PASSWORD` varchar(50) DEFAULT NULL,
  `FNAME` varchar(50) DEFAULT NULL,
  `LNAME` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('tanmay14','ramila123!','tanmay','patel');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customerinfo`
--

DROP TABLE IF EXISTS `customerinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customerinfo` (
  `CUSTOMER_ID` varchar(5) NOT NULL,
  `FIRSTNAME` varchar(50) DEFAULT NULL,
  `LASTNAME` varchar(50) DEFAULT NULL,
  `USERNAME` varchar(50) DEFAULT NULL,
  `PASSWORD` varchar(50) DEFAULT NULL,
  `GUARDIANTYPE` varchar(50) DEFAULT NULL,
  `GUARDIANNAME` varchar(50) DEFAULT NULL,
  `ADDRESS` varchar(255) DEFAULT NULL,
  `CITIZENSHIP` varchar(50) DEFAULT NULL,
  `COUNTRY` varchar(50) DEFAULT NULL,
  `STATE` varchar(50) DEFAULT NULL,
  `COUNTRYID` varchar(50) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `GENDER` varchar(50) DEFAULT NULL,
  `MARITALSTATUS` varchar(50) DEFAULT NULL,
  `CONTACTNUMBER` varchar(50) DEFAULT NULL,
  `REGISTRATIONDATE` date DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `ACCOUNTTYPE` varchar(50) DEFAULT NULL,
  `INTERESTRATE` varchar(50) DEFAULT NULL,
  `INITIALDEPOSITAMOUNT` varchar(50) DEFAULT NULL,
  `BRANCHNAME` varchar(50) DEFAULT NULL,
  `IFSC` varchar(50) DEFAULT NULL,
  `CITIZENSTATUS` varchar(50) DEFAULT NULL,
  `PANNUMBER` varchar(50) DEFAULT NULL,
  `IDTYPE` varchar(50) DEFAULT NULL,
  `IDNUMBER` varchar(50) DEFAULT NULL,
  `REFNAME` varchar(50) DEFAULT NULL,
  `REFACCNO` varchar(50) DEFAULT NULL,
  `REFADD` varchar(50) DEFAULT NULL,
  `ACTIVATIONDATE` date DEFAULT NULL,
  `APPROVESTATUS` varchar(50) DEFAULT NULL,
  `ACCOUNTNO` varchar(50) DEFAULT NULL,
  `CUSTBALANCE` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`CUSTOMER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customerinfo`
--

LOCK TABLES `customerinfo` WRITE;
/*!40000 ALTER TABLE `customerinfo` DISABLE KEYS */;
INSERT INTO `customerinfo` VALUES ('R-01','tanmayy','patel','tanmay14','ramila123','Father','narendra','thane','indian','india','kkarnataka','C03','tanmay14@outlook.com','Male','Married','9029739900','2015-12-03','1994-09-09','savings','10','100000','ppd','SBIN10010','Indian','BKUPP6424J','pan','1245','ramila','2000000001000000','thane','2016-01-01','yes','2000000001000001','999900'),('R-058','ankita','rambole','ankita92','rambo','Father','sanjay','pune','Indian','India','Kerela','C02','ankita92@gmail.com','Male','Married','9029739900','2017-04-23','1992-09-30','Savings','10','5000','Alapuzha','ALAP0001','Normal','1qwe32we4r','DL','qasw23ed43','tanmay','2000000001000001','thane','2017-04-23','yes','0058230417031144','1000000');
/*!40000 ALTER TABLE `customerinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loan`
--

DROP TABLE IF EXISTS `loan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `loan` (
  `LOANTYPE` varchar(50) NOT NULL,
  `LOANID` varchar(50) NOT NULL,
  `LOANAMOUNT` varchar(50) NOT NULL,
  `LOANISSUEDATE` date NOT NULL,
  `LOANAPPLYDATE` date NOT NULL,
  `RATE` varchar(50) NOT NULL,
  `DURATION` varchar(50) NOT NULL,
  `COURSEFEE` varchar(50) DEFAULT NULL,
  `COURSE` varchar(50) DEFAULT NULL,
  `FATHERNAME` varchar(50) DEFAULT NULL,
  `FATHEROCCUPATION` varchar(50) DEFAULT NULL,
  `FATHERTOTALEXP` varchar(50) DEFAULT NULL,
  `FATHEREXPCURCMPY` varchar(50) DEFAULT NULL,
  `RATIONCARDNO` varchar(50) DEFAULT NULL,
  `ANNUALINCOME` varchar(50) DEFAULT NULL,
  `COMPANYNAME` varchar(50) DEFAULT NULL,
  `DESIGNATION` varchar(50) DEFAULT NULL,
  `TOTALEXP` varchar(50) DEFAULT NULL,
  `EXPCURCMPY` varchar(50) DEFAULT NULL,
  `CUSTOMER_ID` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`LOANID`),
  KEY `fk1_idx` (`CUSTOMER_ID`),
  CONSTRAINT `fk1` FOREIGN KEY (`CUSTOMER_ID`) REFERENCES `customerinfo` (`CUSTOMER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loan`
--

LOCK TABLES `loan` WRITE;
/*!40000 ALTER TABLE `loan` DISABLE KEYS */;
INSERT INTO `loan` VALUES ('Personal','L-096','10000','2017-05-23','2017-04-23','12.99','5',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'cognizant','pat','6','2','R-01'),('Housing','L-191','10000','2017-05-23','2017-04-23','9.50','10',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'cognizant','pat','3','2','R-01'),('Educational','L-826','100','2017-05-23','2017-04-23','9.33','5','100','btech','sanjay','business','5','2','123e4r56tr','100000',NULL,NULL,NULL,NULL,'R-058');
/*!40000 ALTER TABLE `loan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaction` (
  `TRANSACTION_ID` varchar(50) NOT NULL,
  `CUSTOMER_ID` varchar(50) DEFAULT NULL,
  `NEWCUSTOMERBALANCE` varchar(50) DEFAULT NULL,
  `TRANSACTION_TYPE` varchar(50) DEFAULT NULL,
  `TRANSACTION_DATE` date DEFAULT NULL,
  `TRANSACTION_AMOUNT` varchar(50) DEFAULT NULL,
  `APPROVAL_STATUS` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`TRANSACTION_ID`),
  KEY `fk2_idx` (`CUSTOMER_ID`),
  CONSTRAINT `fk2` FOREIGN KEY (`CUSTOMER_ID`) REFERENCES `customerinfo` (`CUSTOMER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` VALUES ('T-009','R-01',NULL,'Withdrawal','2017-04-23','1000',NULL),('T-162','R-058','1000000','Withdrawal','2017-04-23','1000',NULL),('T-465','R-01','10100','Deposit','2017-04-23','100',NULL),('T-828','R-058','1001000','Deposit','2017-04-23','1000',NULL),('T-908','R-01','999900','Withdrawal','2017-04-23','100',NULL),('T-928','R-01','NaN','Deposit','2017-04-23','100000',NULL);
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bms'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-24  0:29:57
