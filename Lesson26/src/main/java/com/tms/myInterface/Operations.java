package com.tms.myInterface;

import com.tms.MyCar;

import java.util.List;

public interface Operations {
    MyCar save (String id,String model,String year);
    void delete (String id);
    List <MyCar> getAll();
    MyCar carId (String id);

}
