<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%--
  Created by IntelliJ IDEA.
  User: armando
  Date: 15/01/24
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Client</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<main class="container">
    <h1>Client</h1>
    <%--@elvariable id="client" type="mvc.entity.Client"--%>
    <form:form modelAttribute="client" method="post" action="insert-client">
        <table>
            <tr>
                <td>First name:</td>
                <td><form:input path="firstName" cssClass="form-control"/></td>
            </tr>
            <tr>
                <td>Last name:</td>
                <td><form:input path="lastName" cssClass="form-control"/></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" cssClass="form-control"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit" class="btn btn-primary mb-3">Save</button>
                </td>
            </tr>
        </table>
    </form:form>
</main>

</body>
</html>
