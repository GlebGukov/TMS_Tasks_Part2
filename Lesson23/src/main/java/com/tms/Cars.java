package com.tms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet ("/cars")
public class Cars extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String one = req.getParameter("one"); //вытаскиваем машину по ключу
        System.out.println(one);

        Enumeration<String> parameterNames = req.getParameterNames(); //вытаскиваем все машины
        while (parameterNames.hasMoreElements()){
            String a = parameterNames.nextElement();
            System.out.println("Cars "+a+" "+ req.getParameter(a)) ;
        }


    }
}