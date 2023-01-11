package com.tms.servlets;

import com.tms.MyCar;
import com.tms.impl.DataBaseImpl;
import com.tms.impl.StorageImpl;
import com.tms.myInterface.Operations;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/get")
public class GetCarsServlet extends HttpServlet {
    Operations operationsDataBase = DataBaseImpl.getInstance();
    Operations operationsStorage = StorageImpl.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<MyCar> carsBase = operationsDataBase.getAll();
        List<MyCar> cars = operationsStorage.getAll();
        req.setAttribute("cars",cars);
        req.setAttribute("carsBase",carsBase);
        req.getRequestDispatcher("/get.jsp").forward(req,resp);
    }
}
