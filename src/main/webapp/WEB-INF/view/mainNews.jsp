<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta content="text/html; charset=utf-8">
    <title>Slow News</title>
    <link rel=stylesheet type="text/css" href="./css/style.css">
</head>
<body>
<div class = "wrapper">
    <div class = "header">
        <a name="header"></a>
        <div class = "header_logo">
            SLOWNEWS
        </div>
        <ul class = "header_menu ">
            <li class = "menu_item active">
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
    <div class = "news_content">
    <c:forEach items = "${newsList}" var = "news">
        <h1>${news.header}</h1>
        <img class = "image" src="${news.image}" alt = ${news.header}>
        <div class = "text">
                ${news.text}
        </div>
        <div class = "afterwords">
            ${news.date},${news.source}
        </div>
        <button class = "toArchive_btn">add to Archive</button>
        <a class = "upstairs" href="#header">to the top</a>
    </c:forEach>
</div>
</div>
</body>
</html>