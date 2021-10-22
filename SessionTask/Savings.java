package SessionTask;

public class Savings extends Account{
	private String Organiser;
	
	public Savings() {
		super();
	}
	public Savings(String accName,String accNo,String bankName,String Organiser) {
		super(accName,accNo,bankName);
		this.Organiser = Organiser;
	}
	void display() {
		super.display();
		System.out.println("Organisation Name:"+Organiser);
	}

}
