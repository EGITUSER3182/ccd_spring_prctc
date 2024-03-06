package com.example.flightsearch.repository;


import com.example.flightsearch.entity.FlightFare;
import com.example.flightsearch.entity.FlightNoDate;
import org.springframework.data.repository.CrudRepository;

public interface FlightFareRepo extends CrudRepository<FlightFare, FlightNoDate> {

}
