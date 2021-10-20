package com.shristi.basic;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number,i,count=0;
		number=s.nextInt();
		for(i=2;i<number;i++) {
			if(number%i==0) {
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
       s.close();
	}

}
