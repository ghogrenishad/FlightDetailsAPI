package com.MegabyteSized.FlightDetailsAPI.Repository;

import com.MegabyteSized.FlightDetailsAPI.Flight.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface FlightRepository extends JpaRepository<Flight, String> {
    @Override
    List<Flight> findAll();
}
