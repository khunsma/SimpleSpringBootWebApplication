package com.mmdeveloper.SimpleSpringBootWebApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmdeveloper.SimpleSpringBootWebApplication.domain.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}
