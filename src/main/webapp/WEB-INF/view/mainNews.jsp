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
    <a name = "header"></a>
    <%@ include file="header.jsp" %>
    <div class = "news_content">
        <c:if test = "${enroll_succesfull == true}">
            <div class = "success_enroll">
                <p>You 've successfully registered in the system! Now You can login.</p>
            </div>
        </c:if>
    <c:forEach items = "${newsList}" var = "news">
        <h1>${news.header}</h1>
        <img class = "image" src="${news.image}" alt = ${news.header}>
        <div class = "text">
                ${news.text}
        </div>
        <div class = "afterwords">
            ${news.date},${news.source}
        </div>
        <c:if test="${sessionScope.userSession != null}">
            <form action = "/addToArchive" method = "post">
                <input type = "hidden" name = "header" value="${news.header}">
                <input type = "hidden" name = "image" value="${news.image}">
                <input type = "hidden" name = "text" value="${news.text}">
                <input type = "hidden" name = "date" value="${news.date}">
                <input type = "hidden" name = "source" value="${news.source}">
                <input type = "hidden" name = "user" value="${sessionScope.userSession}">
                <button class = "toArchive_btn">add to archive</button>
            </form>
        </c:if>
        <a class = "upstairs" href="#header">to the top</a>
    </c:forEach>
</div>
</div>
</body>
</html>