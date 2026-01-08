package Inner_Class;

class Delta{
	void test() {
		class Example{
			void play() {
				System.out.println("play()....");
			}
		}
		Example obj=new Example();
		obj.play();
	}
}
public class Program3 {
	public static void main(String[] args) {
		Delta ref=new Delta();
		ref.test();
	}

}
