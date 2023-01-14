package com.tms.AbstractFactory.myImpl.countryImpl;

import com.tms.AbstractFactory.Clases.Country;
import com.tms.AbstractFactory.myInterface.CountryCarService;
import lombok.ToString;

@ToString
public class ChinaCountryCarServiceImpl implements CountryCarService {
    private static ChinaCountryCarServiceImpl chinaCountryCarService;
    @Override
    public Country infoCountry() {
        return Country.builder().name("China").currency("Yuán").dopInfo(new StringBuilder("Second country name:'Middle Empire' ")).build();
    }

    public static ChinaCountryCarServiceImpl getInstance() {
        if (chinaCountryCarService == null){
            synchronized (ChinaCountryCarServiceImpl.class){
                if (chinaCountryCarService == null){
                    chinaCountryCarService = new ChinaCountryCarServiceImpl();
                }
            }
        }
        return chinaCountryCarService;
    }
}
