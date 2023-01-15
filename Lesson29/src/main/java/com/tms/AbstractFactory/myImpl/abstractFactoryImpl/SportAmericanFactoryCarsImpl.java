package com.tms.AbstractFactory.myImpl.abstractFactoryImpl;

import com.tms.AbstractFactory.myImpl.costImpl.SportCostCarServiceImpl;
import com.tms.AbstractFactory.myImpl.countryImpl.AmericaCountryCarServiceImpl;
import com.tms.AbstractFactory.myImpl.typeImpl.SportTypeCarServiceImpl;
import com.tms.AbstractFactory.myInterface.CostCarService;
import com.tms.AbstractFactory.myInterface.CountryCarService;
import com.tms.AbstractFactory.myInterface.FactoryCars;
import com.tms.AbstractFactory.myInterface.TypeCarService;

public class SportAmericanFactoryCarsImpl implements FactoryCars {
    @Override
    public CountryCarService getCountry() {
        return AmericaCountryCarServiceImpl.getInstance();
    }

    @Override
    public TypeCarService getType() {
        return SportTypeCarServiceImpl.getInstance();
    }

    @Override
    public CostCarService getCost() {
        return SportCostCarServiceImpl.getInstance();
    }
}