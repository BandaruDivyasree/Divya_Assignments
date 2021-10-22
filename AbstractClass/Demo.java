//Abstract class and Method
package AbstractClass;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaheshPhone obj=new SureshPhone();
		obj.call();
		obj.cook();
		obj.dance();
		obj.move();
	}
	

	}
  abstract class MaheshPhone{//abstract class
	  
	  public void call() {
		  System.out.println("calling..");
	  }
	  public abstract void move();//abstract methods
	  public abstract void dance();
	  public abstract void cook();
  }
  abstract class RameshPhone extends MaheshPhone{
	  public void move() {
		  System.out.println("Moving...");
	  }

}
  class SureshPhone extends RameshPhone{//concrete class
	  public void dance() {
		  System.out.println("dancing...");
	  }
	  public void cook() {
		  System.out.println("cooking");
	  }
  }
