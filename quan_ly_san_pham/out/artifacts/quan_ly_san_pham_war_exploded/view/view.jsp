<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>product details</h1>
<p>
    <a href="/servlet">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["customer"].getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["customer"].getPrice()}</td>
    </tr>
    <tr>
        <td>Description: </td>
        <td>${requestScope["customer"].getDescription()}</td>
    </tr>
    <tr>
        <td>Manufacturer: </td>
        <td>${requestScope["customer"].getManufacturer()}</td>
    </tr>
</table>
</body>
</html>
