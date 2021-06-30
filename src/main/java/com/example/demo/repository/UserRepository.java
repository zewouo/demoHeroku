package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entities.UserDetail;

public interface UserRepository extends JpaRepository<UserDetail, Long> {

}
