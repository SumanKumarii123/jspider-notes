package PureAbstraction;

public class DriverManager {
	static void registerDriver(Driver ref) {
		if(ref != null) {
			ref.register();
		}
	}

}
