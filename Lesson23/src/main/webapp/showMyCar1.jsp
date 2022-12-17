<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyCar</title>
</head>
<body>
<%@ page import="com.tms.Car" %>
<% Car car =(Car) session.getAttribute("Car"); %>
<p> Машина <%=car.getName()%> </p>
<p> Её id номер <%=car.getId()%> </p>
</body>
</html>
