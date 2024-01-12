<%--
  Created by IntelliJ IDEA.
  User: armando
  Date: 11/01/24
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student form</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/">Home</a>
<h1>Student form</h1>

<%--@elvariable id="student" type="mvc.model.Student"--%>
<form:form action="add-student" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <form:errors path="firstName" cssStyle="color: red;"/><br/>
    Last name: <form:input path="lastName"/><br/>
    Age: <form:input path="age"/>
    <form:errors path="age" cssStyle="color: red;"/><br/>
    Email: <form:input path="email"/>
    <form:errors path="email" cssStyle="color: red;"/><br/>
    Zip Code: <form:input path="zipCode"/>
    <form:errors path="zipCode" cssStyle="color: red;"/><br/>
    Topic:
    <%--<form:select path="optional" multiple="true"> --%>
    <form:select path="optional">
        <form:option value="Maths" label="Maths"/>
        <form:option value="Physics" label="Physics"/>
        <form:option value="Chemistry" label="Chemistry"/>
    </form:select>
    <br>
    Country:<br>
    <form:radiobutton path="country" value="Mexico"/>Mexico<br>
    <form:radiobutton path="country" value="England"/>England<br>
    <form:radiobutton path="country" value="France"/>France<br>
    Language:<br>
    Spanish<form:checkbox path="language" value="Spanish"/><br>
    English<form:checkbox path="language" value="English"/><br>
    French<form:checkbox path="language" value="French"/><br>
    <br><br>
    <input type="submit" value="Add student"/>
</form:form>

</body>
</html>
