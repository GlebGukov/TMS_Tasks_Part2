package com.tms.AbstractFactory.myImpl.costImpl;

import com.tms.AbstractFactory.Clases.Cost;
import com.tms.AbstractFactory.myImpl.countryImpl.AmericaCountryCarServiceImpl;
import com.tms.AbstractFactory.myImpl.typeImpl.BusinessTypeCarServiceImpl;
import com.tms.AbstractFactory.myInterface.CostCarService;

public class BusinessCostCarServiceImpl implements CostCarService {
    private static BusinessCostCarServiceImpl businessCostCarService;
    @Override
    public Cost priceRange() {
        return Cost.builder().cost(new StringBuilder("From 50000 to 2500000")).currency("dollar").build();
    }

    public static BusinessCostCarServiceImpl getInstance() {
        if (businessCostCarService == null) {
            synchronized (BusinessCostCarServiceImpl.class){
                if (businessCostCarService == null){
                    businessCostCarService = new BusinessCostCarServiceImpl();
                }
            }
        } return businessCostCarService;
    }
}
