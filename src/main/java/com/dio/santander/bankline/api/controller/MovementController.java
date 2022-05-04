package com.dio.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NewMovement;
import com.dio.santander.bankline.api.model.Movement;
import com.dio.santander.bankline.api.repository.MovementRepository;
import com.dio.santander.bankline.api.service.MovementService;

@RestController
@RequestMapping("/movimentacao")

public class MovementController {
	@Autowired
	private MovementRepository repository;
	
	@Autowired
	private MovementService service;
	
	@GetMapping
	public List<Movement> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NewMovement movement) {
		service.save(movement);
	}

}
