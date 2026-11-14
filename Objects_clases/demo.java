class Student {
	String name;
	int age;

	Student(String name , int age){
		this.name =  name;
		this.age = age;
	}

	// @Override
	// public String toString() {
	// 	return "Student{name='" + name + "' ,age=" + age + "}";
	// }
}



public class demo{
	public static void main(String[] main){
		Student std1 = new Student("Ronny",22);
		Student std2 = new Student("Ronny",22);
		System.out.println(std1);
		System.out.println(std2);
		
		System.out.println(std1.equals(std2));
	}
}