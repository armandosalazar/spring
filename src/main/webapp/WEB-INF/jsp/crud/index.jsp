<%--
  Created by IntelliJ IDEA.
  User: armando
  Date: 15/01/24
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>CRUD</title>
</head>
<body>
<h1>CRUD</h1>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>First name</th>
        <th>Last name</th>
        <th>Email</th>
    </tr>
    </thead>
    <tbody>
    <%--@elvariable id="clients" type="java.util.List"--%>
    <%--@elvariable id="client" type="mvc.entity.Client"--%>
    <c:forEach items="${clients}" var="client">
        <tr>
            <td>${client.id}</td>
            <td>${client.firstName}</td>
            <td>${client.lastName}</td>
            <td>${client.email}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<style>
    table {
        border-collapse: collapse;
    }

    table, th, td {
        border: 1px solid black;
    }
</style>

</body>
</html>
