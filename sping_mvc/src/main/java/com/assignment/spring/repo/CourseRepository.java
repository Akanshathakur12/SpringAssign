package com.assignment.spring.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.spring.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

}
