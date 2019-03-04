package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testNewBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Gluten-free")
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
        Assert.assertEquals("Gluten-free", bigMac.getBun());
        Assert.assertEquals("Barbecue", bigMac.getSauce());
    }

    @Test
    public void testNewDefaultBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .build();
        System.out.println(bigMac);
        //When
        int numberOfBurgers = bigMac.getBurgers();
        //Then
        Assert.assertEquals(2, numberOfBurgers);
        Assert.assertEquals("With sesame seeds", bigMac.getBun());
        Assert.assertEquals("Standard", bigMac.getSauce());
        Assert.assertEquals(0, bigMac.getIngredients().size());
    }
}
