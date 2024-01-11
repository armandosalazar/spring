<%--
  Created by IntelliJ IDEA.
  User: armando
  Date: 11/01/24
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student form</title>
</head>
<body>
<h1>Student form</h1>

<%--@elvariable id="student" type="mvc.model.Student"--%>
<form:form action="add-student" modelAttribute="student">
    First name: <form:input path="firstName"/><br/>
    Last name: <form:input path="lastName"/><br/><br>
    <input type="submit" value="Add student"/>
</form:form>

</body>
</html>
