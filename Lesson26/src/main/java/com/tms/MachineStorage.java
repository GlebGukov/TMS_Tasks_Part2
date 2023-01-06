package com.tms;

import java.util.ArrayList;
import java.util.List;

public class MachineStorage {
    private static List<MyCar> cars = new ArrayList<>();
    public List<MyCar> getCars() {
        return MachineStorage.cars;
    }
    public void add(MyCar myCar) {
        MachineStorage.cars.add(myCar);
    }
    public void delete(String id) {
        boolean a = new MyCar(id).equals(new MyCar("model", "year", id));
        if (a) {
            MachineStorage.cars.remove(new MyCar("model", "year", id));
        }
    }
}
