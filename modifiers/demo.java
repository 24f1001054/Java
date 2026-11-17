class BankAccount{
	private double balance = 500000;
	public String name = "Aditya";

	String accNum = "23FNSBN2345098ZA07";

	public void showbalance(){
		System.out.println(balance);
	}

	void AccountNum (){
		System.out.println(accNum);
	}



}




public class demo{
	public static void main(String[] args){
		BankAccount account = new BankAccount();
		// account.balance = 500; // It will give error;
		account.showbalance();

		// account.name;
		 System.out.println(account.accNum);// It's will not allowed and return error due to default keyword

	}
}