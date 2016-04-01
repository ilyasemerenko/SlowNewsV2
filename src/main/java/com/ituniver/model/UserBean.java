package com.ituniver.model;

import java.util.ArrayList;

public class UserBean {

    private String name;

    private String email;
    private int age;
    private String password;
    private ArrayList<ArrayList> news;

    public UserBean(){}

    public UserBean(String name, String email, int age, String password) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
    }



    public ArrayList<ArrayList> getNews() {
        return news;
    }

    public void setNews(ArrayList<ArrayList> news) {
        this.news = news;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
