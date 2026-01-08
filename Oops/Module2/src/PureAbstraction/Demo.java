package PureAbstraction;

interface Test {
	void test();
	}
class Sample implements Test{
	@Override
	public void test() {
		System.out.println("Execute test()....");
	}
}
public class Demo{
	public static void main(String[] args) {
		Test ref=new Sample();
		ref.test();
	}
}


