package com.example.flightsearch.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Embeddable
public class FlightNoDate implements Serializable {
	private static final long serialVersionUID = 1L;
	private String flightNo;
	private String flightDate;		//Format : dd/LLL/uu , eg : 08/Feb/24
}
