drop database if exists my_library;
create database manager_library;
use manager_library;

create table category (
	category varchar(50) primary key,
    text_description text,
    quantity_in_lib int not null
);

create table student_card (
	student_number varchar(15) primary key,
    student_name varchar(50) not null,
    address text not null,
    email varchar(50) not null,
    image mediumblob
);

create table book (
	book_number varchar(15) primary key,
    book_name varchar(50) not null,
    publisher varchar(50) not null,
    author varchar(50) not null,
    publish_year int,
    category varchar(50) not null,
    book_vendor varchar(50) not null,
    book_description mediumtext,
    foreign key (category) references category(category)
);

create table borrow_order (
	book_number varchar(15),
    student_number varchar(15),
    borrow_date Date,
    required_date Date,
    returned_date Date default null,
    `status` varchar(15),
    `comment` text,
    primary key (book_number, student_number, borrow_date),    
    foreign key (student_number) references student_card(student_number),
	foreign key (book_number) references book(book_number)
);