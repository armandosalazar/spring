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
    <title>Forms</title>
</head>
<body>
<form action="forms/process-form" method="get">
    <label>
        <input type="text" name="name" value="Armando"/>
    </label>
    <input type="submit" value="Send"/>
</form>

<form action="${pageContext.request.contextPath}/forms/process-form-model" method="get">
    <label>
        <input type="text" name="name" value="Armando Salazar"/>
    </label>
    <input type="submit" value="Send"/>
</form>

</body>
</html>
