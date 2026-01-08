package PureAbstraction;

interface Alpha{
	void read();
}
interface Beta{
	void write();
}
class Gamma implements Alpha,Beta{

	@Override
	public void write() {
		System.out.println("Execute write()...");
	}

	@Override
	public void read() {
		System.out.println("Execute read()...");
	}	
}
public class AlphaClass {
	public static void main(String[] args) {
		Gamma ref=new Gamma();
		ref.read();
		ref.write();
	}

}
