package Encapsulation;

public class EmployeeClass {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEid(102);
		e.setCtc(5.6);
		System.out.println(e.getEid());
		System.out.println(e.getCtc());
	}

}
