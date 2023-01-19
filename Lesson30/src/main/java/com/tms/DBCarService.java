package com.tms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCarService implements CarService {
    DataBaseConnections dataBase = new DataBaseConnections();

    CarService carService;

    public DBCarService(CarService carService) {
        this.carService = carService;
    }

    @Override
    public Car save(Car car) {
        if (carService != null) {
            Connection connection = dataBase.getConnection();
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("insert into Cars (id,model,year) values(?,?,?)");
                preparedStatement.setInt(1, car.getId());
                preparedStatement.setString(2, car.getModel());
                preparedStatement.setInt(3, car.getYear());
                preparedStatement.execute();
            } catch (SQLException e) {
                throw new RuntimeException("SAVE DB EXCEPTION");
            }
            System.out.println(car + " saved");
        }
        return null;
    }

    @Override
    public void delete(int id) {
        if (carService == null) {
            Connection connection = dataBase.getConnection();
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("delete from cars where id = ?");
                preparedStatement.setInt(1, id);
                preparedStatement.execute();
            } catch (Exception exc) {
                throw new RuntimeException("DELETE DB EXC");
            }
            System.out.println("Car deleted");
        }
    }

    @Override
    public void getCar(int id) {
        if (carService == null) {
            Connection connection = dataBase.getConnection();
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("select * from Cars where id =?");
                preparedStatement.setInt(1, id);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    System.out.println("id " + rs.getInt(1));
                    System.out.println("Model " + rs.getString(2));
                    System.out.println("Year " + rs.getInt(3));
                }
            } catch (SQLException e) {
                throw new RuntimeException("Машина в БД не найдена");
            }
        }
    }

    @Override
    public void deleteAll() {
        if (carService == null) {
            Connection connection = dataBase.getConnection();
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("delete * from Cars");
                preparedStatement.execute();
                System.out.println("Delete all from data base complete");
            } catch (SQLException e) {
                throw new RuntimeException("EXC DELETEallDB");
            }
        }
    }
}
