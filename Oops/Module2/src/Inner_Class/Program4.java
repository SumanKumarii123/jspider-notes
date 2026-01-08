package Inner_Class;

interface Writable{
	void write();
}
public class Program4 {
	public static void main(String[] args) {
		Writable marker=new Writable() {
			@Override
			public void write() {
				System.out.println("Writing in Marker");
			}
		};
		marker.write();
	}

}
