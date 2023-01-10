<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>id</th>
        <th>model</th>
        <th>year</th>
        <th>Delete?</th>
    </tr>
    <c:forEach items="${cars}" var="car">
        <form method="post" action="/delete">
            <tr>
                <td>${car.id}</td>
                <td>${car.model}</td>
                <td>${car.year}</td>
                <td><input type="submit" value="confirm"><input type="hidden" name="id" value="${car.id}"></td>
            </tr>
            <br>
        </form>
    </c:forEach>
</table>
<hr>
Data Base :
<table>
    <tr>
        <th>id</th>
        <th>model</th>
        <th>year</th>
        <th>Delete?</th>
    </tr>
    <c:forEach items="${carsBase}" var="car">
        <form method="post" action="/delete">
            <tr>
                <td>${car.id}</td>
                <td>${car.model}</td>
                <td>${car.year}</td>
                <td><input type="submit" value="confirm"><input type="hidden" name="delete" value="${car.id}"></td>
            </tr>
        </form>
        <br>
    </c:forEach>
</table>

<form action="/">
    <button>Вернуться на главную</button>
</form>

</body>
</html>
