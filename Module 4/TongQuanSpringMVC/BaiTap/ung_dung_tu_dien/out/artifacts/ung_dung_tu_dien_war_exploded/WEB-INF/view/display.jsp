<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 10/14/2020
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form method="post" action="/search">
    <fieldset>
        <legend>Dictionary</legend>
        <table>
            <tr>
                <td><label for="search">Search</label></td>
                <td><input type="text" name="search" placeholder="Search" id="search"></td>
            </tr>
            <tr>
                <td><label for="result">Result</label></td>
                <td><p id="result">${result}</p></td>
            </tr>
            <tr>
                <td><input type="submit" value="Search"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>