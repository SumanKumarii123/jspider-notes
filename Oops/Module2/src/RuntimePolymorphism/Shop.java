package RuntimePolymorphism;

public class Shop {
	static void payment(Card ref) {
		if(ref!=null) {
			ref.swipe();
		}
	}

}
