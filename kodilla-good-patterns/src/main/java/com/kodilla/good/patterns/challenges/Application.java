package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movieList = movieStore.getMovies().values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("!"));

        System.out.println(movieList);
    }
}
