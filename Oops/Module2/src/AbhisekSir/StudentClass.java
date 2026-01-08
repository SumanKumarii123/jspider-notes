package AbhisekSir;

public class StudentClass {
	public static void main(String[] args) {
		Student s1=new Student("Rahul","MCA",2025,76.5);
		Student s2=new Student("Suman","BTech",2025,81.5);
		Student s3=new Student("Ranjan","BCA",2024,70.2);
		Student s4=new Student("Ruchu","BTech",2023,78.5);
		Student x[]= {s1,s2,s3,s4};
		for(int i=0;i<=x.length-1;i++) {
		/*	x[i].displayDetails();
		}
		System.out.println("............2025..........");
		for(int i=0;i<=x.length-1;i++) {
			if(x[i].yop==2025) {
				x[i].displayDetails();
				*/
			Student s=x[i];
			if(s.yop==2025 && s.percentage>=60) {
				s.displayDetails();
			}
			System.out.println();
			if(s.yop==2025 || s.yop==2024 && s.percentage>=50 && s.qualification=="BTech" || s.qualification=="MCA") {
				s.displayDetails();
			}
		}
	}

}
