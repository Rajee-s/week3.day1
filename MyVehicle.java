package week3.day1;

public class MyVehicle {

	public static void main(String[] args) {
		Suzuki myBike = new Suzuki();
		myBike.brandMaruthi();
		myBike.startEngine();
		myBike.lightOn();
		myBike.handBrake();
		
		AshokLeyland myTruck = new AshokLeyland();
		myTruck.lightOn();
		myTruck.heavyLoad();
		myTruck.startEngine();
		
		//overriding
		myTruck.lightOn();
		
		//overloading
		Vehicle ve = new Vehicle();
		ve.startEngine("Audi");
		

	}

}
