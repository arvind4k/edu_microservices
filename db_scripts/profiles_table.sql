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
 primary key(student_school_id)
);

create table student_previous_qualification(
 user_id int not null,
 class varchar not null,
 enrollment_date date not null,
 grade varchar(50),
 score varchar(10),
 institution varchar(200),
 university varchar(200),
 passing_year int(4),
 primary key(user_id)
);

create table guardian(
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

