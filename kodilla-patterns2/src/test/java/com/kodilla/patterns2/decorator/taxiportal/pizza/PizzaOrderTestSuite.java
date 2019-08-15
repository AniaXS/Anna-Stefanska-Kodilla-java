package com.kodilla.patterns2.decorator.taxiportal.pizza;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrder() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();
        //Then
        assertEquals(new BigDecimal(15), cost);
        assertEquals("Pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testPizzaOrderWithExtraCheese() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheeseDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();
        //Then
        assertEquals(new BigDecimal(18), cost);
        assertEquals("Pizza with tomato sauce and cheese with extra cheese", description);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseAndExtraSauce() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ExtraCheeseDecorator(order);
        order = new ExtraSauceDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();
        //Then
        assertEquals(new BigDecimal(20), cost);
        assertEquals("Pizza with tomato sauce and cheese with extra cheese with extra sauce", description);
    }

    @Test
    public void testPizzaOrderWithHamOlivesAndCheeseCrust() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new HamDecorator(order);
        order = new OlivesDecorator(order);
        order = new DoughWithCheeseInCrustDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();
        //Then
        assertEquals(new BigDecimal(26), cost);
        assertEquals("Pizza with tomato sauce and cheese with prosciutto with olives on dough with cheese in crust", description);
    }

    @Test
    public void testPizzaOrderVeganVersionWithHamOlivesExtraSauceAndCheeseCrust() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new VeganVersionDecorator(order);
        order = new HamDecorator(order);
        order = new OlivesDecorator(order);
        order = new ExtraSauceDecorator(order);
        order = new DoughWithCheeseInCrustDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();
        //Then
        assertEquals(new BigDecimal(35), cost);
        assertEquals("Pizza with tomato sauce and cheese vegan version with prosciutto with olives "
                + "with extra sauce on dough with cheese in crust", description);
    }
}
