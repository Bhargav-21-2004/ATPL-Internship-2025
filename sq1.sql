USE INTERN;
create table departments1(
departid int,
departname varchar(50)
);
create table courses1(
coursename varchar(50),
courseid int);
create table students(
studentid int,
studentname varchar(50)
);
insert into students values
(242,"bhargav"),
(238,"venky"),
(233,"adhitya");
insert into departments1 (departid,departname) values
(2112,"eee"),
(2113,"ece"),
(2114,"cse");
alter table courses1 add column coursemode varchar(50);
update students set studentname="sai" 
where studentid=242;
drop table courses1;
