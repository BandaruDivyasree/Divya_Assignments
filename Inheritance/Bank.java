package Inheritance;

public class Bank {
	double balance;
	
	public Bank(double balance) {
		this.balance=balance;
	}
	
	public Bank() {
		
	}
   void withdraw(double amount) {
	   balance-=amount;
   }
   
   
   void deposit(double amount) {
	   balance+=amount;
	   
   }
   double getBalance() {
	   return balance;
   }





	
}
