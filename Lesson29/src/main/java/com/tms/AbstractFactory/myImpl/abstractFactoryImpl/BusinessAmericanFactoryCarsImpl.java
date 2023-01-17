package com.tms.AbstractFactory.myImpl.abstractFactoryImpl;

import com.tms.AbstractFactory.myImpl.costImpl.BusinessCostCarServiceImpl;
import com.tms.AbstractFactory.myImpl.countryImpl.AmericaCountryCarServiceImpl;
import com.tms.AbstractFactory.myImpl.typeImpl.BusinessTypeCarServiceImpl;
import com.tms.AbstractFactory.myInterface.CostCarService;
import com.tms.AbstractFactory.myInterface.CountryCarService;
import com.tms.AbstractFactory.myInterface.FactoryCars;
import com.tms.AbstractFactory.myInterface.TypeCarService;
import lombok.ToString;

@ToString
public class BusinessAmericanFactoryCarsImpl implements FactoryCars {
    @Override
    public CountryCarService getCountry() {
      return new AmericaCountryCarServiceImpl();
    }

    @Override
    public TypeCarService getType() {
        return new BusinessTypeCarServiceImpl();
    }

    @Override
    public CostCarService getCost() {
        return new BusinessCostCarServiceImpl();
    }
}
