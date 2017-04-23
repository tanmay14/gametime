-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: bank4
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
-- Table structure for table `account_info`
--

DROP TABLE IF EXISTS `account_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account_info` (
  `Customer_Id` varchar(20) NOT NULL,
  `Account_Type` varchar(20) NOT NULL,
  `Account_Number` varchar(30) NOT NULL DEFAULT '',
  `Registration_Date` date NOT NULL,
  `Initial_Deposit_Amount` double NOT NULL,
  `IFSC_Code` varchar(20) NOT NULL,
  `Activation_Date` date NOT NULL,
  `Account_Balance` double NOT NULL,
  `reference_acc_number` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Account_Number`),
  KEY `FK4` (`Customer_Id`),
  KEY `FK5` (`IFSC_Code`),
  KEY `reference_acc_number` (`reference_acc_number`),
  CONSTRAINT `FK4` FOREIGN KEY (`Customer_Id`) REFERENCES `login_table` (`Customer_Id`),
  CONSTRAINT `FK5` FOREIGN KEY (`IFSC_Code`) REFERENCES `branch_info` (`IFSC_Code`),
  CONSTRAINT `account_info_ibfk_1` FOREIGN KEY (`reference_acc_number`) REFERENCES `account_info` (`Account_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_info`
--

LOCK TABLES `account_info` WRITE;
/*!40000 ALTER TABLE `account_info` DISABLE KEYS */;
INSERT INTO `account_info` VALUES ('R417100','personal','2000000001000000','2015-01-18',3000,'HDVL0012','2015-02-18',2000,'2000000001000000'),('R417108','Savings','2000000001000001','2015-04-23',6000,'AXNU0356','2015-04-28',7000,'2000000001000000'),('R417109','Savings','2000000001000002','2015-04-23',50000,'AXNU0356','2015-04-28',51000,'2000000001000000'),('R417110','Savings','2000000001000003','2017-04-23',500000,'AXNU0356','2017-04-28',499000,'2000000001000000'),('R417111','Salary','2000000001000004','2017-04-23',100000,'AXNU0356','2017-04-28',100000,'2000000001000000'),('R417112','Savings','2000000001000005','2017-04-24',200000,'SBITN0123','2017-04-29',200000,'2000000001000003');
/*!40000 ALTER TABLE `account_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `branch_info`
--

DROP TABLE IF EXISTS `branch_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `branch_info` (
  `IFSC_Code` varchar(20) NOT NULL DEFAULT '',
  `Branch_Name` varchar(20) NOT NULL,
  `Bank_Name` varchar(20) NOT NULL,
  PRIMARY KEY (`IFSC_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch_info`
--

LOCK TABLES `branch_info` WRITE;
/*!40000 ALTER TABLE `branch_info` DISABLE KEYS */;
INSERT INTO `branch_info` VALUES ('AXNU0356','NUMGAMBAKKAM','ABC'),('AXTN0342','TNAGAR','AXIS'),('HDTN0013','TNAGAR','ABC'),('HDVL0012','VALASARAVAKKAM','ABC'),('ICIPG0242','PERUNGUDI','ABC'),('ICITN0232','TNAGAR','ICICI'),('SBISD0113','SAIDAPET','ABC'),('SBITN0123','TNAGAR','SBI');
/*!40000 ALTER TABLE `branch_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `country_details`
--

DROP TABLE IF EXISTS `country_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `country_details` (
  `Country_Id` varchar(20) NOT NULL DEFAULT '',
  `Country_Name` varchar(20) NOT NULL,
  `State` varchar(20) NOT NULL,
  PRIMARY KEY (`Country_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country_details`
--

LOCK TABLES `country_details` WRITE;
/*!40000 ALTER TABLE `country_details` DISABLE KEYS */;
INSERT INTO `country_details` VALUES ('C01','india','TamilNadu'),('C02','india','Kerala'),('C03','india','AndhraPradesh'),('C04','india','Karnataka'),('C05','UK','Scotland'),('C06','USA','New Jersey'),('C07','Italy','Rome');
/*!40000 ALTER TABLE `country_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_details`
--

DROP TABLE IF EXISTS `customer_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_details` (
  `Customer_Id` varchar(20) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `UserName` varchar(20) NOT NULL DEFAULT '',
  `Guardian_Name` varchar(20) NOT NULL,
  `Guardian_Type` varchar(20) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `AlternateAddress` varchar(50) NOT NULL,
  `Country_Id` varchar(20) NOT NULL,
  `Email_Address` varchar(50) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `Marital_Status` varchar(20) NOT NULL,
  `Contact_Number` bigint(20) NOT NULL,
  `AlternateContact_Number` bigint(20) NOT NULL,
  `Date_Of_Birth` date NOT NULL,
  `Citizen_Status` varchar(20) NOT NULL,
  `Citizenship` varchar(20) DEFAULT 'Indian',
  PRIMARY KEY (`UserName`),
  UNIQUE KEY `Email_Address` (`Email_Address`),
  KEY `FK1` (`Country_Id`),
  KEY `FK12` (`Customer_Id`),
  CONSTRAINT `FK1` FOREIGN KEY (`Country_Id`) REFERENCES `country_details` (`Country_Id`),
  CONSTRAINT `FK12` FOREIGN KEY (`Customer_Id`) REFERENCES `login_table` (`Customer_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_details`
--

LOCK TABLES `customer_details` WRITE;
/*!40000 ALTER TABLE `customer_details` DISABLE KEYS */;
INSERT INTO `customer_details` VALUES ('R417101','harii','abcd','xyz','Husband','chennai','chennai','C03','xyz@gmail.com','Male','Single',9290713344,7893655012,'1992-12-10','normal','major'),('R417110','ankita','ankita92','tanmay','Husband','thn','thn','C04','fcgjh13@gmail.com','Male','Single',9029739900,7977170355,'0013-03-08','normal','indian'),('R417108','ghj','gh','vb','Husband','bhjjb','vhj','C03','cgfc@gmail.com','Male','Single',8888899999,9999988888,'1882-12-10','senior','major'),('R417103','hareesh','harii','xyz','Husband','vhn','chn','C03','xyzs1@gmail.com','Male','Single',9290713341,7893655011,'1992-12-10','normal','major'),('R417104','hareesh','hariiwe','xyz','Husband','vhn','chn','C03','xyzssd1@gmail.com','Male','Single',9290713341,7893655011,'1992-12-10','normal','major'),('R417105','hareesh','hariiwewer','xyz','Husband','vhn','chn','C03','xyzssdrd1@gmail.com','Male','Single',9290713341,7893655011,'1992-12-10','normal','major'),('R417102','hareesj','harr','xyz','Husband','vhn','chn','C03','xyz1@gmail.com','Male','Single',9290713341,7893655011,'1992-12-10','normal','major'),('R417106','hareesh','hh','abcd','Husband','chn','chn','C03','abcde@gmail.com','Male','Single',9290715522,7893655123,'1882-12-10','senior','major'),('R417107','hareesha','hhh','abcd','Husband','chn','chn','C03','abcdde@gmail.com','Male','Single',9290715522,7893655123,'1882-12-10','senior','major'),('R417109','joyy','joyy','abc','Husband','chn','chn','C03','abcder@gmail.com','Male','Single',2255889966,6655447788,'0016-01-28','senior','major'),('R417112','pallavi','pappa','dadu','Husband','thn','thn','C07','xdcfvgjbh@gmail.com','female','Single',9029739900,8422034867,'1994-10-30','normal','indian'),('R417111','swapnil','swapnil23','pallavi','Husband','pune','pune','C04','sadsfd@gmail.com','Male','Single',1234321234,7658976754,'1994-12-12','normal','indian'),('R417100','tanmay','tanmay14','narendra','Father','thn','thn','C03','tanmay14@outlook.com','Male','Single',9029739900,7977170355,'1994-12-10','normal','major');
/*!40000 ALTER TABLE `customer_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `identification`
--

DROP TABLE IF EXISTS `identification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `identification` (
  `Customer_Id` varchar(20) NOT NULL,
  `IdentificationProof_Type` varchar(20) NOT NULL,
  `IdentificationDocument_Number` varchar(20) NOT NULL,
  PRIMARY KEY (`IdentificationDocument_Number`),
  KEY `FK2` (`Customer_Id`),
  CONSTRAINT `FK2` FOREIGN KEY (`Customer_Id`) REFERENCES `login_table` (`Customer_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `identification`
--

LOCK TABLES `identification` WRITE;
/*!40000 ALTER TABLE `identification` DISABLE KEYS */;
INSERT INTO `identification` VALUES ('R417100','sttgr','343'),('R417108','Pan','abc987123456'),('R417112','Pan','hyt567432876'),('R417109','Pan','pin987456321'),('R417110','Pan','wap123321985'),('R417111','Pan','wrt123456512');
/*!40000 ALTER TABLE `identification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loan_details`
--

DROP TABLE IF EXISTS `loan_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `loan_details` (
  `Loan_Id` varchar(20) NOT NULL DEFAULT '',
  `Account_Number` varchar(20) NOT NULL,
  `Loan_Type` varchar(20) NOT NULL,
  `Loan_Amount` float NOT NULL,
  `Loan_Apply_Date` date NOT NULL,
  `Loan_Issue_Date` date NOT NULL,
  `Duration_Of_Loan` bigint(20) NOT NULL,
  `Course_Fees` float DEFAULT NULL,
  `Course_Name` varchar(20) DEFAULT NULL,
  `Father_Name` varchar(20) DEFAULT NULL,
  `Father_Occupation` varchar(20) DEFAULT NULL,
  `Father_Total_Experience` varchar(20) DEFAULT NULL,
  `Father_Experience_Company` varchar(20) DEFAULT NULL,
  `Ration_Card_Number` varchar(20) DEFAULT NULL,
  `Annual_Income` float DEFAULT NULL,
  `Customer_Annual_Income` float DEFAULT NULL,
  `Customer_Company_Name` varchar(20) DEFAULT NULL,
  `Customer_Designation` varchar(20) DEFAULT NULL,
  `Customer_Total_Experience` varchar(20) DEFAULT NULL,
  `Customer_Experience_Company` varchar(20) DEFAULT NULL,
  `Loan_Acc_No` varchar(20) NOT NULL,
  `EMI` double NOT NULL,
  `GuarantorName` varchar(20) DEFAULT NULL,
  `GuarantorAddress` varchar(20) DEFAULT NULL,
  `GuarantorIncome` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Loan_Id`),
  KEY `FK6` (`Account_Number`),
  CONSTRAINT `FK6` FOREIGN KEY (`Account_Number`) REFERENCES `account_info` (`Account_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loan_details`
--

LOCK TABLES `loan_details` WRITE;
/*!40000 ALTER TABLE `loan_details` DISABLE KEYS */;
INSERT INTO `loan_details` VALUES ('L-001','2000000001000000','educational',20000,'2015-02-21','2015-02-24',3,43343,'degree','ram','employee','20','esgd','3467687',550344,300000,'asha','ugdg','3','dfgd','2000000001000000',4343,'john','asdf','30000'),('L-002','2000000001000000','Educational',10000,'2015-04-23','2015-05-08',5,50000,'ece','hareesh','study','3','2','wap0201',500000,NULL,NULL,NULL,NULL,NULL,'0000000000000002',222.444626185978,NULL,NULL,NULL),('L-003','2000000001000003','Educational',0,'2017-04-23','2017-05-08',5,0,NULL,NULL,NULL,'0','0',NULL,100000,NULL,NULL,NULL,NULL,NULL,'0000000000000003',222.4446261859785,NULL,NULL,NULL),('L-004','2000000001000005','Educational',1000,'2017-04-24','2017-05-09',5,0,NULL,NULL,NULL,'0','0',NULL,100000,NULL,NULL,NULL,NULL,NULL,'0000000000000004',22.244462618597854,NULL,NULL,NULL),('L-005','2000000001000005','Educational',1000,'2017-04-24','2017-05-09',5,0,NULL,NULL,NULL,'0','0',NULL,100000,NULL,NULL,NULL,NULL,NULL,'0000000000000005',22.244462618597854,NULL,NULL,NULL),('L-006','2000000001000005','Educational',1000,'2017-04-24','2017-05-09',5,0,NULL,NULL,NULL,'0','0',NULL,100000,NULL,NULL,NULL,NULL,NULL,'0000000000000006',22.244462618597854,NULL,NULL,NULL);
/*!40000 ALTER TABLE `loan_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login_table`
--

DROP TABLE IF EXISTS `login_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login_table` (
  `Customer_Id` varchar(20) NOT NULL DEFAULT '',
  `UserName` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  PRIMARY KEY (`Customer_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_table`
--

LOCK TABLES `login_table` WRITE;
/*!40000 ALTER TABLE `login_table` DISABLE KEYS */;
INSERT INTO `login_table` VALUES ('R417100','tanmay14','ramila123'),('R417101','abcd','123'),('R417102','harr','123'),('R417103','harii','456'),('R417104','hariiwe','789'),('R417105','hariiwewer','abc'),('R417106','hh','789'),('R417107','hhh','123'),('R417108','gh','asd'),('R417109','joyy','123'),('R417110','ankita92','rambo'),('R417111','swapnil23','randi'),('R417112','pappa','pappa');
/*!40000 ALTER TABLE `login_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction_details`
--

DROP TABLE IF EXISTS `transaction_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaction_details` (
  `Transaction_Id` varchar(20) NOT NULL DEFAULT '',
  `Account_Number` varchar(20) DEFAULT NULL,
  `Description` varchar(100) NOT NULL,
  `Transaction_Type` varchar(20) NOT NULL,
  `Transaction_Date` date NOT NULL,
  `Transaction_Amount` double NOT NULL,
  `Loan_Id` varchar(20) DEFAULT NULL,
  `Cheque_Number` varchar(20) DEFAULT NULL,
  `balance` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Transaction_Id`),
  KEY `FK7` (`Account_Number`),
  KEY `FK8` (`Loan_Id`),
  CONSTRAINT `FK7` FOREIGN KEY (`Account_Number`) REFERENCES `account_info` (`Account_Number`),
  CONSTRAINT `FK8` FOREIGN KEY (`Loan_Id`) REFERENCES `loan_details` (`Loan_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction_details`
--

LOCK TABLES `transaction_details` WRITE;
/*!40000 ALTER TABLE `transaction_details` DISABLE KEYS */;
INSERT INTO `transaction_details` VALUES ('34556','2000000001000000','dfhhfvfdv','withdrawl','2015-12-03',25466,'L-001','77989','3009000'),('34557','2000000001000000','Deposit to:  2000000001000001','withdrawal','2017-04-23',1000,NULL,'----','2000'),('34558','2000000001000003','Deposit to:  2000000001000002','withdrawal','2017-04-23',1000,NULL,'----','499000'),('34559','2000000001000003','EMI debit from:  0000000000000003','Loan EMI Debit','2017-04-23',10000,'L-003','----','0');
/*!40000 ALTER TABLE `transaction_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bank4'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-24  0:29:38
