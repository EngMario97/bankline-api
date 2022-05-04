package com.dio.santander.bankline.api.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NewMovement;
import com.dio.santander.bankline.api.model.AccountHolder;
import com.dio.santander.bankline.api.model.Movement;
import com.dio.santander.bankline.api.model.MovementType;
import com.dio.santander.bankline.api.repository.AccountHolderRepository;
import com.dio.santander.bankline.api.repository.MovementRepository;

@Service
public class MovementService {
	@Autowired
	private MovementRepository movementRepository;
	
	@Autowired
	private AccountHolderRepository accountHolderRepository;
	
	public void save(NewMovement newMovement) {
		Movement movement = new Movement();
		
		Double value = newMovement.getType() == MovementType.INCOME ? newMovement.getValue() : newMovement.getValue() * -1;
		
		movement.setDatetime(LocalDateTime.now());
		movement.setDescription(newMovement.getDescription());
		movement.setIdAccount(newMovement.getIdAccount());
		movement.setType(newMovement.getType());
		movement.setValue(value);
		
		AccountHolder accountHolder = accountHolderRepository.findById(newMovement.getIdAccount()).orElse(null);
		
		if(accountHolder != null) {
			accountHolder.getAccount().setBalance(accountHolder.getAccount().getBalance() + value);
			accountHolderRepository.save(accountHolder);
		}
		
		movementRepository.save(movement);
		
	}
}
