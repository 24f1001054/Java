abstract class Payment{
	abstract void pay(double amount);

	void paymentSuccess(){
		System.out.println("Payment completed successfully..");
	}
}


class UpiPayment extends Payment{
	@Override
	void pay(double amount){
		System.out.println("Paid----" + amount + " using Upi !!");
	}

}


class CreditCard extends Payment{
	@Override
	void pay(double amount){
		System.out.println("Paid----" + amount + " using Credit Card....");
	}
}








public class demo{
	public static void main(String[] args){

		UpiPayment pay1  = new UpiPayment();
		CreditCard pay2  = new CreditCard();
		pay1.pay(15000);
		pay1.pay(10000);


	}
}