package com.example.flightsearch.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class FlightFare {
	@EmbeddedId
    private FlightNoDate flightNoDate;
	@Column(nullable=false)
	private int amount;
	@Column(nullable=false)
	private String currency;
}
