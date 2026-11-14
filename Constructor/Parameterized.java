public class Parameterized{
	
	static class Student(String name,int age){
		String name;
		int age;
	}

	static class Student(int roll, String name, int age){
		String name;
		int age;

	}
	Student s1 = new Student(Rajat,12);
	
	public static void main(String[] args){
		System.out.println(s1.name +s1.age);
	}
}