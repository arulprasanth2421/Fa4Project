CREATE DATABASE `userdb` ;
USE `userdb`;



--
-- Table structure for table `buyer`
--


 
CREATE TABLE `buyer` (
  `BUYERID` int(11) NOT NULL,
  `NAME` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `PHONENUMBER` varchar(45) NOT NULL,
  `PASSWORD` varchar(45) NOT NULL,
  `ISPRIVILEGED` tinyint(1) DEFAULT NULL,
  `REWARDPOINTS` int(11) DEFAULT NULL,
  `ISACTIVE` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`BUYERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `buyer`
--
insert into buyer values('saurabh kumar','saurabh@gmail.com','7777766666','Kumar@w*3996');
insert into buyer values('Akash kumar','akash@gmail.com','7777766555','Akash@w*3996');


--
-- Table structure for table `cart`
--


CREATE TABLE `cart` (
  `BUYERID` int(11) NOT NULL,
  `PRODID` int(11) NOT NULL,
  `QUANTITY` int(11) NOT NULL,
  PRIMARY KEY (`BUYERID`,`PRODID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `cart`
--






--
-- Table structure for table `seller`
--



CREATE TABLE `seller` (
  `SELLERID` int(11) NOT NULL,
  `NAME` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `PHONENUMBER` varchar(45) NOT NULL,
  `PASSWORD` varchar(45) NOT NULL,
  `ISACTIVE` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`SELLERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




--
-- Dumping data for table `seller`
--

insert into seller values('Roshan kumar','mroshan@gmail.com','8484886578','Roshan@w*2338');
insert into seller values('Jack','jack@gmail.com','9898989898','Don@w*7777');



--
-- Table structure for table `wishlist`
--



CREATE TABLE `wishlist` (
  `BUYERID` int(11) NOT NULL,
  `PRODID` int(11) NOT NULL,
  PRIMARY KEY (`BUYERID`,`PRODID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `wishlist`
--



