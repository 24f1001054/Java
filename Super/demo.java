class Employee{
	String name;

	Employee(String name){
		this.name = name;
	}
}

class Developer extends Employee{
	String language;

	Developer(String name,String language){
		super(name);
		this.language = language;
		System.out.println(" Child constructor called ");
		System.out.println(name);
	}
}



public class demo{
	public static void main(String[] args){

		Developer dev1  = new Developer("rohan","Python");

		System.out.println(dev1.name);
		System.out.println(dev1.language);

	}
}