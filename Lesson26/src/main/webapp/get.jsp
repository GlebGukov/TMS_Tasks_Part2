<%@ page import="com.tms.MyCar" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (request.getAttribute("cars")!=null){
        ArrayList<MyCar> cars = (ArrayList<MyCar>) request.getAttribute("cars");
        for (MyCar myCar:cars) {
            out.println(myCar.getId()+" Model: "+myCar.getModel()+" Year: "+myCar.getYear());
            out.print("<br>");
        }
    }
%>

<form action="/">
    <button>Вернуться на главную</button>
</form>

</body>
</html>
