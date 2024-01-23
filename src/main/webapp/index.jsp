<%--
  Created by IntelliJ IDEA.
  User: armando
  Date: 15/01/24
  Time: 23:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Welcome RestFul</title>
</head>
<body>
<%--<% response.sendRedirect("crud/list"); %>--%>
<%--<% response.sendRedirect("security"); %>--%>
<%--<h1>WELCOME this is the index.jsp of webapp/</h1>--%>
<%--<a href="admin">Admin</a>--%>
<h1>Home page</h1>
<hr>
<a href="${pageContext.request.contextPath}/api/v1">API hello</a>
<br>
<a href="${pageContext.request.contextPath}/api/users">API endpoint get users</a>
<br>
<a href="${pageContext.request.contextPath}/api/users/1">API endpoint get user by id</a>

</body>
</html>
