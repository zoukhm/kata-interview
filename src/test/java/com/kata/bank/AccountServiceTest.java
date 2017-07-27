package com.kata.bank;

import java.math.BigDecimal;

import org.junit.Test;

import com.kata.bank.Exceptions.NotAllowedOperation;
import com.kata.bank.enums.Currency;
import com.kata.bank.model.Account;
import com.kata.bank.model.Client;
import com.kata.bank.services.AccountServiceImpl;

import junit.framework.TestCase;

public class AccountServiceTest extends TestCase {
	private Client client;
	private AccountServiceImpl accountService;
	protected void setUp() throws Exception {
		accountService = new AccountServiceImpl();
		client = new Client("client-1","pierre-jean");
		Account account = new Account("account-1", new BigDecimal(0L), Currency.EUR);
		accountService.deposit(account, new BigDecimal(100L));
		client.setAccount(account);
	}
	
	@Test
    public void testWithdrawMoney() {
		try {
			accountService.withdraw(client.getAccount(), new BigDecimal(10L));
			assertEquals(client.getAccount().getBalance(), new BigDecimal(90L));
		} catch (NotAllowedOperation e) {
			fail();
		}
	}

}
