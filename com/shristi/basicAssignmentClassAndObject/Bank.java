package com.shristi.basicAssignmentClassAndObject;
import java.util.Scanner;

public class Bank {

     double balance = 0;
     public void withdraw(int x) {
    	balance-=x;
     }
     
     
     public void deposit(int x) {
    	balance+=x;
     }
      public double getBalance() {
    	 return balance;
      }

	

}
