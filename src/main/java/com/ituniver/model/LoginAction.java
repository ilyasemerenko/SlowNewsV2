package com.ituniver.model;

import javax.servlet.http.HttpServletRequest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class LoginAction {

    public boolean doLogin(HttpServletRequest request){
        boolean toLogin = false;
        String login = request.getParameter("login");

        if(isUserPresent(request)){
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
                try {
                    return isPasswordCorrect(user, password,request);
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    private boolean isPasswordCorrect (UserBean user, String password, HttpServletRequest request) throws  NoSuchAlgorithmException {
        boolean correct = user.getPassword().equals(new EnrollAction().encryptPassword(password));
        if (correct){
            request.getSession().setAttribute("userSession", user);
        }
        return correct;
    }
}



