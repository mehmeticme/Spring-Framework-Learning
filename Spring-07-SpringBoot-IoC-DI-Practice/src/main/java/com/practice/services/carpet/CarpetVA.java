package com.practice.services.carpet;

import com.practice.enums.City;
import com.practice.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Component
public class CarpetVA implements Carpet {

    public static final Map<City,BigDecimal> sqPriceForCity = new HashMap<>();

    static{
        sqPriceForCity.put(City.MCLEAN,new BigDecimal("4.32"));
        sqPriceForCity.put(City.ARLINGTON,new BigDecimal("2.92"));
        sqPriceForCity.put(City.FAIRFAX,new BigDecimal("4.65"));
    }

    @Override
    public BigDecimal getSqFtPrice(City city) {
        return sqPriceForCity.entrySet().stream().filter( x-> x.getKey() == city).findFirst().get().getValue();
    }
}
