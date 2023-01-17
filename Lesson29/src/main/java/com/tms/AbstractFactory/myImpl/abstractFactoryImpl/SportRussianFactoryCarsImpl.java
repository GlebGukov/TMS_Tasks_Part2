package com.tms.AbstractFactory.myImpl.abstractFactoryImpl;

import com.tms.AbstractFactory.myImpl.costImpl.SportCostCarServiceImpl;
import com.tms.AbstractFactory.myImpl.countryImpl.RussiaCountryCarServiceImpl;
import com.tms.AbstractFactory.myImpl.typeImpl.SportTypeCarServiceImpl;
import com.tms.AbstractFactory.myInterface.CostCarService;
import com.tms.AbstractFactory.myInterface.CountryCarService;
import com.tms.AbstractFactory.myInterface.FactoryCars;
import com.tms.AbstractFactory.myInterface.TypeCarService;

public class SportRussianFactoryCarsImpl implements FactoryCars {
    @Override
    public CountryCarService getCountry() {
        return new RussiaCountryCarServiceImpl();
    }

    @Override
    public TypeCarService getType() {
        return new SportTypeCarServiceImpl();
    }

    @Override
    public CostCarService getCost() {
        return new SportCostCarServiceImpl();
    }
}
