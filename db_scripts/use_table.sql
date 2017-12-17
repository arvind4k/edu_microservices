
create table users (
user_id int NOT NULL AUTO_INCREMENT,
username varchar(200) not null,
first_name varchar(20) not null,
last_name varchar(20) ,
middle_name varchar(20) ,
dob varchar(20),
obsolete int,
primary key (user_id)
);


/*
mysql> describe users;
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| user_id     | int(11)      | NO   | PRI | NULL    | auto_increment |
| username    | varchar(200) | YES  |     | NULL    |                |
| first_name  | varchar(40)  | NO   |     | NULL    |                |
| last_name   | varchar(40)  | YES  |     | NULL    |                |
| obsolete    | int(1)       | YES  |     | NULL    |                |
| middle_name | varchar(30)  | YES  |     | NULL    |                |
| dob         | varchar(20)  | YES  |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
7 rows in set (0.01 sec)
*/