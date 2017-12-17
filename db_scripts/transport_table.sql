create table routes (
route_id int NOT NULL AUTO_INCREMENT,
route_name varchar(200) ,
transport_mode varchar(20) ,
cost varchar(10),
obsolete int,
primary key (route_id)
);

create table route_details (
stop_id varchar(200) ,
stop_name varchar(200) ,
route_id int NOT NULL AUTO_INCREMENT,
cost varchar(10),
obsolete int,
primary key (route_id)
);

create table transport (
route_id int NOT NULL AUTO_INCREMENT,
route_name varchar(50) ,
transport_mode varchar(20) ,
obsolete int,
entity_id int,
primary key (route_id)
);

create table transport_particulars (
stop_id int NOT NULL AUTO_INCREMENT,
route_id int,
stop_cost int,
stop_name varchar(50) ,
stop_number int,
obsolete int,
primary key (stop_id)
);

