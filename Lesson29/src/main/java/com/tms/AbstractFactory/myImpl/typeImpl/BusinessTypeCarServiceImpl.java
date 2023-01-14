package com.tms.AbstractFactory.myImpl.typeImpl;

import com.tms.AbstractFactory.Clases.Type;
import com.tms.AbstractFactory.myImpl.countryImpl.AmericaCountryCarServiceImpl;
import com.tms.AbstractFactory.myInterface.TypeCarService;

public class BusinessTypeCarServiceImpl implements TypeCarService {
    private static BusinessTypeCarServiceImpl businessTypeCarService;
    @Override
    public Type typeCar() {
                return Type.builder().type("Business").priceCategory("highest").build();
    }
    public static BusinessTypeCarServiceImpl getInstance() {
        if (businessTypeCarService == null) {
            synchronized (BusinessTypeCarServiceImpl.class){
                if (businessTypeCarService == null){
                    businessTypeCarService = new BusinessTypeCarServiceImpl();
                }
            }
        } return businessTypeCarService;
    }
}
