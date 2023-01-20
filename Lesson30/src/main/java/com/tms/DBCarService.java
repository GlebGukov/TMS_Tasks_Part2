package com.tms;

import java.sql.*;

public class DBCarService implements CarService {
    DataBaseConnections dataBase = new DataBaseConnections();

    @Override
    public Car save(Car car) {
            try(Connection connection = dataBase.getConnection()) {
                Statement statement = connection.createStatement();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into Cars (id,model,year) values(?,?,?)");
                preparedStatement.setInt(1, car.getId());
                preparedStatement.setString(2, car.getModel());
                preparedStatement.setInt(3, car.getYear());
                System.out.println(car + " saved");
                preparedStatement.execute();
            } catch (SQLException e) {
                throw new RuntimeException("SAVE DB EXCEPTION");
            }
        return null;
    }

    @Override
    public void delete(int id) {
            try(Connection connection = dataBase.getConnection()) {
                PreparedStatement preparedStatement = connection.prepareStatement("delete from cars where id = ?");
                preparedStatement.setInt(1, id);
                preparedStatement.execute();
            } catch (Exception exc) {
                throw new RuntimeException("DELETE DB EXC");
            }
            System.out.println("The car from DB under id "+id+" deleted");
    }

    @Override
    public void getCar(int id) {
            try (Connection connection = dataBase.getConnection()){
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

    @Override
    public void deleteAll() {
            try (Connection connection = dataBase.getConnection()){
                PreparedStatement preparedStatement = connection.prepareStatement("DELETE from Cars");
                preparedStatement.execute();
                System.out.println("Delete all cars from data base complete");
            } catch (SQLException e) {
                throw new RuntimeException("EXC DELETE ALL DB");
            }
        }
    }
