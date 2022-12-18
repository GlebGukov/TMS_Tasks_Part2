package com.tms;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@WebServlet("/cars")
public class Cars extends HttpServlet {
    private static final Map<String, String> cars = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String car = req.getParameter("car");
        ServletOutputStream outputStream = resp.getOutputStream();
        if (cars.get(id)!=null) {
            outputStream.print(cars.get(id));
        } else if (Objects.equals(id, "All")) {
            for (Map.Entry<String, String> entry : cars.entrySet()) {
                outputStream.println(entry.getKey() + " = " + entry.getValue());
            }
        } else {
            outputStream.print("SSSSSSSSSSS");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String car = req.getParameter("car");
        cars.putIfAbsent(id, car);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String car = req.getParameter("car");
        if (cars.get(id) != null) {
            cars.replace(id, car);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        if (cars.get(id) != null) {
            cars.remove(id);
        }
    }
}