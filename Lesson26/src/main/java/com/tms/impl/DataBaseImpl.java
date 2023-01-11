package com.tms.impl;

import com.tms.myServices.DataBaseService;
import com.tms.MyCar;
import com.tms.myInterface.Operations;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseImpl implements Operations {
    DataBaseService serviceDataBase = new DataBaseService();
    private static DataBaseImpl dataBaseImpl;

    @Override
    public MyCar save(String id,String model,String year){
        MyCar myCar = new MyCar(model,year,id);
        Connection connection = serviceDataBase.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Cars (id,model,year) values(?,?,?)");
            preparedStatement.setString(1,myCar.getId());
            preparedStatement.setString(2,myCar.getModel());
            preparedStatement.setString(3,myCar.getYear());
            preparedStatement.execute();
        } catch (Exception exc){
            throw new RuntimeException("SAVE EXC");
        }
        return myCar;
    }

    @Override
    public void delete(String id) {
        Connection connection = serviceDataBase.getConnection();
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
            Connection connection = serviceDataBase.getConnection();
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
    public static DataBaseImpl getInstance(){
        if (dataBaseImpl == null){
            synchronized (DataBaseImpl.class){
                if (dataBaseImpl == null){
                    dataBaseImpl = new DataBaseImpl();
                }
            }
        }
        return dataBaseImpl;
    }
}
