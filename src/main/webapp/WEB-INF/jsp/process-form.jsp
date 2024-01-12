<%--@elvariable id="message" type="String"--%>
<%--
  Created by IntelliJ IDEA.
  User: armando
  Date: 10/01/24
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head lang="es">
    <title>Process Form</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/">Home</a>
<p>${param}</p>
<p>Hi! your name is ${param.name}</p>

${message}

</body>
</html>
