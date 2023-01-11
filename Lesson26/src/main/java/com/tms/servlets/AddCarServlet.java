package com.tms.servlets;

import com.tms.impl.DataBaseImpl;
import com.tms.impl.StorageImpl;
import com.tms.myInterface.Operations;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddCarServlet extends HttpServlet {

    Operations operationsDataBase = DataBaseImpl.getInstance();
    Operations operationsStorage = StorageImpl.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/post.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String model = req.getParameter("model");
        String year = req.getParameter("year");
        String id = req.getParameter("id");
        operationsDataBase.save(id,model,year); //добавление в БД
        operationsStorage.save(id,model,year);   //добавление во внутренний лист
        resp.sendRedirect("/add");
    }
}
