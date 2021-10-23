package Interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//interface reference=implementation class
		  Calculator ref= new BasicCalculator();
		  ref.add(20,30);
		  ref.difference(20,30);
		  ref.product(20,30);
		  ref.divide(20,30);
          
		  System.out.println();
		  ref= new AdvancedCalculator();
		  ref.add(20,30);
		  ref.difference(20,30);
		  ref.product(20,30);
		  ref.divide(20,30);
		  
		  System.out.println();
		  Scientific scientific=new AdvancedCalculator();
		  scientific.add(20,30);
		  scientific.difference(20,30);
		  scientific.product(20,30);
		  scientific.divide(20,30);
		  scientific.square(20);
		  scientific.cube(30);
		  
	}

}
