public class demo{
	static class Employee{
		String name;
		int id;
		int Salary;
		
	static void displayDetails(String name,int id,int Salary){
		System.out.println(id,name,Salary);
	}
	}
	Employee e1 = new Employee();
	Employee e2 = new Employee();
	Employee e3 = new Employee();


	static class Book{
		String title;
		String author;
		int price;
	}




	public static void main(String[] args){
		System.out.println("Hello World");

		Book b1 = new Book();
		Book b2 = b1;
		
	}
}