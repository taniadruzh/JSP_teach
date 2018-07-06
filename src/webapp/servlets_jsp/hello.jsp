<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 18.06.2018
  Time: 23:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1> I am servlets jsp and HI ${name}</h1>
<br>
<form action="FirstAnnotationServlet" method="get">
    First name: <input type="text" name="firstName"/>
    Last name: <input type="text" name="lastName"/>
    <input type="submit" value="Add" name="id"/>
</form>

<br/><br/>
<form action="FirstAnnotationServlet" method="get">
    First name: <input type="text" name="firstName"/>
    Last name: <input type="text" name="lastName"/>
    <input type="submit" value="Delete" name="id"/>
</form>

<form action="FirstAnnotationServlet" method="get">
    First name: <input type="text" name="firstName"/>
    Last name: <input type="text" name="lastName"/>
    <input type="submit" value="Ref" name="id"/>
</form>

</body>
</html>
