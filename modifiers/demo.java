class BankAccount{
	private double balance = 500000;
	public String name = "Aditya";

	public void showbalance(){
		System.out.println(balance);
	}
}




public class demo{
	public static void main(String[] args){
		BankAccount account = new BankAccount();
		// account.balance = 500; // It will give error;
		account.showbalance();

		account.name;

	}
}