<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<br>
<h1>${name}</h1>

<br/>


<br/></br>


<li>
    <c:forEach var="name" items="${nameList}">
        <ul>${name}</ul>
    </c:forEach>
</li>


<form action="TestServlet" method="get">

    <input type="text" name="fName">
    <br/>

    <input type="submit" value="add" name="id">

</form>

<form action="TestServlet" method="get">

    <input type="text" name="fName">
    <br/>

    <input type="submit" value="delete" name="id">

</form>

 <br/>
<form action="TestServlet" method="get">

    <input type="text" name="fName">
    <br/>

    <input type="submit" value="go" name="id">

</form>


</body>
</html>
