package SessionTask;

public class Account {
	protected String accName;
	protected String accNo;
	protected String bankName;
	
	public Account() {
		System.out.println("in default");
	}
	
	public Account(String accName,String accNo,String bankName) {
		this.accName=accName;
		this.accNo=accNo;
		this.bankName=bankName;
		
	}

	void display() {
		System.out.println("Account Name:"+accName);
		System.out.println("Account No:"+accNo);
		System.out.println("Bank Name:"+bankName);
		
		

	}

}
