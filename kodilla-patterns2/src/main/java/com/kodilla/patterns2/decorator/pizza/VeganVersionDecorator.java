package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class VeganVersionDecorator extends AbstractPizzaOrderDecorator {
    public VeganVersionDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " vegan version";
    }
}
