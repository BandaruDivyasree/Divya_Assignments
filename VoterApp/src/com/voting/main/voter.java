package com.voting.main;

import java.util.Scanner;

import com.voting.exceptions.LocalityNotFoundException;
import com.voting.exceptions.NoVoterIDException;
import com.voting.exceptions.NotEligibleException;
import com.voting.exceptions.UnderAgeException;
import com.voting.service.ElectionBooth;

public class voter {

	public static void main(String[] args) throws NotEligibleException {
		ElectionBooth booth = new ElectionBooth();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = s.nextInt();

		try {
			booth.checkAge(age);
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
			System.exit(0);

		}

		System.out.println("Enter Locality: ");
		String locality = s.next();
		
		try {
			booth.checkLocality(locality);
		} catch (LocalityNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);

		}
		
		System.out.println("Enter VoterID no. ");
		int voterId = s.nextInt();

		try {
			booth.checkVoterId(voterId);
		} catch (NoVoterIDException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}

		try {
			booth.checkEligibility(age, locality, voterId);
		} catch (NotEligibleException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		s.close();
	}

}