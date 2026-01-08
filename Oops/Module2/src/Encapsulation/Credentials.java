package Encapsulation;

public class Credentials {
	private String username;
	private String password;
	public String getUsername() {
		//Authorization
		return username;
	}
	public void setUsername(String username) {
		//Verification
		this.username=username;
	}
	public String getPassword() {
		//Authentication
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}

}
