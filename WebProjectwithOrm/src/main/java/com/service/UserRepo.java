package com.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
