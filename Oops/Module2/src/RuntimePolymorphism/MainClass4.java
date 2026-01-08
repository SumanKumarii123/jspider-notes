package RuntimePolymorphism;

public class MainClass4 {
	public static void main(String[] args) {
		FacebookMobile mob=new FacebookMobile();
		Adapter.adapt(mob);
		System.out.println("...............");
		FacebookWebsite web=new FacebookWebsite();
		Adapter.adapt(web);
	}

}
