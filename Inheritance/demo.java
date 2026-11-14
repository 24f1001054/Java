class Employee{
	String name;
	int age;
	double salary;

	void display(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
}

class Developer extends Employee{
	String programmingLang;

	void writecode(){
		System.out.println("Build systems !!");

	}
}

class Datascientist extends Employee{
	String role;

	void writecode(){
		System.out.println("Model building  !!");

	}
}



public class demo{
	public static void main(String[] args){

		Developer dev1 = new Developer();

		dev1.name = "Shyam";
		dev1.age = 24;
		dev1.salary = 150000;
		
		dev1.display();
		dev1.writecode();
	}
}