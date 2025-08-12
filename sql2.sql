use intern;
create table students4(
name varchar(50),
id int,
email varchar(50),
dob date);
insert into students4 (name,id,dob) 
values("bhargav",242,"bhatrgav21@gmail.com"'2004-01-21'),
("adhitya",233,"adhitya233@gmail.com"'2002-08-22'),
("venky",238,"Venkat2382gamil.com"'2004-05-19');
SELECT TIMESTAMPDIFF(YEAR, dob, CURDATE()) AS age,name
 FROM students1
 order by age;
 insert into students1 (name,id,dob) 
values("shyam",240,'2000-01-21'),
("chandra",231,'2008-08-22'),
("jaswanth",237,'2004-05-19');
select timestampdiff(year,dob,curdate()) as age,name
from students1
order by age ;
select name from students1
order by dob desc
limit 2;

drop table students4;
update students4 set  where id =242;