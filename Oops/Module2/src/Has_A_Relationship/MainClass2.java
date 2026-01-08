package Has_A_Relationship;
class Alpha{
	void play() {
		System.out.println("Execute play()");
	}
}
class Beta{
	Alpha a;
	Beta(Alpha a){
		this.a=a;
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		Alpha a=new Alpha();
		Beta b=new Beta(a);
		b.a.play();
	}

}
