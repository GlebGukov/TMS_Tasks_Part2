package com.tms;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/get")
public class GetCarsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MachineStorage storage = new MachineStorage();
        List<MyCar> cars = storage.getCars();
        req.setAttribute("cars",cars);
        req.getRequestDispatcher("/get.jsp").forward(req,resp);
    }
}
