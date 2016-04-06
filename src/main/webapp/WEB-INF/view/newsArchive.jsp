<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta content="text/html; charset=utf-8">
    <title>Archive</title>
    <link rel=stylesheet type="text/css" href="./css/style.css">
</head>
<body>
<div class = "wrapper">
    <a name = "header"></a>
    <%@ include file="header.jsp" %>
    <div class = "news_content">
        <c:forEach items = "${sessionScope.userSession.news}" var = "news">
            <h1>${news.header}</h1>
            <img class = "image" src="${news.image}" alt = ${news.header}>
            <div class = "text">
                    ${news.text}
            </div>
            <div class = "afterwords">
                    ${news.date},${news.source}
            </div>
            <a class = "upstairs" href="#header">to the top</a>
        </c:forEach>
    </div>
</div>
</body>
</html>
