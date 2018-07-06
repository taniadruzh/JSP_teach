<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Title</title>

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
         <c:if test="${param.firstName.equals(\"MAN\")}">
         <td>${student.sex}</td>
         </c:if>
         </c:forEach>
     </tr>
 </table>
</body>
</html>
