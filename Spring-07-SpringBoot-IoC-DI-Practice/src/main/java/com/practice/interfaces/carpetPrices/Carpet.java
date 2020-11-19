package com.practice.interfaces.carpetPrices;

import com.practice.enums.City;

import java.math.BigDecimal;

public interface Carpet {

    BigDecimal getSqFtPrice(City city);
}
