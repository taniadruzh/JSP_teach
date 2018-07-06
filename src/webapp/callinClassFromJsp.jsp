<%@ page import="com.CallingClassFromJsp" %>
<%@ page import="com.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

Test my method -> <%= com.CallingClassFromJsp.toLowerCase(" HELLO USER")%>


<%
    List<Student> students = com.CallingClassFromJsp.getStudent();

    for (Student s : students) {
        out.println(s.getFirstName());
    }

%>

</body>
</html>
