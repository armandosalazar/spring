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
    First name: <form:input path="firstName"/>
    <form:errors path="firstName" cssStyle="color: red;"/>
    <br/>
    Last name: <form:input path="lastName"/><br/>
    Topic:
    <%--<form:select path="optional" multiple="true"> --%>
    <form:select path="optional">
        <form:option value="Maths" label="Maths"/>
        <form:option value="Physics" label="Physics"/>
        <form:option value="Chemistry" label="Chemistry"/>
    </form:select>
    <br>
    Mexico: <form:radiobutton path="country" value="Mexico"/>
    England: <form:radiobutton path="country" value="England"/>
    France: <form:radiobutton path="country" value="France"/>
    <br>
    Spanish: <form:checkbox path="language" value="Spanish"/>
    English: <form:checkbox path="language" value="English"/>
    French: <form:checkbox path="language" value="French"/>
    <br><br>
    <input type="submit" value="Add student"/>
</form:form>

</body>
</html>
