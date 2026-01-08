package Has_A_Relationship;

class Department{
	void teach() {
		System.out.println("Teaching Subjects");
	}
}
class Student{
	void learn() {
		System.out.println("Students is Learning");
	}
}
class College{
	Department dept=new Department();//College Has-A Department :Composition
	Student st;//College Has-A Student : Aggregation
	College(Student st){
		this.st=st;
	}
}
public class MainClass5 {
	public static void main(String[] args) {
		Student st=new Student();
		College col=new College(st);
		col.dept.teach();
		col.st.learn();
	}

}
