<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new jockey</h1>
<form action="/JockeyController" method="post" id="jockey">
    <label for="1">Type horse</label>
        <select form="jockey" name="typeHorse" id="1">
            <option value="Arabian">Arabian</option>
            <option value="Trotter">Trotter</option>
            <option value="Belarusian">Belarusian</option>
            <option value="Thoroughbreds">Thoroughbreds</option>
        </select>
    <label for="2">Starting number</label>
    <input type="number" value="number" name="number" id="2">
    <input type="submit" value="submit" form="jockey">
</form>

<form action="/" method="get">
    <button>Home page</button>
</form>

${all}
</body>
</html>
