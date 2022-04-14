package com.assignment.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	private String first_name;
	private String last_name;
	private int id;
	
	@SuppressWarnings("unused")
	@Autowired
	private Animal animal;
	public Person(String first_name, String last_name, int id) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.id = id;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDetails() {
		return "Name of the person is "+first_name+last_name+" and his id is "+id;
		
	}

}
