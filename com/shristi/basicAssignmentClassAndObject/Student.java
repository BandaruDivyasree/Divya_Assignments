package com.shristi.basicAssignmentClassAndObject;

public class Student {
	String name;
	int studentId;
	
	public Student(String name,int studentId) {
		this.name=name;
		this.studentId=studentId;
	}
	void getDetails() {
		System.out.println("Student Name:"+name);
		System.out.println("studentId:"+studentId);
	}
	void getGrades(int[] marks) {
		int sum=0,average;
		for(int number:marks) {
			sum=sum+number;
			
		}
		average=sum/marks.length;
		System.out.println("Total marks of Student:"+sum);
		System.out.println("Average:"+average);
		if(sum<40) {
			System.out.println(" C grade");
		}else if(sum<70) {
			System.out.println("B grade");
		}else if(sum>70) {
			System.out.println("A grade");
		}
		System.out.println();
	}

}
