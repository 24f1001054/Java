public class Main{

	class Student{
		String name;
		int age;

		Student(){
			name="unknown";
			age=0;
		}
	}


	public static void main(String[] args){
		System.out.println("Hello this is a demo");

		Main main = new Main();

		Student s1  = main.new Student();
		System.out.println(s1.name +  s1.age);
	}
}