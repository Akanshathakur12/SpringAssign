package com.assignment.spring.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.spring.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
