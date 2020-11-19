package com.practice.services.carpet;

import com.practice.enums.City;
import com.practice.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Component
public class CarpetTx implements Carpet {
    public static final Map<City, BigDecimal> sqPriceForCity = new HashMap<>();

    static{
        sqPriceForCity.put(City.AUSTIN,new BigDecimal("1.32"));
        sqPriceForCity.put(City.DALLAS,new BigDecimal("1.75"));
        sqPriceForCity.put(City.SAN_ANTONIO,new BigDecimal("2.20"));
    }

    @Override
    public BigDecimal getSqFtPrice(City city) {
        return sqPriceForCity.entrySet().stream().filter( x-> x.getKey() == city).findFirst().get().getValue();
    }
}
