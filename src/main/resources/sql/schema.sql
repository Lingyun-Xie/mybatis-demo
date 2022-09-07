drop table if exists t_user;

create table t_user (
    id int(11) not null auto_increment,
    username varchar(255) not null,
    age varchar(255) default null,
    primary key(id)
);