package com.tms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/add")
public class AddCarServlet extends HttpServlet {

    Database database = new DatabaseImpl();
    MachineStorage storage = new MachineStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/post.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String model = req.getParameter("model");
        String year = req.getParameter("year");
        String id = req.getParameter("id");
        MyCar myCar = new MyCar(model, year, id);
        database.save(myCar); //добавление в БД
        storage.add(myCar);   //добавление во внутренний лист
        resp.sendRedirect("/add");

    }
}
