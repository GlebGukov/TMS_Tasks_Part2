package com.tms;

import java.util.ArrayList;
import java.util.List;

public class MachineStorage {
    private static List<MyCar> cars = new ArrayList<>();
    public List<MyCar> getCars() {
        return MachineStorage.cars;
    }
    public void add (MyCar myCar){
        MachineStorage.cars.add(myCar);
    }
}
