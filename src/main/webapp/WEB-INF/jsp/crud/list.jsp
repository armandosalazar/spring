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
    <title>Clients</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 class="m-2">Clients</h1>

    <table class="table">
        <thead>
        <tr>
            <th class="align-middle">Id</th>
            <th class="align-middle">First name</th>
            <th class="align-middle">Last name</th>
            <th class="align-middle">Email</th>
            <th class="align-middle">Actions</th>
        </tr>
        </thead>
        <tbody>
        <%--@elvariable id="clients" type="java.util.List"--%>
        <%--@elvariable id="client" type="mvc.entity.Client"--%>
        <c:forEach items="${clients}" var="client">
            <tr>
                <td class="align-middle">${client.id}</td>
                <td class="align-middle">${client.firstName}</td>
                <td class="align-middle">${client.lastName}</td>
                <td class="align-middle">${client.email}</td>
                <td class="align-middle">
                    <button
                            type="button"
                            class="btn btn-primary m-2" onclick="window.location.href='edit-client?id=${client.id}'">
                        Edit
                    </button>
                    <button
                            type="button"
                            class="btn btn-danger m-2" onclick="
                            if (confirm('Are you sure you want to delete this client?')) window.location.href='delete-client?id=${client.id}'">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <button
            type="button"
            class="btn btn-primary m-2" onclick="window.location.href='add-client'">Add Client
    </button>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>


</body>
</html>
