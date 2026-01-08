package PartialAbstraction;

abstract class Delta{
	void run() {
		System.out.println("Execute run...");
	}
	void read() {
		System.out.println("Execute read....");
	}
}
class Example extends Delta{
	
}
public class DeltaClass {
	public static void main(String[] args) {
		Delta d=new Example();
		d.run();
		d.read();
	}

}
