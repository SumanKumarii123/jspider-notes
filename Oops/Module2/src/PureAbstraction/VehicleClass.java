package PureAbstraction;

public class VehicleClass {
	public static void main(String[] args) {
		Car c=new Car();
		VehicleSimulator.simulate(c);
		System.out.println(".................");
		Bike b=new Bike();
		VehicleSimulator.simulate(b);
	}

}
