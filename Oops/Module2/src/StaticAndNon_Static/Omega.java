package StaticAndNon_Static;

class Example{
	char val;
	{
		System.out.println("execute block-1");
		val='a';
	}
	{
		System.out.println("execute block-2");
		val='b';
	}
}
public class Omega {
	public static void main(String[] args) {
		System.out.println("program starts");
		Example e=new Example();
		System.out.println(e.val);
		System.out.println("program ends");
	}

}
