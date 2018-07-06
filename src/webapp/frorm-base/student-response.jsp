<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<%= request.getParameter("firstName") %> <%= request.getParameter("lastName") %>--%>

<p>second way:</p>
<br/>
The student is conﬁrmed: ${param.values()}
The student is conﬁrmed: ${param.lastName} ${param.firstName}


<table>
    <tr>
        <th>name</th>
        <th>sec name</th>
        <th>sex</th>
    </tr>
    <c:forEach var="student" items="${studentList}">
    <tr>
        <td>${student.firstName}</td>
        <td>${student.lastName}</td>
        <c:if test="${student.sex.equals(\"MAN\")}">
            <td>It is a MAN!</td>
        </c:if>
        </c:forEach>
    </tr>
</table>

</body>
</html>
