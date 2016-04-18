package com.ituniver.service;

import java.sql.*;

public class DBService {
    public static void main(String[] args){
        addUser("John", "john@mail.com", 22, "qwerty");
        showUsers();
    }

    public static void addUser(String name, String email, int age, String pwd){
        try{
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/slownews", "postgres", "qwerty");
        PreparedStatement stmt = connection.prepareStatement("insert into \"USER\" values (?,?,?,?)");
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setInt(3, age);
            stmt.setString(4, pwd);
            stmt.execute();
            connection.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
    }

    public static void showUsers(){
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/slownews", "postgres", "qwerty");
            PreparedStatement stmt = connection.prepareStatement("select * from \"USER\"");
            ResultSet result = stmt.executeQuery();

            while (result.next()){
                System.out.println(result.getString(1));
            }
            result.close();
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
