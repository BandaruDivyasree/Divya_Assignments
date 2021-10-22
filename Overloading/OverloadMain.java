package Overloading;
import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=s.next();
		double basicAllowance=20000;
		double carAllowance=10000;
		double homeAllowance=20000;
		//System.out.println("Enter Allowance");
		
		System.out.println("Enter the designation of the employee:");
		String designation=s.next();
		Employee Manager=new Employee(name,designation);
		Employee Programmer=new Employee(name,designation);
		Employee Director=new Employee(name,designation);
		
		if(designation.equals("Manager")) {
			double bonus=Manager.calcBonus(basicAllowance, carAllowance);
			System.out.println((int) bonus);
		}else if(designation.equals("Programmer")) {
			double bonus=Manager.calcBonus(basicAllowance);
			System.out.println((int) bonus);
		}else if(designation.equals("Director")) {
			double bonus=Manager.calcBonus(basicAllowance, carAllowance, homeAllowance);
			System.out.println((int) bonus);
		}
		s.close();

	}

}
