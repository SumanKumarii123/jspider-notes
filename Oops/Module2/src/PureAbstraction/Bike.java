package PureAbstraction;

class Bike implements Vehicle {
	@Override
	public void start() {
		System.out.println("Starting Bike");
	}
	public void stop() {
		System.out.println("Stoping Bike");
	}

}
