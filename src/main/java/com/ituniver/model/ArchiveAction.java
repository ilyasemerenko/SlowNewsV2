package com.ituniver.model;


import javax.servlet.http.HttpServletRequest;

public class ArchiveAction {

    public void addToUsersArchive(HttpServletRequest request){
        UserBean user = (UserBean) request.getSession().getAttribute("userSession");
        NewsBean newsToAdd = new NewsBean();
        newsToAdd.setHeader(request.getParameter("header"));
        newsToAdd.setText(request.getParameter("text"));
        newsToAdd.setImage(request.getParameter("image"));
        newsToAdd.setDate(request.getParameter("date"));
        newsToAdd.setSource(request.getParameter("source"));

        user.getNews().add(newsToAdd);
        //request.getSession().setAttribute("UsersArchive", currentUser.getNews());
    }
}
