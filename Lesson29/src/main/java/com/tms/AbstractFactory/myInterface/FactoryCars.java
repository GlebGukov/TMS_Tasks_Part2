package com.tms.AbstractFactory.myInterface;

public interface FactoryCars {
    CountryCarService getCountry();
    TypeCarService getType();
    CostCarService getCost();
}
