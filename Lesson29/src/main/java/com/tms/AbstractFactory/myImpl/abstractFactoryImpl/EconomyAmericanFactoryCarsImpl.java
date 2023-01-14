package com.tms.AbstractFactory.myImpl.abstractFactoryImpl;

import com.tms.AbstractFactory.myImpl.costImpl.EconomyCostCarServiceImpl;
import com.tms.AbstractFactory.myImpl.countryImpl.AmericaCountryCarServiceImpl;
import com.tms.AbstractFactory.myImpl.typeImpl.EconomyTypeCarServiceImpl;
import com.tms.AbstractFactory.myInterface.CostCarService;
import com.tms.AbstractFactory.myInterface.CountryCarService;
import com.tms.AbstractFactory.myInterface.FactoryCars;
import com.tms.AbstractFactory.myInterface.TypeCarService;

public class EconomyAmericanFactoryCarsImpl implements FactoryCars {
    @Override
    public CountryCarService getCountry() {
        return AmericaCountryCarServiceImpl.getInstance();
    }
    @Override
    public TypeCarService getType() {
        return EconomyTypeCarServiceImpl.getInstance();
    }
    @Override
    public CostCarService getCost() {
        return EconomyCostCarServiceImpl.getInstance();
    }
}
