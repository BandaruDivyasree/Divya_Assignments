package Inheritance;

public class AccountSavings extends Bank {
       public AccountSavings() {
    	   
       }
       public AccountSavings(double balance) {
    	   super(balance);
       }
	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		if((balance!=0)&&(amount!=0)){
			balance=balance-amount-5;
		}else {
			System.out.println("Not a Sufficient amount");
		}
	}
	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		if((amount!=0)) {
			balance=balance+amount+3;
		}else {
			System.out.println("Enter amount");
		}
	}
       

}
