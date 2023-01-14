package com.tms.AbstractFactory.myImpl.costImpl;

import com.tms.AbstractFactory.Clases.Cost;
import com.tms.AbstractFactory.myImpl.countryImpl.AmericaCountryCarServiceImpl;
import com.tms.AbstractFactory.myInterface.CostCarService;

public class EconomyCostCarServiceImpl implements CostCarService {
    private static EconomyCostCarServiceImpl economyCostCarService;
    @Override
    public Cost priceRange() {
        return Cost.builder().cost(new StringBuilder("From 1000 to 7000")).currency("dollar").build();
    }

    public static EconomyCostCarServiceImpl getInstance() {
        if (economyCostCarService == null){
            synchronized (EconomyCostCarServiceImpl.class){
                if (economyCostCarService == null){
                    economyCostCarService = new EconomyCostCarServiceImpl();
                }
            }
        }
        return economyCostCarService;
    }
}
