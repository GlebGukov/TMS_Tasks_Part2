package com.tms.myServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseService {

    public void initialization() {
        try {
            Class.forName("org.postgresql.Driver");
            getConnection().createStatement().executeUpdate("drop table cars");
            getConnection().createStatement().execute("" +
                    "create table cars (" +
                    "id varchar primary key," +
                    "model varchar," +
                    "year varchar" +
                    ")");


        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("problems in initialization");
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
