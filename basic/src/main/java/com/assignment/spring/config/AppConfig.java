package com.assignment.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.assignment.spring.model.Animal;
import com.assignment.spring.model.Elephant;
import com.assignment.spring.model.Horse;
import com.assignment.spring.model.Person;

@Configuration
public class AppConfig {
	
	@Bean("horse")
	public Horse gethorse() {
		Horse horse1 = new Horse(4,"dry leaves");
		return horse1;
	}
	@Bean("elephant")
	public Elephant getDog() {
		Elephant elephant1 = new Elephant("Asian","Bananas");
		return elephant1;
	}
	@Bean("person")
	public Person getPerson() {
		Person person = new Person("Anthony","male",26);
		return person;
	}
	@Bean("animal")
	public Animal getAnimal() {
		Animal animal = new Animal("Porker");
		return animal;
	}

}
