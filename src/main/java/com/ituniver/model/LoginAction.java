package com.ituniver.model;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

public class LoginAction {

    public boolean doLogin(HttpServletRequest request){
        boolean toLogin = false;
        String login = request.getParameter("login");

        if(isUserPresent(request)){
            request.getSession().setAttribute("userSession", login);
            toLogin = true;
        }
        return toLogin;
    }

    private boolean isUserPresent(HttpServletRequest request){
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        ArrayList<UserBean> users= EnrollAction.getUsers();

        for (UserBean user : users){
            if(user.getName().equals(login)) {
                return isPasswordCorrect(user, password);
            }
        }
        return false;
    }

    private boolean isPasswordCorrect(UserBean user, String password){
        return user.getPassword().equals(password);
    }
}



