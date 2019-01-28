package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsSearch {

    public static void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> listOfDepartures = new HashMap<>();

        listOfDepartures.put("Warszawa Okęcie", false);
        listOfDepartures.put("Modlin", true);
        listOfDepartures.put("Wrocław", true);
        listOfDepartures.put("Poznań Ławica", true);
        listOfDepartures.put("Kraków Balice", false);
        listOfDepartures.put("Katowice Pyrzowice", true);
        listOfDepartures.put("Łódź Lublinek", false);
        listOfDepartures.put("Gdańsk Rębiechowo", true);

        if (listOfDepartures.containsKey(flight.getArrivalAirport())) {
            if (listOfDepartures.get(flight.getArrivalAirport())) {
                System.out.println("There are flights to the " + flight.getArrivalAirport() + " airport.");
            } else {
                System.out.println("There are no flights to the " + flight.getArrivalAirport() + " airport.");
            }
        } else {
            throw new RouteNotFoundException();
        }

    }

    public static void main(String[] args) {
        Flight flight = new Flight("Modlin", "Zakopane");

        try {
            findFlight(flight);
        } catch (RouteNotFoundException r) {
            System.out.println(flight.getArrivalAirport() + " airport is unknown");
        } finally {
            System.out.println("Thank you for using our search engine");
        }
    }
}
