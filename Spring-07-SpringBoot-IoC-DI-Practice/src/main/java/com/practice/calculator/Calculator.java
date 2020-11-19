package com.practice.calculator;

import com.practice.enums.City;
import com.practice.interfaces.carpetPrices.Carpet;
import com.practice.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Calculator {
    @Qualifier("carpetVA")
    @Autowired
    private Carpet carpet;


    @Qualifier("kitchen")
    @Autowired
    private Floor floor;


    public String getTotalCarpetCost(City city){
        BigDecimal cost = carpet.getSqFtPrice(city).multiply(floor.getArea());

        return "Total Cost for Carpet: "+cost;
    }

}
