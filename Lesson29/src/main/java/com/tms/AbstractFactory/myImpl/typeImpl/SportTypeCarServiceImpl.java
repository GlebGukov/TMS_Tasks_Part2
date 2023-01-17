package com.tms.AbstractFactory.myImpl.typeImpl;

import com.tms.AbstractFactory.Clases.Type;
import com.tms.AbstractFactory.myImpl.countryImpl.AmericaCountryCarServiceImpl;
import com.tms.AbstractFactory.myInterface.TypeCarService;

public class SportTypeCarServiceImpl implements TypeCarService {
    private static SportTypeCarServiceImpl sportTypeCarService;
    @Override
    public Type typeCar() {
        return Type.builder().type("Sport").priceCategory("high").build();
    }
}
