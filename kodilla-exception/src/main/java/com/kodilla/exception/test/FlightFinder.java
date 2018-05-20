package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    private Map<String, Boolean> flightMap = new HashMap<>();

    public void findFilght(Flight flight) throws RouteNotFoundException {
        flightMap.put("Eindhoven", true);
        flightMap.put("Warsaw", true);
        flightMap.put("Lodz", false);

        if (flightMap.containsKey(flight.getDepartureAirport()) && flightMap.containsKey(flight.getArrivalAirport())) {
            if ((flightMap.get(flight.getDepartureAirport())) && (flightMap.get(flight.getArrivalAirport()))) {
                System.out.println("You can fly from " + flight.getDepartureAirport() + " to " + flight.arrivalAirport);
            } else {
                throw new RouteNotFoundException("Flight not possible");
            }
        } else {
            throw new RouteNotFoundException("Flight not possible");
        }
    }
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Warsaw", "Eindhoven");
        try {
            flightFinder.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found");
        } finally {
            System.out.println("Want to find another flight?");
        }
    }
}