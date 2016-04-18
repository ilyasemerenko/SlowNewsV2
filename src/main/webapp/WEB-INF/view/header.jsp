

<div class = "header">
    <div class = "header_logo">
        <div class = "logo_text">
            <div class = "logo">SLOWNEWS </div>
            <div id = "weather" class = "weather"></div>
            <div class = "greeting">
                for
                <c:choose>
                    <c:when test="${sessionScope.userSession != null}">
                        ${sessionScope.userSession.name}!
                    </c:when>
                    <c:otherwise>
                        Guest!
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </div>

    <ul class = "header_menu ">
        <li class = "menu_item${pageContext.request.requestURI eq '/WEB-INF/view/mainNews.jsp' ? ' active' : ''}">
            <a class = "menu_link" href = "mainNews">NEWS</a>
        </li>
        <c:if test="${sessionScope.userSession != null}">
            <li class = "menu_item${pageContext.request.requestURI eq '/WEB-INF/view/newsArchive.jsp' ? ' active' : ''}">
                <a class = "menu_link" href = "archive">ARCHIVE</a>
            </li>
        </c:if>
        <li class = "menu_item login_item${pageContext.request.requestURI eq '/WEB-INF/view/login.jsp' ? ' active' : ''}">
            <c:choose>
                <c:when test="${sessionScope.userSession != null}">
                    <a class = "menu_link" id = "logout_btn" href = "logout">LOGOUT</a>
                </c:when>
                <c:otherwise>
                    <a class = "menu_link" href = "login">LOGIN</a>
                </c:otherwise>
            </c:choose>
        </li>
    </ul>
</div>
<script>
    getWeather();
</script>