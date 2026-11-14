class BankAccount{
	private double balance;

	public void deposit(double amount){
		if(amount>0){
			balance += amount;
		}
	}

	public void Withdraw(double amount){
		if(amount > 0 && balance >= amount){
			balance -= amount;
		}
	}

	public double remaining_balance(){
		return balance;
	}

}

public class demo{
	public static void main(String[] args){
		BankAccount account1 = new BankAccount();

		System.out.println(account1.remaining_balance());
		
		account1.deposit(5000);
		account1.Withdraw(1000);

		System.out.println(account1.remaining_balance());

		System.out.println(account1.balance);

	}
}