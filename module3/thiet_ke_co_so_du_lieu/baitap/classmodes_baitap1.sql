drop database if exists classmodes;
create database classmodes;
use classmodes;


create table Customers(
customer_number int primary key auto_increment,
fullname varchar(50),
address varchar(100),
email varchar(50),
phone varchar(20)
);


create table Accounts(
account_number int primary key auto_increment,
account_type varchar(50),
`date` date,
balance varchar(50),
customer_number int,
foreign key (customer_number) references Customers (customer_number)
);

create table Transactions(
tran_number int primary key auto_increment,

`date` date,
amounts varchar(50),
descriptions varchar(100),
customer_number int,
account_number int,
foreign key (customer_number) references Customers(customer_number),
foreign key (account_number) references Accounts(account_number)
);









