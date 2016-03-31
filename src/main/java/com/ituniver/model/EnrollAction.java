package com.ituniver.model;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

public class EnrollAction {

    private static ArrayList<UserBean> users;

    static
    {
        users = new ArrayList<UserBean>();
        users.add(new UserBean("Jack", "jack@mail.com", 16, "jack"));
        users.add(new UserBean("Lewis", "lewis@mail.com", 24, "lewis"));
        users.add(new UserBean("Sandra", "sandra@mail.com", 23, "sandra"));
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


    public static ArrayList<UserBean> getUsers() {
        return users;
    }
}
