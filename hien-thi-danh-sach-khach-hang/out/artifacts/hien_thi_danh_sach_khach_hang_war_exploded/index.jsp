<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 9/25/2020
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
<%--    <style>--%>
<%--        table,td,th {--%>
<%--            border: 1px solid black;--%>
<%--            text-align: center ;--%>
<%--        }--%>
<%--    </style>--%>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<div style="text-align: justify">
<h1 style="text-align: center">Danh sách khách hàng</h1>
<table class="table table-hover" style="background-color: antiquewhite">
    <thead class="thead-dark">
    <tr>
        <th scope="col">Tên</th>
        <th scope="col">Ngày Sinh</th>
        <th scope="col">Địa chỉ</th>
        <th scope="col">Hình ảnh</th>
    </tr>
    </thead>
    <body>
    <tr>
        <th scope="row">Mai Văn Hoàn</th>
        <td>1983-08-20</td>
        <td>Hà Nội</td>
        <td><img src="hinh1.jpg"width="100" height="100">
        </td>
    </tr>
    <tr>
        <th scope="row">Nguyễn Văn Nam</th>
        <td>1983-08-21</td>
        <td>Bắc Giang</td>
        <td><img src="hinh2.jpg"width="100" height="100"></td>
    </tr>
    <tr>
        <th scope="row">Nguyễn Thái Hòa</th>
        <td>1983-08-22</td>
        <td>Nam Định</td>
        <td><img src="hinh3.jpg"width="100" height="100"></td>
    </tr>
    <tr>
        <th scope=>Trần Đăng Khoa</th>
        <td>1983-08-17</td>
        <td>Hà Tây</td>
        <td>
            <img src="hinh4.jpg"width="100" height="100">
        </td>
    </tr>
    <tr>
        <th>Nguyễn Đình Thi</th>
        <td>1983-08-19</td>
        <td>Hà Nội</td>
        <td><img src="hinh5.jpg" width="100" height="100"></td>
    </tr>
    </body>
</table>
</div>
</body>
</html>
