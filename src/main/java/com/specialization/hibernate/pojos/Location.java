package com.specialization.hibernate.pojos;

import javax.persistence.Embeddable;

@Embeddable
public class Location {
	
	private String city;
	private String pin;
	private String state;
	private String country;
	
	public Location(String city, String pin, String state, String country) {
		super();
		this.city = city;
		this.pin = pin;
		this.state = state;
		this.country = country;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Location [city=" + city + ", pin=" + pin + ", state=" + state + ", country=" + country + "]";
	}
	
}
