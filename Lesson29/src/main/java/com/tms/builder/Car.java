package com.tms.builder;

import com.tms.AbstractFactory.Clases.Cost;
import com.tms.AbstractFactory.Clases.Country;
import com.tms.AbstractFactory.Clases.Type;
import com.tms.AbstractFactory.myInterface.CostCarService;
import com.tms.AbstractFactory.myInterface.CountryCarService;
import com.tms.AbstractFactory.myInterface.TypeCarService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {
    private String name;
    private Country country;
    private Cost cost;
    private Type type;
}
