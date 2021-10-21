package com.shristi.basicAssignmentClassAndObject;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Amount");
		Scanner s=new Scanner(System.in);
		int amount= s.nextInt();
		Bank user=new Bank();
		user.deposit(amount);
		double balance=user.getBalance();
	System.out.println(balance);
		

	}

}
