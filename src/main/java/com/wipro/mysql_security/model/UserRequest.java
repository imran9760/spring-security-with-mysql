package com.wipro.mysql_security.model;

public class UserRequest {

	private String username;
    private String password;
    private boolean enabled;
    private String role;
    
    public UserRequest() {
    	
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserRequest [username=" + username + ", password=" + password + ", enabled=" + enabled + ", role="
				+ role + "]";
	}
    
    
}
