drop database if exists students;
create database students;
use students;

create table Student(
	id int primary key auto_increment,
	ho_ten varchar(50),
    tuoi int,
    khoa_hoc varchar(50),
    so_tien int
    );
    
 insert into Student (ho_ten, tuoi, khoa_hoc, so_tien)
 values
 ('Hoang', 21, 'CNTT', 40000),
 ('Viet', 19, 'DTVT', 320000),
 ('Thanh', 18, 'KTDN', 400000),
 ('Nhan', 19, 'CK', 450000),
 ('Huong', 20, 'TCNH', 500000),
 ('Huong', 20, 'TCNH', 200000);
 
 select * from Student
 where ho_ten like 'Hu%';
 
 select Sum(so_tien) from Student
 where ho_ten = 'huong';
 
 select ho_ten from Student
 group by ho_ten;
 