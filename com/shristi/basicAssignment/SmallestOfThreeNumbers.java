package com.shristi.basicAssignment;
import java.util.Scanner;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Values:");
		int firstValue=s.nextInt();
		int secondValue=s.nextInt();
		int thirdValue=s.nextInt();
		
		if(firstValue<secondValue&&firstValue<thirdValue) {
			System.out.println("The smallest Value is:"+firstValue);
		}else if(secondValue<thirdValue) {
			System.out.println("The smallest Value is:"+secondValue);
			
		}else {
			System.out.println("The smallest Value is:"+thirdValue);
		}
		s.close();

	}

}
