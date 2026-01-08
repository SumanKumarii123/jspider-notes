package Inner_Class;

class Alpha{
	class Beta{
		void help() {
			System.out.println("Execute help()..");
		}
	}
}
public class Program2 {
	public static void main(String[] args) {
		Alpha.Beta ref=new Alpha().new Beta();
		ref.help();
	}

}
