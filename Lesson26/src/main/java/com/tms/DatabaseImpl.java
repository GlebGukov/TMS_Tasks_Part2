package com.tms;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseImpl implements Database {

    DataBaseServlet servlet = new DataBaseServlet();
    @Override
    public void save(MyCar myCar){
        Connection connection = servlet.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Cars (id,model,year) values(?,?,?)");
            preparedStatement.setString(1,myCar.getId());
            preparedStatement.setString(2,myCar.getModel());
            preparedStatement.setString(3,myCar.getYear());
            preparedStatement.execute();
        } catch (Exception exc){
            throw new RuntimeException("SAVE EXC");
        }


    }

    @Override
    public void delete(String id) {
        Connection connection = servlet.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from cars where id = ?");
            preparedStatement.setString(1,id);
            preparedStatement.execute();
        } catch (Exception exc){
            throw new RuntimeException("Delete EXC");
        }

    }

    @Override
    public List<MyCar> getAll () {
        try {
            Connection connection = servlet.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from cars");
            return getList(resultSet);
        } catch (Exception exc){
            throw new RuntimeException("GetAllExc");
        }
    }

    @Override
    public MyCar carId(String id) {
        return null;
    }
    private List<MyCar> getList (ResultSet resultSet){
        List<MyCar> cars = new ArrayList<>();
        try {
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String model = resultSet.getString("model");
                String year = resultSet.getString("year");
                MyCar myCar = new MyCar(model, year, id);
                cars.add(myCar);
            }
        }catch (Exception exc){
            throw new RuntimeException("GetListSQLexc");
        }
        return cars;
    }
}
