package com.ituniver.dao;

import com.ituniver.model.UserBean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private Connection getSlownewsConnection (){

        Connection connection = null;
        try {Class.forName("org.postgresql.Driver");
           connection  = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/slownews", "postgres", "qwerty");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;
    }

    public List<UserBean> getAllUsers(){
        List<UserBean> users = new ArrayList<UserBean>();
        Connection connection = getSlownewsConnection();
        PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement("select * from \"USER\"");

            ResultSet result = stmt.executeQuery();

            while (result.next()){
                UserBean user = new UserBean();
                user.setName(result.getString(2));
                user.setEmail(result.getString(3));
                user.setAge(result.getInt(4));
                user.setPassword(result.getString(5));

                users.add(user);
            }
            result.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  users;
    }

    public void addUser(UserBean user){
            try{
                Connection connection = getSlownewsConnection();
                PreparedStatement stmt = connection.prepareStatement("insert into \"USER\" (\"NAME\", \"EMAIL\", \"AGE\", \"PASSWORD\" ) values (?,?,?,?)");

                stmt.setString(1, user.getName());
                stmt.setString(2, user.getEmail());
                stmt.setInt(3, user.getAge());
                stmt.setString(4, user.getPassword());
                stmt.execute();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    public boolean isUser(String name){
        boolean isUser = false;

        try{
            Connection connection = getSlownewsConnection();
            PreparedStatement stmt = null;
            stmt = connection.prepareStatement("select * from \"USER\" where NAME = ?");
            stmt.setString(1, name);
            ResultSet result = stmt.executeQuery();

            if(result.next()){
                isUser = true;
            }
            result.close();
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
         return isUser;
    }
}

