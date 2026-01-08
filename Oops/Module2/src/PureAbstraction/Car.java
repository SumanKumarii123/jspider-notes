package PureAbstraction;

 class Car implements Vehicle{
	 @Override
	 public void start() {
		 System.out.println("Starting Car");
	 }
	 public void stop() {
		 System.out.println("Stoping Car");
	 }
}
