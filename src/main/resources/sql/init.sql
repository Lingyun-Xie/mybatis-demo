create TABLE IF NOT EXISTS T_USER (
    ID INT(11) NOT NULL AUTO_INCREMENT,
    USERNAME VARCHAR(255) NOT NULL,
    AGE VARCHAR(255) DEFAULT NULL,
    PRIMARY KEY(ID)
);

insert into T_USER(USERNAME, AGE) values('张三','18');

insert into T_USER(USERNAME, AGE) values('李四','20');

insert into T_USER(USERNAME, AGE) values('王五','22');