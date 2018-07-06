<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>add</h3>
<br/>
<form action="/addController/add" method="get">
    <input type="text" name="name" value="olo">
    <input type="submit" value="add">
</form>


<form action="/addController/add2" method="get" modelAttribute="word">
    <input type="text" name="name" value="part1">
    <input type="text" name="name2" value="part2">
    <input type="submit" value="add">
</form>

</body>
</html>
