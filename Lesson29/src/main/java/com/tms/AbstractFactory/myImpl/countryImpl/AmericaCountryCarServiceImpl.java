package com.tms.AbstractFactory.myImpl.countryImpl;

import com.tms.AbstractFactory.Clases.Country;
import com.tms.AbstractFactory.myInterface.CountryCarService;

public class AmericaCountryCarServiceImpl implements CountryCarService {
    private static AmericaCountryCarServiceImpl americaCountryCarService;
    @Override
    public Country infoCountry() {
        return Country.builder().name("America").currency("dollar").population(332000000).build();
    }
}
