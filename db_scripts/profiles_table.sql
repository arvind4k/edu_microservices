create table users (
user_id int NOT NULL AUTO_INCREMENT,
username varchar(20) not null,
first_name varchar(50) not null,
middle_name varchar(50),
last_name varchar(50),
password varchar(500) not null,
email varchar(100),
date_of_birth date,
obsolete int,
terms_and_condition int,
gender varchar(20),
phone varchar(20),
mobile varchar(20),
profile_image varchar(500),
profile_complete int(1),
entity_id int,
creation_date date,
updation_date date,
primary key (user_id)
);

create table student_school_details(
 student_school_id int not null auto_increment,
 user_id int not null,
 course_id int not null,
 section_id int,
 enrollment_date date not null,
 student_category varchar(100),
 transport_id int,
 primary key(student_school_id)
);

create table additional_details(
 additional_info_id int not null auto_increment,
 user_id int not null,
 nationality varchar(100) not null,
 birth_place varchar(50),
 religion varchar(20),
 caste varchar(20),
 subcaste varchar(20),
 primary key(additional_info_id)
);

create table education_details(
 education_id int not null auto_increment,
 user_id int not null,
 course varchar(100) not null,
 grade varchar(50),
 score varchar(10),
 institution varchar(200),
 university varchar(200),
 passing_year int(4),
 obsolete int(1),
 primary key(education_id)
);

create table parent_details(
	guardian_id number not null auto_increment,
	user_id int not null,
	relationship varchar(50),
	first_name varchar(100) not null,
	last_name varchar(100),
	email varchar(100),
	phone varchar(20),
	mobile varchar(20),
	qualification varchar(50),
	primary key(guardian_id)
)

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

create table documents(
document_id int Not null AUTO_INCREMENT,
user_id int not null,
document_name varchar(100) not null,
document_number varchar(100) not null,
issued_by varchar(100) not null,
valid_until date not null,
document_path varchar(500),
obsolete int(1) not null,
primary key(document_id)
)

