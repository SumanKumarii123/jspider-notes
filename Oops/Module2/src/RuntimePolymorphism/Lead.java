package RuntimePolymorphism;

public class Lead {
	static void reviewWork(Developer dev) {
		if(dev!=null) {
			dev.work();
		}
	}

}
