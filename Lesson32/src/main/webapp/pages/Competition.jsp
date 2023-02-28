<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/JockeyController/competitions" method="post" id="comp">
    <label for="1">Type Of Track</label>
    <select form="comp" name="typeOfTrack" id="1">
        <option value="DifficultTrack">Difficult Track</option>
        <option value="EasyTrack">Easy Track</option>
        <option value="DefaultTrack">Default Track</option>
    </select>
    <label for="2">You money</label>
    <input type="number" value="money" name="money" id="2">
    <input type="submit" value="submit" form="comp">
</form>
${comp}
</body>
</html>
