create database classmoto;
use classmoto;

create table Customer(
customerNumber
customerName
contactLastName
contactFirstName
phone
addressLine1
addressLine2
city
state
postalCode
country
creditLimit
)
create table orders(
orderNumber
orderDate
requiredDate
shippedDate
`status`
comments
quantityOrdered
priceEach
)
create table payments(
customerNumber
checkNumber
paymentDate
amount
)
create table products(
productCode
productName
productScale
productVendor
productDescription
quantityInStock
buyPrice
MSRP
)
create table productlines(
productLine
textDescription
image


create table employees(
employeeNumber
lastName
firstName
email
jobTitle


create table offices(
officeCode
city
phone
addressLine1
addressLine2
state
country
postalCode
