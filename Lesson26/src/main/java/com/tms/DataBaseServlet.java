package com.tms;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet(value = "/init", loadOnStartup = 1)
public class DataBaseServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            Class.forName("org.postgresql.Driver");
//            getConnection().createStatement().executeUpdate("drop table cars");
            getConnection().createStatement().execute("" +
                    "create table cars (" +
                    "id varchar primary key," +
                    "model varchar," +
                    "year varchar" +
                    ")");


        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            throw new RuntimeException();
        }
    }
    public Connection getConnection (){
        try {
            String connectionUrl = "jdbc:postgresql://localhost:5432/cars";
            String user = "admin";
            String password = "admin";
            return DriverManager.getConnection(connectionUrl, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
