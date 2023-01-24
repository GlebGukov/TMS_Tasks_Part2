package com.tms;

import org.postgresql.core.Query;

import java.sql.*;

public class DBCarService implements CarService {
    private final DataBaseConnections dataBase = new DataBaseConnections();

    @Override
    public Car save(Car car) {
        try (Connection connection = dataBase.getConnection();
             PreparedStatement ps = connection.prepareStatement("select id from Cars where id =?")) {
            ps.setInt(1, car.getId());
            try (ResultSet resultSet = ps.executeQuery()) {
                if (resultSet.next()) {
                    System.out.println("There is a " + car + " in the database");
                    System.out.println();
                } else
                    try (PreparedStatement ps2 = connection.prepareStatement("insert into Cars (id,model,year) values(?,?,?)")) {
                        ps2.setInt(1, car.getId());
                        ps2.setString(2, car.getModel());
                        ps2.setInt(3, car.getYear());
                        System.out.println(car + " saved in DataBase");
                        System.out.println();
                        ps2.execute();
                    }
            }

        } catch (SQLException e) {
            throw new RuntimeException("SAVE DB EXCEPTION");
        }
        return null;
    }

    @Override
    public void delete(int id) {
        try (Connection connection = dataBase.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from cars where id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (Exception exc) {
            throw new RuntimeException("DELETE DB EXC");
        }
        System.out.println("The car from DB under id " + id + " deleted");
    }

    @Override
    public void getCar(int id) {
        try (Connection connection = dataBase.getConnection();
        PreparedStatement ps = connection.prepareStatement("select id from Cars where id =?")) {
            ps.setInt(1,id);
            try (ResultSet rs1 = ps.executeQuery()){
                if (rs1.next()){
                    try(PreparedStatement preparedStatement = connection.prepareStatement("select * from Cars where id =?");
                    ) {
                        preparedStatement.setInt(1, id);
                        ResultSet rs = preparedStatement.executeQuery();
                        while (rs.next()) {
                            System.out.print("Id " + rs.getInt(1));
                            System.out.print(" Model " + rs.getString(2));
                            System.out.print(" Year " + rs.getInt(3));
                        }
                    }
                }
                else System.out.println("This car not founded in DataBase");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Машина в БД не найдена");
        }
    }

    @Override
    public void deleteAll() {
        try (Connection connection = dataBase.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE from Cars");
            preparedStatement.execute();
            System.out.println("Delete all cars from data base complete");
        } catch (SQLException e) {
            throw new RuntimeException("EXC DELETE ALL DB");
        }
    }
}
