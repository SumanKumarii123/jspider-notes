package PureAbstraction;

class Omega{
	void jump() {
		System.out.println("jump");
	}
}
interface Sigma{
	void push();
}
class Theta extends Omega implements Sigma{
	@Override
	public void push() {
		System.out.println("Execute push()");
	}
}
public class OmegaClass {
	public static void main(String[] args) {
	Theta obj=new Theta();
	obj.push();
	obj.jump();
	}
}
