package Overloading;

public class Employee {
		String name;
		String designation;
		
		Employee(String name,String designation){
			this.name = name;
			this.designation= designation;
			}
			
		void getDetails() {
			System.out.println("name:"+name);
			System.out.println("designation:"+designation);
		}
		
		  double calcBonus(double basicAllowance) {
			  double bonus=basicAllowance*(2);
			  
			 return bonus;
		 }
		  
		  double calcBonus(double basicAllowance, double carAllowance) {
			  double bonus=basicAllowance*carAllowance*(2);
			   return bonus;
		  }
		  
		  double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
			  double bonus=basicAllowance*carAllowance*houseAllowance*(2);
			   return bonus;
		  }

	}


