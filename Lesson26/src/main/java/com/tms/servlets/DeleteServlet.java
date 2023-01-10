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

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    Operations operationsStorage = new StorageImpl();
    Operations operationsDataBase = new DataBaseImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/get.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        String delete = req.getParameter("delete");
        operationsDataBase.delete(delete);
        operationsStorage.delete(id);
        resp.sendRedirect("/");
    }
}
