class Engine{
	void start(){
		System.out.println("Engine getting Start..");

	}
}

class Car{
	private Engine engine;
	
	Car(){
		engine = new Engine();
	}

	void startCar(){
		engine.start();
		System.out.println("Car started...");
	}
}



public class demo{
	public static void main(String[] args){

		System.out.println("Hariom's Car");
		Car car = new Car();
		car.startCar() ;
	}
}