package com.tms.AbstractFactory.myImpl.countryImpl;

import com.tms.AbstractFactory.Clases.Country;
import com.tms.AbstractFactory.myInterface.CountryCarService;
import lombok.ToString;

@ToString
public class RussiaCountryCarServiceImpl implements CountryCarService {
    private static RussiaCountryCarServiceImpl russiaCountryCarService;

    public Country infoCountry() {
        return Country.builder().name("Russia").population(143000000).dopInfo(new StringBuilder("Country area 17 100 000 km²")).build();
    }
}