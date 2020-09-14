create database classsicmodels;
use classsicmodels;
create table customer(
id int primary key auto_increment,
customername varchar(50),
phone int(10),
city varchar(20),
country varchar(20)
);
insert into customer (customername,phone,city,country)
values
('nguyen',085,'Đà Nẵng','Việt Nam'),
('tran',171,'phu yen','Việt Nam'),
('dat',123,'ha tỉnh','Việt Nam'),
('trum',456,'nhatrang','Việt Nam');
SELECT * FROM customer;
SELECT customerName, phone, city, country FROM customer;
SELECT * FROM customer WHERE city IN ('nguyen',085,'Đà Nẵng','Việt Nam') ;