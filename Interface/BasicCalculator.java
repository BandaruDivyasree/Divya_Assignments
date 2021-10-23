package Interface;

public class BasicCalculator implements Calculator {

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("sum"+(x+y));

	}

	@Override
	public void difference(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Difference"+(x-y));

	}

	@Override
	public void product(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("product"+(x*y));

	}

	@Override
	public void divide(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("divide"+(x*y));

	}

}
