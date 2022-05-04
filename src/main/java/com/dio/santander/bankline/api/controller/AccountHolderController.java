package com.dio.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NewAccountHolder;
import com.dio.santander.bankline.api.model.AccountHolder;
import com.dio.santander.bankline.api.repository.AccountHolderRepository;
import com.dio.santander.bankline.api.service.AccountHolderService;

@RestController
@RequestMapping("/correntistas")

public class AccountHolderController {
	@Autowired
	private AccountHolderRepository repository;
	
	@Autowired
	private AccountHolderService service;
	
	@GetMapping
	public List<AccountHolder> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NewAccountHolder accountHolder) {
		service.save(accountHolder);
	}

}
