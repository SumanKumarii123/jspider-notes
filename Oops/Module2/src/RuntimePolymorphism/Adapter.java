package RuntimePolymorphism;

public class Adapter {
	static void adapt(Facebook fb) {
		if(fb!=null) {
			fb.display();
		}
	}

}
