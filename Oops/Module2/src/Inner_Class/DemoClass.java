package Inner_Class;

class Demo{
	static class Sample{
		void test() {
			System.out.println("Execute test()..");
		}
	}
}
public class DemoClass {
	public static void main(String[] args) {
		Demo.Sample ref=new Demo.Sample();
		ref.test();
	}

}
