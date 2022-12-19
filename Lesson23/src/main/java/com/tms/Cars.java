package com.tms;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


@WebServlet("/cars")
public class Cars extends HttpServlet {
    private static final Map<String, String> cars = new HashMap<>();

    @Override
    public void init(ServletConfig config) {
        System.out.println("____________________________DO INIT____________________________");
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        ServletOutputStream outputStream = resp.getOutputStream();
        LocalDateTime date = LocalDateTime.now();
        resp.addCookie(new Cookie("Lastcall", date.format(DateTimeFormatter.ofPattern("HH-mm_dd-MM-yyyy"))));
        Cookie[] cookies = req.getCookies();
        for (Cookie coc : cookies) {
            outputStream.println(coc.getName() + " = " + coc.getValue());
        }
        if (cars.get(id) != null) {
            outputStream.println (cars.get(id));
        } else if (cars.get(id) == null) {
            String allCars = cars.values().toString();
            outputStream.print(allCars);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        String id = req.getParameter("id");
        String car = req.getParameter("car");
        cars.putIfAbsent(id, car);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp){
        String id = req.getParameter("id");
        String car = req.getParameter("car");
        if (cars.get(id) != null) {
            cars.replace(id, car);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp){
        String id = req.getParameter("id");
        if (cars.get(id) != null) {
            cars.remove(id);
        }
    }
}