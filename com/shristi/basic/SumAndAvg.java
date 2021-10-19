package com.shristi.basic;
import java.util.Scanner;

public class SumAndAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,sum=0;
		float average;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Elements");
		number=s.nextInt();
		int a[] = new int[number];
		System.out.println("enter all Elements");
		for(int i=0;i<number;i++) {
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum:"+sum);
		average=(float)sum/number;
        System.out.println("average:"+average);		

	}

}
