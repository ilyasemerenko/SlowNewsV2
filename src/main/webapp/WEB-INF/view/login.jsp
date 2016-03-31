<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta content="text/html; charset=utf-8">
    <title>Login</title>
    <link rel=stylesheet type="text/css" href="./css/style.css">
</head>
<body>
<div class = "wrapper">
    <a name = "header"></a>
    <%@ include file="header.jsp" %>
    <div class = "login">
        <h2>Login to SLOWNEWS</h2>
        <form method="post">
            <p class = "text_input"><input type="text" name="login" value="" placeholder="Username"></p>
            <p class = "text_input"><input type="password" name="password" value="" placeholder="Password"></p>
            <p class = "remember_me">
                <label>
                    <input type = "checkbox" name = "remember_me">
                    Remember me on this computer
                </label>
            </p>
            <p class="submit"><input class = "simple_btn" type="submit" name="commit" value="Login"></p>
        </form>
        <a class = "enroll_btn" href = "enroll">Registration</a>
        <a class = "enroll_btn" href = "usersList" target = _blank>List of users</a>
    </div>
</div>
</body>
</html>
