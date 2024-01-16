<%--
  Created by IntelliJ IDEA.
  User: armando
  Date: 10/01/24
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="es">
<head>
    <title>First Example</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css">
</head>
<body>

<h1>First Example with MVC in Spring</h1>
<a href="${pageContext.request.contextPath}/forms">Forms</a><br>
<a href="students/show-form">Students</a><br>
<a href="connection">Connection Database</a><br>
<a href="crud">CRUD with hibernate and MVC</a>
<br>

<img alt="picture of whiteboard" src="${pageContext.request.contextPath}/static/img/whiteboard.jpg" width="250px">
</body>
</html>
