package com.shristi.basicAssignmentClassAndObject;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("First Student Name");
		String student1_name=s.next();
		System.out.println("First studentId");
		int student1_id=s.nextInt();
		
		System.out.println("Second Student Name");
		String student2_name=s.next();
		System.out.println("Second studentId");
		int student2_id=s.nextInt();
		
		System.out.println("Number of subjects");
		int numberOfSubjects=s.nextInt();
		int arr1[]=new int[numberOfSubjects];
		int arr2[]=new int[numberOfSubjects];
		System.out.println("Marks of student 1");
		for (int i=0;i<numberOfSubjects;i++) {
			arr1[i]=s.nextInt();
		}
		
		System.out.println("Marks of student 2");
		for (int i=0;i<numberOfSubjects;i++) {
			arr2[i]=s.nextInt();
		}
		Student student1=new Student(student1_name,student1_id);
		student1.getDetails();
		student1.getGrades(arr1);
		Student student2=new Student(student2_name,student2_id);
		student2.getDetails();
		student2.getGrades(arr2);
	
			

	}

}
