package com.tms.impl;

import com.tms.MyCar;
import com.tms.myInterface.Operations;

import java.util.ArrayList;
import java.util.List;

public class StorageImpl implements Operations {
    private static final List<MyCar> cars = new ArrayList<>();
    @Override
    public MyCar save(String id,String model,String year) {
        MyCar myCar = new MyCar(model,year,id);
        StorageImpl.cars.add(myCar);
        return myCar;

    }
    @Override
    public void delete(String id) {
        boolean a = new MyCar(id).equals(new MyCar("model", "year", id));
        if (a) {
            StorageImpl.cars.remove(new MyCar("model", "year", id));
        }
    }

    @Override
    public List<MyCar> getAll() {
        return StorageImpl.cars;
    }

    @Override
    public MyCar carId(String id) {
        return null;
    }
}
