

alter table emp change roll_no emp_id int  ;

alter table emp change marks sal double;


create table student
(
roll_no int,
name varchar(50),
marks double
);

insert into student values(318,'Gaurav',480);
insert into student values(319,'Gulshan',400);
insert into student values(320,'Hemant',420);
insert into student values(321,'Himani',390);
insert into student values(322,'Hitesh',410);


delete from student where name='Gaurav';

--commit;

alter table student add primary key(roll_no) ;

SHOW COLUMNS FROM student;

desc student;

