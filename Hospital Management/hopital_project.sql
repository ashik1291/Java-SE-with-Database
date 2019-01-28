-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 13, 2019 at 05:12 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 5.6.39

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hopital_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `did` int(3) NOT NULL,
  `doct_name` varchar(40) NOT NULL,
  `sex` varchar(5) NOT NULL,
  `age` int(3) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `address` varchar(50) NOT NULL,
  `salary` double(10,2) NOT NULL,
  `dept` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`did`, `doct_name`, `sex`, `age`, `phone`, `address`, `salary`, `dept`) VALUES
(401, 'Dr. Nizamuddin Chowdhury', 'Male', 42, '0143535469', '33/B Uttara,Sector2.\nDhaka-1215', 1200.00, 'Nephrology');

-- --------------------------------------------------------

--
-- Table structure for table `emp`
--

CREATE TABLE `emp` (
  `eid` int(5) NOT NULL,
  `emp_name` varchar(40) NOT NULL,
  `sex` varchar(5) NOT NULL,
  `age` int(3) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `address` varchar(50) NOT NULL,
  `salary` double(10,2) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp`
--

INSERT INTO `emp` (`eid`, `emp_name`, `sex`, `age`, `phone`, `address`, `salary`, `password`) VALUES
(101, 'Shakib Al Hasan', 'Male', 28, '01919292929', '56/F, Kalabagan, Dhaka-1205', 1000.00, 'shakib75'),
(102, 'Ashik Bhuiyan', 'Male', 25, '01621169515', 'Dhaka-1205', 500.00, 'ash236'),
(105, 'Mash', 'Male', 35, '01858585956', 'ahdshf, sdhshg, dghg.', 1500.00, 'mash546');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `pid` int(5) NOT NULL,
  `patient_name` varchar(40) NOT NULL,
  `sex` varchar(6) NOT NULL,
  `age` int(3) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `address` varchar(50) NOT NULL,
  `disease` varchar(50) NOT NULL,
  `doct_name` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`pid`, `patient_name`, `sex`, `age`, `phone`, `address`, `disease`, `doct_name`) VALUES
(102, 'Sumi Akhter', 'Female', 22, '01565656568', '30/A, Mirpur-1210.\nDhaka.', '400.0', 'sumi120'),
(301, 'Ayesha Begum', 'Female', 40, '01916568133', '40 Biswas, Chandina.\nCumilla-3510.', 'CKD', 'Dr. Nizamuddin Chowdhury'),
(401, 'Dr. Nizamuddin Chowdhury', 'Male', 42, '01435353569', '33/B Uttara, Sector 2.\nDhaka', '1200.0', 'Nephrology');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`did`);

--
-- Indexes for table `emp`
--
ALTER TABLE `emp`
  ADD PRIMARY KEY (`eid`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`pid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
