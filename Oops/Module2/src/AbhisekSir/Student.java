package AbhisekSir;
//create a class student define properties name,yop,qualification,percentage
//initialise using constructor.Define a method display details to print the details of the object, create minimum three objects and store them in array.
public class Student {
	String name,qualification;
	int yop;
	double percentage;
	public Student(String name,String qualification,int yop,double percentage) {
		this.name=name;
		this.qualification=qualification;
		this.yop=yop;
		this.percentage=percentage;
	}
	void displayDetails() {
		System.out.println(name+" "+qualification+" "+yop+" "+percentage);
	}

}
