<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.Student" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>

<body>
<%

    List<Student> studentList = com.CallingClassFromJsp.getStudent();
    pageContext.setAttribute("studentList", studentList);
%>
<br/>
The student is conﬁrmed:
<br/>
${param.lastName}
<br/>
${param.firstName}

<table>
    <tr>
        <th>name</th>
        <th>sec name</th>
        <th>sex</th>
    </tr>
    <c:forEach var="student" items="${studentList}">
        <%--<c:out value="${student.sex + '-'+param.firstName}"/>--%>

        <c:if test="${param.firstName.equals(student.sex)}">
            <tr>
                <td>${student.firstName}</td>

                <td>${student.lastName}</td>

                <td>${student.sex}</td>

            </tr>
        </c:if>
    </c:forEach>
</table>

</body>
</html>
