package com.shristi.basic;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int firstnum=0,secondnum=1,sum;
		int n=s.nextInt();
		System.out.println(firstnum);
		System.out.println(secondnum);
		for(int i=0;i<n-2;i++) {
			sum=firstnum+secondnum;
			System.out.println(sum);
			firstnum=secondnum;
			secondnum=sum;
		}
		s.close();

	}

}
