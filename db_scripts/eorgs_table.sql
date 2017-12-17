create table eorgs (
entity_id int NOT NULL AUTO_INCREMENT,
entity_name varchar(200) not null,
entity_type varchar(20) not null,
parent_entity_id int,
obsolete int,
primary key (entity_id)
);


