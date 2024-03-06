package com.example.flightsearch.repository;


import com.example.flightsearch.entity.FlightNoDate;
import com.example.flightsearch.entity.FlightSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FlightScheduleRepo extends JpaRepository<FlightSchedule, FlightNoDate> {
	@Query("SELECT i FROM FlightSchedule i where i.flightNoDate.flightDate = ?1 AND i.depAirport = ?2 AND i.arrAirport = ?3")
    List<FlightSchedule> findByFlightDateAndDepAirportAndArrAirport(String flightDate, String depAirport, String arrAirport);
}
