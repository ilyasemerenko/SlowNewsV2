package com.ituniver.controller;

import com.ituniver.model.ArchiveAction;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/serv/addToArchive")
public class ArchiveSetServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        new ArchiveAction().addToUsersArchive(request);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/mainNews.jsp");

        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
