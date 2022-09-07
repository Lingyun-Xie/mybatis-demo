# mybatis-demo

## 初始化数据库
docker pull mysql

docker run --name=mysql -it -p 3306:3306 -e  MYSQL_ROOT_PASSWORD=123456 -d mysql

mysql -u root -p -h 10.201.64.125

create table t_user ( id int(11) not null auto_increment,username varchar(255) not null,age varchar(255) default null,primary key(id));

INSERT INTO t_user(username, age) VALUES('张三','18');

INSERT INTO t_user(username, age) VALUES('李四','20');

INSERT INTO t_user(username, age) VALUES	('王五',	'22');