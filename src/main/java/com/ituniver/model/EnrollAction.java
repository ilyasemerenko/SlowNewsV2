package com.ituniver.model;

import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
        try {
            user.setPassword(encryptPassword(request.getParameter("pwd")));
        } catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        users.add(user);
        request.setAttribute("enroll_succesfull", "true");
    }


    public static ArrayList<UserBean> getUsers() {
        return users;
    }

    String encryptPassword (String pwd)throws NoSuchAlgorithmException {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(pwd.getBytes());
            return new String(messageDigest.digest());
    }
}
