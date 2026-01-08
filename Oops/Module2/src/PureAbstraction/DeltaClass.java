package PureAbstraction;

interface Delta{
	void help();
	void send();
}
class Example implements Delta{

	@Override
	public void help() {
		System.out.println("Execute help()...");
		
	}

	@Override
	public void send() {
		System.out.println("Execute send()...");
	}
	
}
public class DeltaClass {
	public static void main(String[] args) {
		Delta d=new Example();
		d.help();
        d.send();
	}

}
