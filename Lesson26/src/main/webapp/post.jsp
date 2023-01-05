<%@ page import="com.tms.MyCar" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<form method="post" action="/">
    <input type="text" placeholder="Model" name="model"><br>
    <input type="text" placeholder="Year" name="year" ><br>
    <input type="text" placeholder="id" name="id"><br>
    <input type="submit" placeholder="confirm">
</form>
<hr>
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

