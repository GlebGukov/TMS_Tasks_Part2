package com.tms.AbstractFactory.myImpl.typeImpl;

import com.tms.AbstractFactory.Clases.Type;
import com.tms.AbstractFactory.myImpl.countryImpl.AmericaCountryCarServiceImpl;
import com.tms.AbstractFactory.myInterface.TypeCarService;

public class EconomyTypeCarServiceImpl implements TypeCarService {
    private static EconomyTypeCarServiceImpl economyTypeCarService;
    @Override
    public Type typeCar() {
        return Type.builder().type("Economy").priceCategory("low").build();
    }
}
