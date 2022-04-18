package com.fhissa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fhissa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
