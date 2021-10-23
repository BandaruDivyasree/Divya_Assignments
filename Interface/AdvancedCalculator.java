package Interface;

public class AdvancedCalculator extends BasicCalculator implements Scientific {

	@Override
	public void square(int x) {
		// TODO Auto-generated method stub
		System.out.println("square"+x*x);

	}

	@Override
	public void cube(int x) {
		// TODO Auto-generated method stub
		System.out.println("cube"+x*x*x);

	}

}
