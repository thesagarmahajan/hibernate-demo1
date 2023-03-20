package com.specialization.hibernate.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Machine {
	@Id
	@GeneratedValue
	private int id;
	private String sr_number;
	private String type;
	
	@OneToOne
	private Employee employee;
	
	public Machine(int id, String sr_number, String type) {
		super();
		this.id = id;
		this.sr_number = sr_number;
		this.type = type;
	}
	public Machine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSr_number() {
		return sr_number;
	}
	public void setSr_number(String sr_number) {
		this.sr_number = sr_number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Machine [id=" + id + ", sr_number=" + sr_number + ", type=" + type + "]";
	}

}
