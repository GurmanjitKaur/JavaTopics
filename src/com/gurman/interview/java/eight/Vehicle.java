package com.gurman.interview.java.eight;

import java.util.Date;

public class Vehicle {
	private int id;
	private String type;
	private String model;
	private Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", type=" + type + ", model=" + model + ", date=" + date + "]";
	}

	public Vehicle(int id, String type, String model, Date date) {
		super();
		this.id = id;
		this.type = type;
		this.model = model;
		this.date = date;
	}

}
