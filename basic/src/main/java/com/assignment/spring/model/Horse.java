package com.assignment.spring.model;

public class Horse extends Animal{
	
	
	private double height;
	private String food;
	

	public Horse() {
	}
	

	public Horse(double height, String food) {
		super();
		this.height = height;
		this.food = food;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public String getFood() {
		return food;
	}


	public void setFood(String food) {
		this.food = food;
	}
	
	@Override
	public String toString() {
		System.out.println("The details about horse :");
		return "Height of elephant is  "+height+"m and it eats "+food;
		
	}
}
