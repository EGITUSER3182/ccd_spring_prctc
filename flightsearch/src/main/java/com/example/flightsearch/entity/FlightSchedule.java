package com.example.flightsearch.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class FlightSchedule {
	@EmbeddedId
    private FlightNoDate flightNoDate;
	@Column(nullable=false)
	private String depAirport;
	@Column(nullable=false)
	private String depCity;
	@Column(nullable=false)
	private String arrAirport;
	@Column(nullable=false)
	private String arrCity;
}
