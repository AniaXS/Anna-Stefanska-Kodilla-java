package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Russia", new BigDecimal("11111111111111111111")));
        europe.addCountry(new Country("Germany", new BigDecimal("22222222222222222222")));
        europe.addCountry(new Country("Croatia", new BigDecimal("33333333333333333333")));
        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("99999999999999999999")));
        asia.addCountry(new Country("India", new BigDecimal("88888888888888888888")));
        asia.addCountry(new Country("Japan", new BigDecimal("77777777777777777777")));
        Continent africa = new Continent("Africa");
        africa.addCountry(new Country("Egypt", new BigDecimal("44444444444444444444")));
        africa.addCountry(new Country("Ethiopia", new BigDecimal("55555555555555555555")));
        africa.addCountry(new Country("Mali", new BigDecimal("66666666666666666666")));
        World earth = new World("Earth");
        earth.addCoctinent(europe);
        earth.addCoctinent(asia);
        earth.addCoctinent(africa);

        //When
        BigDecimal totalPeopleQuantity = earth.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("499999999999999999995");
        Assert.assertEquals(expectedPeople, totalPeopleQuantity);
    }
}
