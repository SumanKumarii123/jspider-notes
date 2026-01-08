package PartialAbstraction;

abstract class Alpha{
	abstract void play();
	void help() {
		System.out.println("Execute help()...");
	}
}
class Beta extends Alpha{
	@Override
	void play() {
		System.out.println("Execute play()....");
	}
}
public class AlphaClass {
	public static void main(String[] args) {
		Alpha ref=new Beta();
		ref.play();
		ref.help();
	}

}
