package com.tms;

import java.util.Objects;

public class MyCar {
    private String model;
    private String year;
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public MyCar(String model, String year, String id) {
        this.model = model;
        this.year = year;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
