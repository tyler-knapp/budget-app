package com.philodelight.budgetingapp;

import com.philodelight.budgetingapp.model.CheckingAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BudgetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetingApplication.class, args);
		CheckingAccount checkingAccount = new CheckingAccount("tyler", "knapp", 100.00);
		System.out.println(checkingAccount.getLastName());
		System.out.println(checkingAccount.getFirstName());
		System.out.println(checkingAccount.getBalance());
		checkingAccount.withdrawalMoney(60.00);
		System.out.println(checkingAccount.getBalance());
		checkingAccount.withdrawalMoney(300.00);
	}

}
