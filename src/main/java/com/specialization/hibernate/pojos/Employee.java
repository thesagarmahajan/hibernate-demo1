package com.specialization.hibernate.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;
	private String nameString;
	
	@OneToOne
	private Machine machine;

	public Employee(int id, String nameString, Machine machine) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.machine = machine;
	}
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public Machine getMachine() {
		return machine;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", nameString=" + nameString + ", machine=" + machine + "]";
	}
	
}
