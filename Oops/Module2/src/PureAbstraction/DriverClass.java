package PureAbstraction;

public class DriverClass {
	public static void main(String[] args) {
		OracleDriver od=new OracleDriver();
		DriverManager.registerDriver(od);
		System.out.println("..................");
		IbmDriver id=new IbmDriver();
		DriverManager.registerDriver(id);
		System.out.println("....................");
		MicrosoftDriver md=new MicrosoftDriver();
		DriverManager.registerDriver(md);
	}

}
