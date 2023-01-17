package com.tms.AbstractFactory.myImpl.abstractFactoryImpl;

import com.tms.AbstractFactory.myImpl.costImpl.EconomyCostCarServiceImpl;
import com.tms.AbstractFactory.myImpl.countryImpl.RussiaCountryCarServiceImpl;
import com.tms.AbstractFactory.myImpl.typeImpl.EconomyTypeCarServiceImpl;
import com.tms.AbstractFactory.myInterface.CostCarService;
import com.tms.AbstractFactory.myInterface.CountryCarService;
import com.tms.AbstractFactory.myInterface.FactoryCars;
import com.tms.AbstractFactory.myInterface.TypeCarService;

public class EconomyRussianFactoryCarsImpl implements FactoryCars {
    @Override
    public CountryCarService getCountry() {
        return new RussiaCountryCarServiceImpl();
    }

    @Override
    public TypeCarService getType() {
        return new EconomyTypeCarServiceImpl();
    }

    @Override
    public CostCarService getCost() {
        return new EconomyCostCarServiceImpl();
    }
}
