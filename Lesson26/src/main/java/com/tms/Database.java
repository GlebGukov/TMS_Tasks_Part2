package com.tms;

import java.util.List;

public interface Database {
    void save (MyCar myCar);
    void delete (String id);
    List <MyCar> getAll();
    MyCar carId (String id);

}
