<div class = "header">
    <div class = "header_logo">
        <div class = "logo_text">SLOWNEWS
            <div class = "greeting">
                Hello
                <c:choose>
                    <c:when test="${sessionScope.userSession != null}">
                        ${sessionScope.userSession}!
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
        <li class = "menu_item${pageContext.request.requestURI eq '/WEB-INF/view/newsArchive.jsp' ? ' active' : ''}">
            <a class = "menu_link" href = "archive">ARCHIVE</a>
        </li>
        <li class = "menu_item login_item${pageContext.request.requestURI eq '/WEB-INF/view/login.jsp' ? ' active' : ''}">
            <c:choose>
                <c:when test="${sessionScope.userSession != null}">
                    <a class = "menu_link" href = "logout">LOGOUT</a>
                </c:when>
                <c:otherwise>
                    <a class = "menu_link" href = "login">LOGIN</a>
                </c:otherwise>
            </c:choose>
        </li>
    </ul>
</div>