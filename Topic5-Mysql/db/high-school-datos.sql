# EMS MySQL Manager Pro 3.4.0.4
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : high-school


SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `high-school`
    CHARACTER SET 'latin1'
    COLLATE 'latin1_swedish_ci';

USE `high-school`;

#
# Structure for the `course` table : 
#

CREATE TABLE `course` (
  `idCourse` int(11) NOT NULL auto_increment,
  `name` varchar(50) NOT NULL,
  `assignedTeacher` int(11) NOT NULL,
  `hoursWeek` int(11) NOT NULL,
  PRIMARY KEY  (`idCourse`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `student` table : 
#

CREATE TABLE `student` (
  `registrationNumber` bigint(20) NOT NULL auto_increment,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `dateBirth` date NOT NULL,
  PRIMARY KEY  (`registrationNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `studentcourse` table : 
#

CREATE TABLE `studentcourse` (
  `registrationNumber` bigint(20) NOT NULL,
  `idCourse` int(11) NOT NULL,
  `year` smallint(6) NOT NULL,
  `parcialNote1` int(11) NOT NULL,
  `parcialNote2` int(11) NOT NULL,
  `parcialNote3` int(11) NOT NULL,
  `finalNote` decimal(11,0) NOT NULL,
  PRIMARY KEY  (`registrationNumber`,`idCourse`,`year`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `teacher` table : 
#

CREATE TABLE `teacher` (
  `idTeacher` int(11) NOT NULL auto_increment,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `dateBirth` date NOT NULL,
  PRIMARY KEY  (`idTeacher`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for the `course` table  (LIMIT 0,500)
#

INSERT INTO `course` (`idCourse`, `name`, `assignedTeacher`, `hoursWeek`) VALUES 
  (1,'Tajik',7,1),
  (2,'Hiri Motu',5,5),
  (3,'Lao',10,5),
  (4,'Portuguese',1,2),
  (5,'Belarusian',2,1),
  (6,'Kashmiri',4,1),
  (7,'Guaraní',10,2),
  (8,'Kurdish',9,1),
  (9,'Quechua',6,3),
  (10,'Icelandic',8,5);

COMMIT;

#
# Data for the `student` table  (LIMIT 0,500)
#

INSERT INTO `student` (`registrationNumber`, `firstName`, `lastName`, `dateBirth`) VALUES 
  (1,'Beverly','Huffman','1990-03-02'),
  (2,'Nathaniel','Sandoval','1983-05-28'),
  (3,'Dominique','Mays','1981-10-31'),
  (4,'Nicole','Crawford','1988-06-25'),
  (5,'Flynn','Silva','1984-10-20'),
  (6,'Phyllis','Boyd','1983-04-01'),
  (7,'Maia','Hubbard','1984-01-03'),
  (8,'Nicholas','Kelly','1995-11-02'),
  (9,'Lacey','Myers','1986-08-07'),
  (10,'Keelie','Underwood','1989-04-21'),
  (11,'Vernon','Mann','1995-06-11'),
  (12,'Winifred','Manning','1980-06-08'),
  (13,'Quentin','Simmons','1989-09-29'),
  (14,'Gannon','Savage','1985-09-19'),
  (15,'Moana','Newton','1983-01-04'),
  (16,'Tallulah','Espinoza','1985-08-10'),
  (17,'Fleur','Harrell','1988-05-24'),
  (18,'Brenna','Rojas','1980-02-12'),
  (19,'Scarlet','Bush','1986-12-23'),
  (20,'Yen','Ray','1982-09-15'),
  (21,'Hope','Chambers','1984-02-13'),
  (22,'Melanie','Reeves','1992-06-29'),
  (23,'Jacqueline','Case','1980-05-18'),
  (24,'Bo','Barber','1993-07-01'),
  (25,'Stacy','Duffy','1990-02-16'),
  (26,'Indira','Ramsey','1994-08-09'),
  (27,'Ronan','Prince','1985-06-10'),
  (28,'Bell','George','1983-05-18'),
  (29,'Amethyst','Phillips','1989-10-23'),
  (30,'Alisa','Hudson','1988-09-16'),
  (31,'Leslie','Rogers','1988-10-15'),
  (32,'Dylan','Emerson','1993-03-03'),
  (33,'Cally','Terrell','1985-09-27'),
  (34,'Neil','Hurley','1989-03-18'),
  (35,'Orson','Holden','1993-08-20'),
  (36,'Amery','Franks','1992-08-09'),
  (37,'Gretchen','Mcguire','1983-03-10'),
  (38,'Aiko','Cote','1985-05-07'),
  (39,'Celeste','Payne','1982-08-10'),
  (40,'Carly','Brooks','1982-07-14');

COMMIT;

#
# Data for the `studentcourse` table  (LIMIT 0,500)
#

INSERT INTO `studentcourse` (`registrationNumber`, `idCourse`, `year`, `parcialNote1`, `parcialNote2`, `parcialNote3`, `finalNote`) VALUES 
  (1,2,2014,10,9,3,'6'),
  (1,4,2013,3,6,5,'10'),
  (2,1,2014,5,4,7,'4'),
  (2,7,2015,7,7,4,'7'),
  (3,1,2013,3,9,2,'8'),
  (3,2,2015,2,5,9,'2'),
  (3,3,2014,10,2,8,'2'),
  (3,8,2014,10,4,6,'6'),
  (4,6,2015,3,3,3,'6'),
  (6,4,2015,6,5,9,'6'),
  (6,5,2013,10,3,9,'5'),
  (6,5,2014,6,4,6,'3'),
  (6,6,2014,5,10,10,'7'),
  (6,6,2015,8,8,8,'9'),
  (6,7,2013,10,4,6,'2'),
  (6,8,2014,2,4,6,'5'),
  (7,2,2013,2,7,5,'4'),
  (7,2,2014,7,10,6,'9'),
  (7,8,2014,10,4,4,'9'),
  (7,10,2015,5,5,10,'6'),
  (8,2,2013,3,5,7,'7'),
  (8,3,2014,5,5,7,'3'),
  (8,4,2014,8,6,4,'10'),
  (8,5,2015,3,2,10,'6'),
  (9,2,2014,5,9,9,'10'),
  (10,4,2015,8,7,3,'8'),
  (10,10,2015,9,7,8,'5'),
  (11,2,2013,7,7,3,'3'),
  (11,3,2014,2,2,7,'6'),
  (11,3,2015,4,9,7,'6'),
  (11,4,2014,6,5,10,'10'),
  (11,4,2015,4,2,8,'3'),
  (11,10,2013,8,5,2,'3'),
  (12,2,2015,7,2,4,'10'),
  (12,5,2015,4,8,6,'5'),
  (13,6,2014,5,5,6,'7'),
  (13,8,2013,4,10,6,'10'),
  (13,9,2015,2,9,8,'7'),
  (14,5,2014,10,10,10,'10'),
  (15,3,2015,3,9,6,'2'),
  (15,4,2015,4,6,3,'9'),
  (15,10,2013,6,5,8,'10'),
  (15,10,2014,7,4,7,'2'),
  (16,3,2015,2,9,9,'4'),
  (16,10,2015,8,6,2,'8'),
  (18,1,2014,7,6,9,'7'),
  (18,3,2013,7,8,3,'4'),
  (18,5,2015,7,9,3,'4'),
  (18,9,2013,9,4,8,'7'),
  (18,10,2015,2,10,8,'7'),
  (19,1,2015,7,7,2,'3'),
  (19,2,2013,7,2,6,'6'),
  (19,2,2015,7,7,8,'2'),
  (19,5,2015,10,7,5,'7'),
  (20,2,2015,3,2,6,'9'),
  (20,4,2013,10,10,7,'6'),
  (20,4,2015,7,9,7,'5'),
  (20,7,2013,5,10,8,'2'),
  (21,1,2013,4,8,2,'9'),
  (21,7,2013,8,4,6,'6'),
  (22,4,2014,8,2,7,'8'),
  (23,4,2014,2,6,8,'3'),
  (23,7,2015,6,8,9,'6'),
  (23,9,2014,3,4,8,'8'),
  (23,10,2013,10,8,4,'9'),
  (24,9,2014,7,7,8,'3'),
  (25,3,2013,7,9,10,'7'),
  (26,1,2015,6,4,8,'10'),
  (26,2,2013,6,9,4,'8'),
  (26,4,2013,8,6,4,'3'),
  (26,7,2013,3,8,6,'8'),
  (26,9,2013,10,8,2,'2'),
  (27,3,2013,5,8,5,'6'),
  (27,5,2015,4,9,10,'3'),
  (29,1,2013,9,5,4,'7'),
  (29,3,2015,2,9,4,'8'),
  (29,8,2014,3,8,10,'10'),
  (29,9,2015,3,3,9,'3'),
  (29,10,2015,4,8,10,'5'),
  (30,3,2015,10,4,2,'3'),
  (30,8,2014,10,9,9,'8'),
  (31,3,2014,3,4,7,'7'),
  (31,6,2015,8,4,7,'7'),
  (31,9,2013,7,7,4,'10'),
  (32,5,2014,10,7,5,'8'),
  (32,5,2015,10,8,2,'7'),
  (32,7,2014,6,4,4,'6'),
  (33,9,2013,6,4,8,'3'),
  (33,10,2014,8,9,8,'10'),
  (34,8,2015,8,7,9,'5'),
  (34,9,2015,8,10,6,'2'),
  (35,1,2015,9,7,3,'10'),
  (35,7,2013,3,3,3,'3'),
  (37,3,2015,8,10,2,'4'),
  (37,4,2014,3,7,7,'6'),
  (37,6,2015,3,8,7,'4'),
  (38,5,2014,3,5,10,'9'),
  (38,6,2015,10,6,2,'4'),
  (39,2,2014,9,5,2,'3'),
  (39,3,2014,2,8,5,'2');

COMMIT;

#
# Data for the `teacher` table  (LIMIT 0,500)
#

INSERT INTO `teacher` (`idTeacher`, `firstName`, `lastName`, `dateBirth`) VALUES 
  (1,'Tucker','Chang','1988-04-03'),
  (2,'Alden','Leonard','1988-04-17'),
  (3,'Maryam','Adams','1980-10-01'),
  (4,'Ariel','Sweeney','1981-11-14'),
  (5,'Thane','Bond','1989-01-18'),
  (6,'Gannon','Shaw','1981-03-11'),
  (7,'Bruce','Nielsen','1973-06-29'),
  (8,'Yoshi','Vance','1989-10-07'),
  (9,'Gannon','Snow','1982-04-29'),
  (10,'Blythe','Salinas','1975-05-09');

COMMIT;

