<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

${message}
<br/>

<ul>
    <c:forEach var="user" items="${userList}">
        <li>${user.id} ${user.name} ${user.age}</li>
    </c:forEach>
</ul>

<br/>
<a href="/addController/">
    <button>GO</button>
</a>


</body>
</html>
