package Encapsulation;

public class CredentialsClass {
	public static void main(String[] args) {
		Credentials c=new Credentials();
		c.setUsername("scott");
		c.setPassword("tiger");
		System.out.println("Username : "+c.getUsername());
		System.out.println("Password : "+c.getPassword());
	}

}
