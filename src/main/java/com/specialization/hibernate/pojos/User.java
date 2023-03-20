package com.specialization.hibernate.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
// Overriding entity name with new name as "users".
// Hibernate will create a table in database with the name "users"
// @Table(name="users")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String email;
	private String password;
	
	private Location lcation;
	

	public User(int id, String name, String email, String password, Location lcation) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.lcation = lcation;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public Location getLcation() {
		return lcation;
	}

	public void setLcation(Location lcation) {
		this.lcation = lcation;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", lcation="
				+ lcation + "]";
	}
	
}
