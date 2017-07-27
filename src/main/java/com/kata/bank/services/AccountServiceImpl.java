package com.kata.bank.services;

import java.math.BigDecimal;

import com.kata.bank.Exceptions.NotAllowedOperation;
import com.kata.bank.Exceptions.PreconditionExcepion;
import com.kata.bank.model.Account;

public class AccountServiceImpl implements IAccountService {

	public void withdraw(Account account, BigDecimal amount) throws NotAllowedOperation {
		if (amount.doubleValue()<0) {
			throw new PreconditionExcepion("The amount to withdraw must have a postive value");
		}
		if(account.getBalance().doubleValue()-amount.doubleValue()>0) {
			account.setBalance( new BigDecimal(account.getBalance().doubleValue()-amount.doubleValue()));
		} else {
			throw new NotAllowedOperation("You dont have enough money in this account  "+ account.getId()+ " to withdraw "+ amount.doubleValue());
		}

	}

	public void deposit(Account account, BigDecimal amount) {
		if (amount.doubleValue()<0) {
			throw new PreconditionExcepion("The amount to withdraw must have a postive value");
		}
		account.setBalance( new BigDecimal(account.getBalance().doubleValue()+amount.doubleValue()));

	}

	public BigDecimal getBalance(Account account) {
		return account.getBalance();
	}

}
