package com.tms;

import java.sql.*;

public class DataBaseImpl implements MachineOperations {
    DataBaseConnections dataBase = new DataBaseConnections();

    @Override
    public Car save(Car car) {
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
        System.out.println("Car "+car+" saved");
        return car;
    }

    @Override
    public void delete(int id) {
        Connection connection = dataBase.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from cars where id = ?");
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
        } catch (Exception exc){
            throw new RuntimeException("DELETE DB EXC");
        }
        System.out.println("Car deleted");
    }

    @Override
    public void carId(int id) {
        Connection connection = dataBase.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from Cars where id ='"+id+"'");
            while (rs.next()){
                System.out.println("id "+rs.getInt(1));
                System.out.println("Model "+rs.getString(2));
                System.out.println("Year "+rs.getInt(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement("select (id,model,year) from Cars where id =?");
//            preparedStatement.setInt(1,id);
//            preparedStatement.execute();
//        } catch (SQLException e) {
//            throw new RuntimeException("EXC CarID");
//        }
    }
}