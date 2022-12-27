package com.tms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet ("/cars")
public class CarsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String one = req.getParameter("one"); //вытаскиваем машину по ключу
//        System.out.println(one);
//
//        Enumeration<String> parameterNames = req.getParameterNames(); //вытаскиваем все машины
//        while (parameterNames.hasMoreElements()){
//            String a = parameterNames.nextElement();
//            System.out.println("Cars "+a+" "+ req.getParameter(a)) ;
        req.getRequestDispatcher("/showMyCar.jsp").forward(req,resp);


        }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Car car = (Car) session.getAttribute("Car");
        String model = req.getParameter("model");
        int id = Integer.parseInt(req.getParameter("id"));
        if (model!=null){
            car = new Car();
            car.setName(model);
            car.setId(id);
        }
        session.setAttribute("Car",car);

    }
}
