<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta content="text/html; charset=utf-8">
    <title>List of Users</title>

    <link rel=stylesheet type="text/css" href="./css/style.css">
</head>
<body>
<h1>List of registered users</h1>

<c:forEach items="${users}" var="user">
    <c:out value="${user.name}, ${user.age} years, email: ${user.email}"/>
    <br/>
</c:forEach>

</body>
</html>
