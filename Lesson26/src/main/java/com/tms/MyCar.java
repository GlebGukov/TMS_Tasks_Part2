package com.tms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyCar {
    private String model;
    private String year;
    private String id;
    public MyCar(String id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyCar myCar = (MyCar) o;
        return Objects.equals(id, myCar.id);
    }

}
