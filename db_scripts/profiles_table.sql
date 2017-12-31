create table users (
user_id int NOT NULL AUTO_INCREMENT,
username varchar(20) not null,
first_name varchar(50) not null,
middle_name varchar(50),
last_name varchar(50),
password varchar(500) not null,
email varchar(100),
dob date,
obsolete int,
terms_and_condition int,
entity_id int,
primary key (user_id)
);

create table address (

address_id int NOT NULL AUTO_INCREMENT,

module_name varchar(200),

address_type varchar(20),

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

