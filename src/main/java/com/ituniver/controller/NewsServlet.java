package com.ituniver.controller;

import com.ituniver.model.NewsBean;
import com.ituniver.model.NewsFiller;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/mainNews")
public class NewsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        NewsFiller filler = new NewsFiller();
        List<NewsBean> news = filler.fillNewsList();
        request.setAttribute("newsList", news);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/mainNews.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
