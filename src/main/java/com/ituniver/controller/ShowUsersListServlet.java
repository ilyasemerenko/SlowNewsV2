package com.ituniver.controller;

import com.ituniver.dao.UserDAO;
import com.ituniver.model.EnrollAction;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/serv/usersList")
public class ShowUsersListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        UserDAO userDAO = new UserDAO();
        request.setAttribute("users", userDAO.getAllUsers());

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/usersList.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
