<%--@elvariable id="student" type="mvc.model.Student"--%>
<%--
  Created by IntelliJ IDEA.
  User: armando
  Date: 11/01/24
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students</title>
</head>
<body>
<h1>Students</h1>
Student: <strong>${student.firstName} ${student.lastName}</strong><br/>
Topic selected: <strong>${student.optional}</strong><br>
Country: <strong>${student.country}</strong><br>
Language(s): <strong>${student.language}</strong><br>

</body>
</html>
