package Inheritance;
import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Amount Type");
		System.out.println("Savings Account Press 1,For Current Amount Press 2");
		System.out.println();
		String accountType=s.next();
		Bank account=new AccountSavings();
		
		if(accountType.equals("1")) {
			System.out.println("select operation");
			System.out.println("press 1 for Withdraw");
			System.out.println("press 2 for deposit");
			System.out.println("press 3 for BAlance");
			System.out.println();
			String input=s.next();
			
			switch(input) {
			case "1":
				System.out.println("Enter Amount to deposit" );
				int depositAmount=s.nextInt();
				account.deposit(depositAmount);
				break;
			case "2":
				System.out.println("Enter Amount to withdraw" );
				int WithdrawAmount=s.nextInt();
				account.deposit(WithdrawAmount);
				break;	
			case "3":
				System.out.println();
				account.getBalance();
			}
			
			
		}
		if(accountType.equals("2")) {
			System.out.println("Select the operation");
			System.out.println("press 1 for Deposit");
			System.out.println("press 2 for withdraw");
			System.out.println("press 3 for Balance");
			System.out.println();
			String input=s.next();
			switch(input) {
			case "1":
				System.out.println("Enter Amount to deposit" );
				int depositAmount=s.nextInt();
				account.deposit(depositAmount);
				break;
			case "2":
				System.out.println("Enter Amount to withdraw" );
				int WithdrawAmount=s.nextInt();
				account.deposit(WithdrawAmount);
				break;	
			case "3":
				System.out.println();
				account.getBalance();
			}
		}
		s.close();
		
		
		

	}

}
