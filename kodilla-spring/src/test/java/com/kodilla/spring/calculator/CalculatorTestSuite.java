package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sum = calculator.add(12.4, 0.2);
        double sub = calculator.sub(12.4, 0.2);
        double mul = calculator.mul(12.4, 0.2);
        double div = calculator.div(12.4, 0.2);
        //Then
        Assert.assertEquals(12.6, sum, 0.001);
        Assert.assertEquals(12.2, sub, 0.001);
        Assert.assertEquals(2.48, mul, 0.001);
        Assert.assertEquals(62, div, 0.001);
    }
}
