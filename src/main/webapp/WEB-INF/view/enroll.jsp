<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta content="text/html; charset=utf-8">
    <title>Enroll</title>
    <link rel=stylesheet type="text/css" href="./css/style.css">
</head>
<body>
<div class = "wrapper">
    <div class = "header">
        <div class = "header_logo">
            SLOWNEWS
        </div>
        <ul class = "header_menu">
            <li class = "menu_item">
                <a class = "menu_link" href = "mainNews">NEWS</a>
            </li>
            <li class = "menu_item">
                <a class = "menu_link" href = "archive">ARCHIVE</a>
            </li>
            <li class = "menu_item login_item">
                <a class = "menu_link" href = "login">LOGIN</a>
            </li>
        </ul>
    </div>
    <div class = "enroll">
        <form method = post>
            <div class = "enroll_form">
                <p class = "text_input">Username : <input type="username" name="username" placeholder="Username"/></p>
                <p class = "text_input">Age : <input type="age" name="age" placeholder="25"/></p>
                <p class = "text_input">Email : <input type="email" name="email" placeholder="name@email.com"/></p>
                <p class = "text_input">Password : <input type="password" name="pwd" placeholder="Password"/></p>

                <input class = "simple_btn" type="submit" value="Submit" />
            </div>
        </form>
    </div>
</div>
</body>
</html>
