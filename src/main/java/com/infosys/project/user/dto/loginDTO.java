package com.infosys.project.user.dto;

public class loginDTO {
	String email;
	String password;
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	public loginDTO() {
		super();
	}

	@Override
	public String toString() {
		return "LoginDTO [emailId=" + email + ", password=" + password + "]";
	}
}
