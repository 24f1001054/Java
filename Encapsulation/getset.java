class Employee{
	private String name;

	public String getname(){
		return name;
	}
	public String setname(){
		if (name != null && !name.isBlank()){
			this.name = name;
		}
		return "Name setted";
	}
}



public class getset{
	public static void main(String[] args){

		Employee emp1 = new Employee();
		emp1.setname("shivam");
		System.out.println(emp1.getname());
		System.out.println(emp1.getname());

	}
}