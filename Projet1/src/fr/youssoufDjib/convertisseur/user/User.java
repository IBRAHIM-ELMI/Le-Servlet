package fr.youssoufDjib.convertisseur.user;

public class User {
	String password;
	String email;
	
	public User(String password, String email) {
		this.email = email;
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
