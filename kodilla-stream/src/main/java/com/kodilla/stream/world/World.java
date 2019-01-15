package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> world = new ArrayList<>();
    private final String name;

    public World(final String name) {
        this.name = name;
    }

    public List<Continent> getWorld() {
        return new ArrayList<>(world);
    }

    public String getName() {
        return name;
    }

    public void addCoctinent(Continent continent) {
        world.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return world.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    @Override
    public String toString() {
        return "World{" +
                "world=" + world +
                ", name='" + name + '\'' +
                '}';
    }
}
