package com.tms.AbstractFactory.myImpl.costImpl;

import com.tms.AbstractFactory.Clases.Cost;
import com.tms.AbstractFactory.myImpl.countryImpl.AmericaCountryCarServiceImpl;
import com.tms.AbstractFactory.myInterface.CostCarService;

public class SportCostCarServiceImpl implements CostCarService {
    private static SportCostCarServiceImpl sportCostCarService;
    @Override
    public Cost priceRange() {
        return Cost.builder().cost(new StringBuilder("From 30000 to 2000000")).currency("dollar").build();
    }

    public static SportCostCarServiceImpl getInstance() {
        if (sportCostCarService == null){
            synchronized (SportCostCarServiceImpl.class){
                if (sportCostCarService == null){
                    sportCostCarService = new SportCostCarServiceImpl();
                }
            }
        }
        return sportCostCarService;
    }
}

