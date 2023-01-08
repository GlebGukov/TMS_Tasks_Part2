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
    Database database = new DatabaseImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MachineStorage storage = new MachineStorage();
        List<MyCar> carsBase = database.getAll();
        List<MyCar> cars = storage.getCars();
        req.setAttribute("cars",cars);
        req.setAttribute("carsBase",carsBase);
        req.getRequestDispatcher("/get.jsp").forward(req,resp);
    }
}
