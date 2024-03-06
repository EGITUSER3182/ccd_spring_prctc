package com.example.flightsearch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class FlightSeatAvailability {
	@EmbeddedId
    private FlightNoDate flightNoDate;
	@Column(nullable=false)
	private int availableSeatCount;
}
