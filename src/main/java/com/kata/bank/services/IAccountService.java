package com.kata.bank.services;

import java.math.BigDecimal;

import com.kata.bank.Exceptions.NotAllowedOperation;
import com.kata.bank.model.Account;

public interface IAccountService {
	/**
	 * Withdraws the specified amount from the account
	 * @param account 
	 * @param amount to withdraw
	 * @throws NotAllowedOperation if amount is greater than the current balance of the account
	 */
	void withdraw(Account account, BigDecimal amount) throws NotAllowedOperation;
	
	/**
	 * Deposits the specified amount from the account
	 * @param account 
	 * @param amount the amount to deposit
	 */
	void deposit(Account account, BigDecimal amount);
	
	/**
	 * Returns the available balance of the specified account
	 * @param account
	 * @return the current balance
	 */
	BigDecimal getBalance(Account account);
}
