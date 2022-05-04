package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Movement;

public interface MovementRepository extends JpaRepository<Movement, Integer>{

}
