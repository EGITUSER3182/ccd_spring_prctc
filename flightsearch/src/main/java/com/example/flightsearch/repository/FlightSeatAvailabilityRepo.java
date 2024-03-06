package com.example.flightsearch.repository;


import com.example.flightsearch.entity.FlightNoDate;
import com.example.flightsearch.entity.FlightSeatAvailability;
import org.springframework.data.repository.CrudRepository;

public interface FlightSeatAvailabilityRepo extends CrudRepository<FlightSeatAvailability, FlightNoDate> {

}
