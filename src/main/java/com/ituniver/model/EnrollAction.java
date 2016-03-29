package com.ituniver.model;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class EnrollAction {

    private static List<UserBean> users;

    static
    {
        users = new ArrayList<UserBean>();
    }

    public void doEnroll(HttpServletRequest request){

        UserBean user = new UserBean();
        user.setName(request.getParameter("username"));
        user.setAge(Integer.parseInt(request.getParameter("age")));
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("pwd"));

        users.add(user);
        request.setAttribute("enroll_succesfull", "true");
    }


    public static List<UserBean> getUsers() {
        return users;
    }
}
