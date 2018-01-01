create table Department (
     department_id int(11) not null auto_increment,
     department_name varchar(25),
     department_head_id int(11),
     obsolete int(1),
     entity_id int(11),
     school_year_id int(11),
    primary key (department_id)
);

create table DepartmentParticulars (
     subject_id int(11) not null auto_increment,
     departmentId int(11),
     subjectName varchar(25),
     subSubjectName varchar(25),
     obsolete int(1),
    primary key (subject_id)
);

