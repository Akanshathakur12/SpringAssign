package com.assignment.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.assignment.spring.config.AppConfig;
import com.assignment.spring.model.Elephant;
import com.assignment.spring.model.Horse;
import com.assignment.spring.model.Person;

public class AppTester {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Horse horse = (Horse) context1.getBean("horse");
		Elephant elephant = (Elephant) context1.getBean("elephant");
		Person person = (Person) context1.getBean("person");
		
		System.out.println(horse.toString());
		System.out.println(elephant.toString());
		System.out.println(person.getDetails());


	}

}
