package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testNewBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("With sesame seeds")
                .burgers(3)
                .ingredient("Onion")
                .ingredient("Cheese")
                .sauce("Barbecue")
                .ingredient("Chili peppers")
                .ingredient("Bacon")
                .build();
        System.out.println(bigMac);
        //When
        //Then
        Assert.assertEquals(4, bigMac.getIngredients().size());
        Assert.assertEquals(3, bigMac.getBurgers());
        Assert.assertEquals("With sesame seeds", bigMac.getBun());
        Assert.assertEquals("Barbecue", bigMac.getSauce());
    }

    @Test
    public void testNewBigMacWhithDefaultNumberOfBurgers() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Without sesame seeds")
                .ingredient("Lettuce")
                .sauce("Standart")
                .ingredient("Mushrooms")
                .build();
        System.out.println(bigMac);
        //When
        int numberOfBurgers = bigMac.getBurgers();
        //Then
        Assert.assertEquals(2, numberOfBurgers);
    }
}
