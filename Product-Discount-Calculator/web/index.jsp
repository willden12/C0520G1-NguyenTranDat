<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 9/25/2020
  Time: 8:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Currency Converter</h2>
<form action="/convert" method="post">
  <label>Product Description: </label><br/>
  <input type="text" name="Description" placeholder="DESCRIPTION" value="..."/><br/>
  <label>List Price: </label><br/>
  <input type="text" name="Price" placeholder="PRICE" value=""/><br/>
  <label>Discount Percent: </label><br/>
  <input type="text" name="Percent" placeholder="PERCENT" value="0"/><br/>
  <input type = "submit" id = "submit" value = "Converter"/>
</form>
</body>
</html>
