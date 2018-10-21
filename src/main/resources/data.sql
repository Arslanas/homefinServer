


INSERT INTO roles(rolename) VALUES('ROLE_USER');
INSERT INTO roles(rolename) VALUES('ROLE_ADMIN');


INSERT into Person values (1, 'Alex', 'Brown');
INSERT into Person values (2, 'Smith', 'Wesson');


INSERT into BILL values (1, 'RUB',  1, 150000);
INSERT into BILL values (2, 'RUB',  2, 250000);
INSERT into BILL values (3, 'RUB',  3, 350000);

INSERT into USERS values (1,'andrew@gmail.com','Andrew',  '$2a$10$7nlpP1Qlc23mhco18.PGyupjcuRBIVTUIwu7qGAr.ngKYS1YM9IT2', 'AndrewUser');
INSERT into USERS values (2,'mask@gmail.com', 'Mask', '$2a$10$7nlpP1Qlc23mhco18.PGyupjcuRBIVTUIwu7qGAr.ngKYS1YM9IT2', 'MaskUser');
INSERT into USERS values (3,'mia@gmail.com', 'Mia', '$2a$10$7nlpP1Qlc23mhco18.PGyupjcuRBIVTUIwu7qGAr.ngKYS1YM9IT2', 'MiaUser');

INSERT into CATEGORY values (1, 15000, 'Home', 1);
INSERT into CATEGORY values (2, 4000, 'Car', 1);
INSERT into CATEGORY values (3, 6000, 'Entertainment', 1);

INSERT into CATEGORY values (4, 15000, 'Home2', 2);
INSERT into CATEGORY values (5, 4000, 'Car2', 2);
INSERT into CATEGORY values (6, 6000, 'Entertainment2', 2);

INSERT into CATEGORY values (7, 15000, 'Home3', 3);
INSERT into CATEGORY values (8, 4000, 'Car3', 3);
INSERT into CATEGORY values (9, 6000, 'Entertainment3', 3);

INSERT INTO USER_ROLES(user_id, role_id) VALUES(1,1);
INSERT INTO USER_ROLES(user_id, role_id) VALUES(1,2);
INSERT INTO USER_ROLES(user_id, role_id) VALUES(2,1);
INSERT INTO USER_ROLES(user_id, role_id) VALUES(3,1);



INSERT into Event values (1, 2500, 1, '12.06.2017 19:49:02', 'Entertainment', 'outcome', 1);
INSERT into Event values (2, 1500, 1, '12.06.2017 19:49:02', 'Car', 'income', 1);
INSERT into Event values (3, 5200, 3, '12.06.2017 19:49:02', 'Home', 'outcome', 1);

INSERT into Event values (4, 3500, 4, '12.06.2017 19:49:02', 'Entertainment2', 'outcome', 2);
INSERT into Event values (5, 2500, 5, '12.06.2017 19:49:02', 'Car2', 'income', 2);
INSERT into Event values (6, 6200, 6, '12.06.2017 19:49:02', 'Home2', 'outcome', 2);

INSERT into Event values (7, 4500, 7, '12.06.2017 19:49:02', 'Entertainment3', 'outcome', 3);
INSERT into Event values (8, 3500, 8, '12.06.2017 19:49:02', 'Car3', 'income', 3);
INSERT into Event values (9, 7200, 9, '12.06.2017 19:49:02', 'Home3', 'outcome', 3);