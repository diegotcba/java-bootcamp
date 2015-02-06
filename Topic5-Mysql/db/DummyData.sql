#
# Dummy Data generated from 
# http://www.generatedata.com/
# https://www.mockaroo.com/
# http://dummydata.me/
#

use `high-school`;

INSERT INTO `Student` (`registrationNumber`,`firstName`,`lastName`,`dateBirth`) VALUES (1,"Beverly","Huffman","1990-03-02"),(2,"Nathaniel","Sandoval","1983-05-28"),(3,"Dominique","Mays","1981-10-31"),(4,"Nicole","Crawford","1988-06-25"),(5,"Flynn","Silva","1984-10-20"),(6,"Phyllis","Boyd","1983-04-01"),(7,"Maia","Hubbard","1984-01-03"),(8,"Nicholas","Kelly","1995-11-02"),(9,"Lacey","Myers","1986-08-07"),(10,"Keelie","Underwood","1989-04-21");
INSERT INTO `Student` (`registrationNumber`,`firstName`,`lastName`,`dateBirth`) VALUES (11,"Vernon","Mann","1995-06-11"),(12,"Winifred","Manning","1980-06-08"),(13,"Quentin","Simmons","1989-09-29"),(14,"Gannon","Savage","1985-09-19"),(15,"Moana","Newton","1983-01-04"),(16,"Tallulah","Espinoza","1985-08-10"),(17,"Fleur","Harrell","1988-05-24"),(18,"Brenna","Rojas","1980-02-12"),(19,"Scarlet","Bush","1986-12-23"),(20,"Yen","Ray","1982-09-15");
INSERT INTO `Student` (`registrationNumber`,`firstName`,`lastName`,`dateBirth`) VALUES (21,"Hope","Chambers","1984-02-13"),(22,"Melanie","Reeves","1992-06-29"),(23,"Jacqueline","Case","1980-05-18"),(24,"Bo","Barber","1993-07-01"),(25,"Stacy","Duffy","1990-02-16"),(26,"Indira","Ramsey","1994-08-09"),(27,"Ronan","Prince","1985-06-10"),(28,"Bell","George","1983-05-18"),(29,"Amethyst","Phillips","1989-10-23"),(30,"Alisa","Hudson","1988-09-16");
INSERT INTO `Student` (`registrationNumber`,`firstName`,`lastName`,`dateBirth`) VALUES (31,"Leslie","Rogers","1988-10-15"),(32,"Dylan","Emerson","1993-03-03"),(33,"Cally","Terrell","1985-09-27"),(34,"Neil","Hurley","1989-03-18"),(35,"Orson","Holden","1993-08-20"),(36,"Amery","Franks","1992-08-09"),(37,"Gretchen","Mcguire","1983-03-10"),(38,"Aiko","Cote","1985-05-07"),(39,"Celeste","Payne","1982-08-10"),(40,"Carly","Brooks","1982-07-14");
commit;

INSERT INTO `Teacher` (`idTeacher`,`firstName`,`lastName`,`dateBirth`) VALUES (1,"Tucker","Chang","1988-04-03"),(2,"Alden","Leonard","1988-04-17 10:04:41"),(3,"Maryam","Adams","1980-10-01"),(4,"Ariel","Sweeney","1981-11-14"),(5,"Thane","Bond","1989-01-18");
INSERT INTO `Teacher` (`idTeacher`,`firstName`,`lastName`,`dateBirth`) VALUES (6,"Gannon","Shaw","1981-03-11"),(7,"Bruce","Nielsen","1973-06-29 19:10:07"),(8,"Yoshi","Vance","1989-10-07"),(9,"Gannon","Snow","1982-04-29"),(10,"Blythe","Salinas","1975-05-09");
commit;

insert into Course (idCourse, name, assignedTeacher, hoursWeek) values (1, 'Tajik', 7, 1);
insert into Course (idCourse, name, assignedTeacher, hoursWeek) values (2, 'Hiri Motu', 5, 5);
insert into Course (idCourse, name, assignedTeacher, hoursWeek) values (3, 'Lao', 10, 5);
insert into Course (idCourse, name, assignedTeacher, hoursWeek) values (4, 'Portuguese', 1, 2);
insert into Course (idCourse, name, assignedTeacher, hoursWeek) values (5, 'Belarusian', 2, 1);
insert into Course (idCourse, name, assignedTeacher, hoursWeek) values (6, 'Kashmiri', 4, 1);
insert into Course (idCourse, name, assignedTeacher, hoursWeek) values (7, 'Guaraní', 10, 2);
insert into Course (idCourse, name, assignedTeacher, hoursWeek) values (8, 'Kurdish', 9, 1);
insert into Course (idCourse, name, assignedTeacher, hoursWeek) values (9, 'Quechua', 6, 3);
insert into Course (idCourse, name, assignedTeacher, hoursWeek) values (10, 'Icelandic', 8, 5);
commit;

INSERT INTO `StudentCourse` (`registrationNumber`,`idCourse`,`year`,`parcialNote1`,`parcialNote2`,`parcialNote3`,`finalNote`) VALUES (12,2,2015,7,2,4,10),(37,3,2015,8,10,2,4),(3,3,2014,10,2,8,2),(31,6,2015,8,4,7,7),(10,4,2015,8,7,3,8),(11,3,2015,4,9,7,6),(1,4,2013,3,6,5,10),(37,4,2014,3,7,7,6),(31,9,2013,7,7,4,10),(23,7,2015,6,8,9,6);
commit;

INSERT INTO `StudentCourse` (`registrationNumber`,`idCourse`,`year`,`parcialNote1`,`parcialNote2`,`parcialNote3`,`finalNote`) VALUES (20,7,2013,5,10,8,2),(20,4,2015,7,9,7,5),(14,5,2014,10,10,10,10),(8,4,2014,8,6,4,10),(11,4,2015,4,2,8,3),(8,5,2015,3,2,10,6),(6,5,2014,6,4,6,3),(3,1,2013,3,9,2,8),(6,7,2013,10,4,6,2),(8,3,2014,5,5,7,3);
commit;

INSERT INTO `StudentCourse` (`registrationNumber`,`idCourse`,`year`,`parcialNote1`,`parcialNote2`,`parcialNote3`,`finalNote`) VALUES (29,1,2013,9,5,4,7),(29,8,2014,3,8,10,10),(19,2,2013,7,2,6,6),(26,7,2013,3,8,6,8),(13,9,2015,2,9,8,7),(29,3,2015,2,9,4,8),(32,7,2014,6,4,4,6),(32,5,2015,10,8,2,7),(22,4,2014,8,2,7,8),(7,2,2014,7,10,6,9);
commit;

INSERT INTO `StudentCourse` (`registrationNumber`,`idCourse`,`year`,`parcialNote1`,`parcialNote2`,`parcialNote3`,`finalNote`) VALUES (3,8,2014,10,4,6,6),(3,2,2015,2,5,9,2),(11,10,2013,8,5,2,3),(26,1,2015,6,4,8,10),(30,3,2015,10,4,2,3),(31,3,2014,3,4,7,7),(24,9,2014,7,7,8,3),(15,10,2014,7,4,7,2),(23,4,2014,2,6,8,3),(30,8,2014,10,9,9,8);
commit;

INSERT INTO `StudentCourse` (`registrationNumber`,`idCourse`,`year`,`parcialNote1`,`parcialNote2`,`parcialNote3`,`finalNote`) VALUES (18,1,2014,7,6,9,7),(15,10,2013,6,5,8,10),(23,10,2013,10,8,4,9),(39,2,2014,9,5,2,3),(6,4,2015,6,5,9,6),(33,9,2013,6,4,8,3),(18,5,2015,7,9,3,4),(21,7,2013,8,4,6,6),(19,5,2015,10,7,5,7),(35,1,2015,9,7,3,10);
commit;

INSERT INTO `StudentCourse` (`registrationNumber`,`idCourse`,`year`,`parcialNote1`,`parcialNote2`,`parcialNote3`,`finalNote`) VALUES (39,3,2014,2,8,5,2),(11,4,2014,6,5,10,10),(6,5,2013,10,3,9,5),(20,4,2013,10,10,7,6),(38,6,2015,10,6,2,4),(29,9,2015,3,3,9,3),(35,7,2013,3,3,3,3),(1,2,2014,10,9,3,6),(26,2,2013,6,9,4,8),(6,6,2015,8,8,8,9);
commit;

INSERT INTO `StudentCourse` (`registrationNumber`,`idCourse`,`year`,`parcialNote1`,`parcialNote2`,`parcialNote3`,`finalNote`) VALUES (32,5,2014,10,7,5,8),(34,8,2015,8,7,9,5),(6,6,2014,5,10,10,7),(2,7,2015,7,7,4,7),(13,6,2014,5,5,6,7),(19,1,2015,7,7,2,3),(18,3,2013,7,8,3,4),(10,10,2015,9,7,8,5),(23,9,2014,3,4,8,8),(26,9,2013,10,8,2,2);
commit;

INSERT INTO `StudentCourse` (`registrationNumber`,`idCourse`,`year`,`parcialNote1`,`parcialNote2`,`parcialNote3`,`finalNote`) VALUES (7,10,2015,5,5,10,6),(9,2,2014,5,9,9,10),(16,10,2015,8,6,2,8),(11,2,2013,7,7,3,3),(12,5,2015,4,8,6,5),(18,10,2015,2,10,8,7),(27,3,2013,5,8,5,6),(26,4,2013,8,6,4,3),(18,9,2013,9,4,8,7),(27,5,2015,4,9,10,3);
commit;

INSERT INTO `StudentCourse` (`registrationNumber`,`idCourse`,`year`,`parcialNote1`,`parcialNote2`,`parcialNote3`,`finalNote`) VALUES (8,2,2013,3,5,7,7),(38,5,2014,3,5,10,9),(29,10,2015,4,8,10,5),(15,4,2015,4,6,3,9),(7,2,2013,2,7,5,4),(16,3,2015,2,9,9,4),(4,6,2015,3,3,3,6),(7,8,2014,10,4,4,9),(13,8,2013,4,10,6,10),(25,3,2013,7,9,10,7);
commit;

INSERT INTO `StudentCourse` (`registrationNumber`,`idCourse`,`year`,`parcialNote1`,`parcialNote2`,`parcialNote3`,`finalNote`) VALUES (11,3,2014,2,2,7,6),(34,9,2015,8,10,6,2),(21,1,2013,4,8,2,9),(6,8,2014,2,4,6,5),(2,1,2014,5,4,7,4),(33,10,2014,8,9,8,10),(15,3,2015,3,9,6,2),(20,2,2015,3,2,6,9),(19,2,2015,7,7,8,2),(37,6,2015,3,8,7,4);
commit;

