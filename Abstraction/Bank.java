package Abstraction;

abstract public class Bank {
	
double balance;
	
	public Bank(double balance) {
		this.balance=balance;
	}
	
	public Bank() {
		
	}
   abstract void withdraw(double amount);
   abstract void deposit(double amount);
   double getBalance() {
	   return balance;
	   
   }
}

