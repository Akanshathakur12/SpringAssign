package com.assignment.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.spring.model.Course;
import com.assignment.spring.repo.CourseRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository repository;
	
	public List<Course> getCourseList(){
		return (List<Course>)repository.findAll();
	}
}
