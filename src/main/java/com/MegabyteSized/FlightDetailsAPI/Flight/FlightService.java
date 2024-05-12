package com.MegabyteSized.FlightDetailsAPI.Flight;

import Exceptions.IncorrectSourceAndDestinationException;
import com.MegabyteSized.FlightDetailsAPI.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.function.Predicate;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;
    public List<Flight> retrieveAllFlights(){
        List<Flight> allFlights = flightRepository.findAll();
        return allFlights;

    }

    public List<Flight> retrieveFlightsSourceAndDestination(String source, String destination){
        Predicate<? super Flight> sourceAndDestinationPredicate = flight -> flight.getSource().equalsIgnoreCase(source) &&
                flight.getDestination().equalsIgnoreCase(destination);
        List<Flight> listFlights = retrieveAllFlights().stream().filter(sourceAndDestinationPredicate).toList();
        if(listFlights.isEmpty()){
            throw new IncorrectSourceAndDestinationException("Please check Source and Destination");
        }
        else{
            return listFlights;
        }
    }

    public Optional<Flight> retrieveEconomicFlight(String source, String destination){
        List<Flight> flightsSourceAndDestination = retrieveFlightsSourceAndDestination(source, destination);

        Optional<Flight> economicFlight = flightsSourceAndDestination.stream().min(Comparator.comparing(Flight::getPrice));
        return economicFlight;
    }
}