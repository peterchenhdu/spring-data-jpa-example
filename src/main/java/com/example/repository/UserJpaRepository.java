package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.User;


public interface UserJpaRepository extends JpaRepository<User,Long> {

}
