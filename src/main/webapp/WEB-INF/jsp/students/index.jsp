<%--@elvariable id="student" type="mvc.entity.Student"--%>
<%--
  Created by IntelliJ IDEA.
  User: armando
  Date: 11/01/24
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Students</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/">Home</a>
<h1>Students</h1>
Student: <strong>${student.firstName} ${student.lastName}, ${student.age} years old.</strong><br/>
Topic selected: <strong>${student.optional}</strong><br>
Country: <strong>${student.country}</strong><br>
Language(s): <strong>${student.language}</strong><br>
Email: <strong>${student.email}</strong><br>
Zip Code: <strong>${student.zipCode}</strong><br>

</body>
</html>
