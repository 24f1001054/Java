public class OverLoading{
	class Student {
		String name;
		int age;
	

	Student(){
		this.name = "Unknown";
		this.age = 0;
		}

	Student(String name){
		this.name = name;
		this.age = 0;
	}
	Student(String name , int age){
		this.name = name;
		this.age = age;
		}


	}
		Student s1 = new Student();
		Student s2 = new Student("Shivam");
		Student s3 = new Student("Shivam",19);


		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s3.name);

	public static void main(String[] args){
	OverLoading	obj = new OverLoading();
	}



}