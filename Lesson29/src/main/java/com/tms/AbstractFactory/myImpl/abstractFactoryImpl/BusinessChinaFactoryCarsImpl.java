package com.tms.AbstractFactory.myImpl.abstractFactoryImpl;

import com.tms.AbstractFactory.myImpl.costImpl.BusinessCostCarServiceImpl;
import com.tms.AbstractFactory.myImpl.countryImpl.ChinaCountryCarServiceImpl;
import com.tms.AbstractFactory.myImpl.typeImpl.BusinessTypeCarServiceImpl;
import com.tms.AbstractFactory.myInterface.CostCarService;
import com.tms.AbstractFactory.myInterface.CountryCarService;
import com.tms.AbstractFactory.myInterface.FactoryCars;
import com.tms.AbstractFactory.myInterface.TypeCarService;

public class BusinessChinaFactoryCarsImpl implements FactoryCars {
    @Override
    public CountryCarService getCountry() {
        return ChinaCountryCarServiceImpl.getInstance();
    }

    @Override
    public TypeCarService getType() {
        return BusinessTypeCarServiceImpl.getInstance();
    }

    @Override
    public CostCarService getCost() {
        return BusinessCostCarServiceImpl.getInstance();
    }
}
