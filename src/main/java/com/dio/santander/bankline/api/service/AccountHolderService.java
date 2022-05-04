package com.dio.santander.bankline.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NewAccountHolder;
import com.dio.santander.bankline.api.model.Account;
import com.dio.santander.bankline.api.model.AccountHolder;
import com.dio.santander.bankline.api.repository.AccountHolderRepository;

@Service
public class AccountHolderService {
	@Autowired
	private AccountHolderRepository repository;
	public void save(NewAccountHolder newAccountHolder) {
		AccountHolder accountHolder = new AccountHolder();
		accountHolder.setCpf(newAccountHolder.getCpf());
		accountHolder.setName(newAccountHolder.getName());
		
		Account account = new Account();
		account.setBalance(0.00);
		account.setNumber(new Date().getTime());
		
		accountHolder.setAccount(account);
		repository.save(accountHolder);
		
	}

}
