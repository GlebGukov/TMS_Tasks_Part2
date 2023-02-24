<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Pages</title>
</head>
<body>
<div class="container">
    <div>
    <h1>Hello, welcome to home page of horses racing</h1>
    <h2>What would do you like ? </h2>
        <form method="get" action="/JockeyController">
            <button>Create new Jockey</button>
        </form>
        <form method="get" action="/JockeyController/all">
            <button>Show all Jockeys</button>
        </form>
        <form method="get" action="/competition">
            <button>Competitions</button>
        </form>
    </div>


</div>
</body>
</html>
