package com.shristi.basicAssignment;
import  java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] userNames=new String[] {"Divya","Mrudula","Prathyusha","Sushma"};
		Scanner s=new Scanner(System.in);
		System.out.println("Get username to login");
		String userName=s.next();
		int count=0;
		for(String name:userNames) {
			if(userName.equals(name)) {
				count=1;
			}
				
		}
		if(count==1) {
			System.out.println("You are logged Successfully");
		}else {
			System.out.println("invalid username");
		}
		s.close();

	}

}

