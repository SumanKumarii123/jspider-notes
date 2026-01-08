package RuntimePolymorphism;

public class Facebook {
	void display() {
		System.out.println("Display in Facebook");
	}

}
class FacebookMobile extends Facebook{
	@Override
	void display() {
		System.out.println("Display in App");
	}
}
class FacebookWebsite extends Facebook{
	@Override
	void display() {
		System.out.println("Display in Browser");
	}
}
