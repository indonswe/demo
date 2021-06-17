package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Hej");

		BankAccount account = new BankAccount(500, "Kalle", "Anka", 12345);


		System.out.println(account.getBalanceAccount());
	}

}
