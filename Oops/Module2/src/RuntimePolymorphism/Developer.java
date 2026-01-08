package RuntimePolymorphism;

public class Developer {
	void work() {
		System.out.println("Coding");
	}

}
class Frontend extends Developer{
	@Override
	void work() {
		System.out.println("HTML,CSS,JS");
	}
}
class Backened extends Developer{
	@Override
	void work() {
		System.out.println("JAVA,SQL,SPRING");
	}
}
