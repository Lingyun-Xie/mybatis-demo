# mybatis-demo

## 初始化数据库
docker pull mysql

docker run --name=mysql -it -p 3306:3306 -e  MYSQL_ROOT_PASSWORD=123456 -d mysql

mysql -u root -p -h 10.201.64.125