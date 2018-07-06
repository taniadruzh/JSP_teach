<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
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
<%
    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student("Ivan", "BONEV", "MAN"));
    studentList.add(new Student("Ivan", "BONEV", "MAN"));
    studentList.add(new Student("NANSY", "BOND", "WOMAN"));
    pageContext.setAttribute("studentList", studentList);
%>
<body>
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
         <td>${student.sex}</td>
         </c:forEach>
     </tr>
 </table>
</body>
</html>
