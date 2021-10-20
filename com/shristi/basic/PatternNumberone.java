package com.shristi.basic;
import java.util.Scanner;

public class PatternNumberone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
		int count=1;
		for(int i=1;i<=num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" "+count);
				count++;
			}
			System.out.println();
		}
        s.close();
        
	}

}
