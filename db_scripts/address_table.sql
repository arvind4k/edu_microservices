create table address (
address_id int NOT NULL AUTO_INCREMENT,
module_name varchar(200) ,
address_type varchar(20) ,
module_id int,
address1 varchar(50),
address2 varchar(50),
country varchar(50),
zip varchar(20),
city varchar(50),
state varchar(50),
obsolete int,
primary key (address_id)
);

