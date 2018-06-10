package com.batcodes.springboot.springbootjpa.service;

import com.batcodes.springboot.springbootjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
