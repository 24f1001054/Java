interface Payment{
	void pay(double amount);
}

imterface Notification{
	void sms(String msg);
}


class UpiPayment implements Payment,Notification{
	

	@Override
	public void pay(double amount){
		System.out.println("Paid Using UPI: \t" + amount);
	}


	@Override
	public void sms(String msg){
		System.out.println(msg);
	}
}




public class demo{
	
	public static void main(String[] args){
	UpiPayment upi = new UpiPayment();

	upi.pay(500000);}


}