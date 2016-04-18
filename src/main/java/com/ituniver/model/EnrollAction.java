package com.ituniver.model;

import com.ituniver.dao.UserDAO;

import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class EnrollAction {

    public static void main (String[] args) throws Exception{
        System.out.println(encryptPassword("qwerty"));
    }

    public void doEnroll(HttpServletRequest request){
        UserDAO userDAO = new UserDAO();
        UserBean user = new UserBean();
        user.setName(request.getParameter("username"));
        user.setAge(Integer.parseInt(request.getParameter("age")));
        user.setEmail(request.getParameter("email"));
        try {
            user.setPassword(encryptPassword(request.getParameter("pwd")));
        } catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        userDAO.addUser(user);
        request.setAttribute("enroll_succesfull", "true");
    }

    static String encryptPassword (String pwd) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA");
        messageDigest.update(pwd.getBytes());
        byte byteData[] = messageDigest.digest();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
            return sb.toString();
    }

}
