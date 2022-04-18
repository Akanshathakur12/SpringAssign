package com.assignment.spring.model;

public class Elephant extends Animal {
	
	private String breed;
	private String e_food;
	
	public Elephant(String breed, String e_food) {
		super();
		this.breed = breed;
		this.e_food = e_food;
	}
	
	 
	public Elephant() {
		
	}

	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public String getE_food() {
		return e_food;
	}


	public void setE_food(String e_food) {
		this.e_food = e_food;
	}
	@Override
	public String toString() {
		System.out.println("elephant details are");
		return " The breed of elephant  is "+breed+" and it eats "+e_food;
	}


	

}
