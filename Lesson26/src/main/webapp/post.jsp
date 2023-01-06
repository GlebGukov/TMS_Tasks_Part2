<%@ page import="com.tms.MyCar" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/add">
    <input type="text" placeholder="Model" name="model"><br>
    <input type="text" placeholder="Year" name="year" ><br>
    <input type="text" placeholder="id" name="id"><br>
    <input type="submit" placeholder="confirm">
</form>
<hr>
<form action="/">
    <button>Вернуться на главную</button>
</form>


</body>
</html>