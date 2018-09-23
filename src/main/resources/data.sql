


INSERT INTO roles(rolename) VALUES('ROLE_USER');
INSERT INTO roles(rolename) VALUES('ROLE_ADMIN');


INSERT into Person values (1, 'Alex', 'Brown');
INSERT into Person values (2, 'Smith', 'Wesson');

INSERT into Event values (1, 2500, 1, '12.06.2017 19:49:02', 'Entertainment', 'outcome');
INSERT into Event values (2, 1500, 1, '12.06.2017 19:49:02', 'Car', 'income');
INSERT into Event values (3, 5200, 3, '12.06.2017 19:49:02', 'Home', 'outcome');

INSERT into BILL values (1, 'RUB', 250000);

INSERT into USERS values (1,'andrew@gmail.com','Andrew',  'as8akl', 'AndrewUser');
INSERT into USERS values (2,'mask@gmail.com', 'Mask', 'asyjrx42sse', 'MaskUser');
INSERT into USERS values (3,'mia@gmail.com', 'Mia', 'asdxzcwq', 'MiaUser');

INSERT into CATEGORY values (1, 15000, 'Home');
INSERT into CATEGORY values (2, 4000, 'Car');
INSERT into CATEGORY values (3, 6000, 'Entertainment');

INSERT INTO USER_ROLES(user_id, role_id) VALUES(1,1);
INSERT INTO USER_ROLES(user_id, role_id) VALUES(1,2);
INSERT INTO USER_ROLES(user_id, role_id) VALUES(2,1);
INSERT INTO USER_ROLES(user_id, role_id) VALUES(3,1);
