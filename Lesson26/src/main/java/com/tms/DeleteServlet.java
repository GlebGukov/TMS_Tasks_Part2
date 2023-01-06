package com.tms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/delete.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MachineStorage storage = new MachineStorage();
        String id = req.getParameter("id");
        String all = req.getParameter("all");
        if(Objects.equals(req.getParameter("id"), "0")){
            List<MyCar> cars = storage.getCars();
            cars.clear();
            resp.sendRedirect("/");
        }
        else if (Objects.equals(req.getParameter("id"), id)){
            storage.delete(id);
            resp.sendRedirect("/delete");
        }
    }
}
