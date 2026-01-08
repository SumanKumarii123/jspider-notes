
class Student1{
	int id=101;
}
class Student2{
	int id=101;
@Override
public int hashCode() {
	return id;
}
}
public class ToString {
	public static void main(String[] args) {
		Student1 obj1=new Student1();
		System.out.println(obj1.hashCode());
		Student2 obj2=new Student2();
		System.out.println(obj2.hashCode());
		
	}

}
