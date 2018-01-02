create table Course (
     course_id int not null auto_increment,
     course_name varchar(50),
     education_level int,
     obsolete int,
     school_year_id int,
     entity_id int,
     primary key (course_id)
);

create table CourseParticulars(
     record_id int not null auto_increment,
     course_id int,
     department_id int,
     subject_id int,
     obsolete int,
    primary key (record_id)
);
