package Has_A_Relationship;

class Demo{
	void test() {
		System.out.println("Executing test()");
	}
}
class Sample{
	Demo d=new Demo();
}
public class MainClass1 {
	public static void main(String[] args) {
		Sample s=new Sample();
		s.d.test();
	}

}
