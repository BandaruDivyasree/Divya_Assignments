package com.shristi.basicAssignmentClassAndObject;

public class Vehicle {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
*/	   
	private String name;
	private int price;
	private String model;

	    
	    
	    Vehicle(String name, String model,int price){
	    	this.name=name;
	    	this.model=model;
	    	this.price=price;
	    	
	    }
	    void geDetails() {
	    	System.out.println("VehicleName:"+name);
	    	System.out.println("Model:"+model);
	    	System.out.println("Price"+price);
	    
	}

}
