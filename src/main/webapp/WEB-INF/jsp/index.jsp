<%--
  Created by IntelliJ IDEA.
  User: armando
  Date: 10/01/24
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
    <title>First Example</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css">
</head>
<body>

<h1 class="text-2xl font-bold">First Example with MVC in Spring</h1>
<a
        class="text-slate-600"
        href="${pageContext.request.contextPath}/forms">Forms</a>
<a
        class="text-slate-600"
        href="students/show-form">Students</a>

<img alt="picture of whiteboard" src="${pageContext.request.contextPath}/static/img/whiteboard.jpg" width="250px">
</body>
</html>
