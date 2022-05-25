package com.learn.srpingboot.SPRING_AXYYA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flightInfo")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long flightNo;

	@Column(name = "carrier_name", nullable = false)
	private String carrierName;
	@Column(name = "flight_model", nullable = false)
	private String flightModel;
	@Column(name = "seat_capacity", nullable = false)
	private Long seatCapacity;

	public String getCarrierName() {
		return carrierName;
	}

	public Long getFlightNo() {
		return flightNo;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getFlightModel() {
		return flightModel;
	}

	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}

	public Long getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(Long seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

}
