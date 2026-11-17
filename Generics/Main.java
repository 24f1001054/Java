class Box<T>{
	T value;

	void setvalue(T value){
		this.value = value;
	}

	T getValue(){
		return value;
	}
}




class Student<D>{
	D data;


	Student(D data){
		this.data  = data;
	}
	void display(){
		System.out.println(data);
	}
}




public class Main{
	public static void main(String[] args){

		Box<String> box = new Box<>();
		box.setvalue("1");
		String result = box.getValue();
		System.out.println(result);

// --------------------------------------------------


		Student<String> student1 = new Student<>("Shivam");

		Student<Integer> student2 = new Student<>(101);

		student1.display();
		student2.display();

	}
}