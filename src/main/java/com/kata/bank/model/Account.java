package com.kata.bank.model;

import java.math.BigDecimal;

import com.kata.bank.enums.Currency;

public class Account {
	/**
	 * the id of the account
	 */
	private String id;
	/**
	 * the available balance
	 */
	private BigDecimal balance;
	
	/**
	 * 
	 */
	private Currency currency;
	
	
	public Account(String id, BigDecimal balance, Currency currency) {
		super();
		this.id = id;
		this.balance = balance;
		this.currency = currency;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (currency != other.currency)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	
	
	
}
