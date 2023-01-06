
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete car</title>
</head>
<body>

Введите id машины для ее удаления. Либо 0 - для удаления всех машин.

<form method="post" action="/delete">
  <input type="text" placeholder="id" name="id"><br>
  <input type="submit" placeholder="confirm">
</form>

<form action="/">
    <button>Вернуться на главную</button>
</form>


</body>
</html>
