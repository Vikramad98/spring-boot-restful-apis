package com.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {

}
