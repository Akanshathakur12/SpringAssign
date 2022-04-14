package com.assignment.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assignment.spring.model.Elephant;
import com.assignment.spring.model.Horse;
import com.assignment.spring.model.Person;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Horse horse = (Horse) context.getBean("horse");
		Elephant elephant = (Elephant) context.getBean("elephant");
		Person person = (Person) context.getBean("person");
		
		System.out.println(horse.toString());
		System.out.println(elephant.toString());
		System.out.println(person.getDetails());

	}

}
