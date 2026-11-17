class Box<T>{
	T value;

	void setvalue(T value){
		this.value = value;
	}

	T getValue(){
		return value;
	}
}





public class Main{
	public static void main(String[] args){

		Box<String> box = new Box<>();
		box.setvalue("1");
		String result = box.getValue();
		System.out.println(result);
	}
}