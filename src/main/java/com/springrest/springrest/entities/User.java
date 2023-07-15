package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	private long id;
	private String username;
	private String password;
	private String locationname;
	private String role;
	private String rolegroup;
	private String locationcode;
	private int maxdevices;
	private int currentdevices;
	private String email;
	private String phonenumber;
	
	public User() {}

	User(long id, String username, String password, String locationname, String role, String rolegroup,
			int maxdevices, int currentdevices) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.locationname = locationname;
		this.role = role;
		this.rolegroup = rolegroup;
		this.maxdevices = maxdevices;
		this.currentdevices = currentdevices;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getLocationname() {
		return locationname;
	}

	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRolegroup() {
		return rolegroup;
	}

	public void setRolegroup(String rolegroup) {
		this.rolegroup = rolegroup;
	}

	public int getMaxdevices() {
		return maxdevices;
	}

	public void setMaxdevices(int maxdevices) {
		this.maxdevices = maxdevices;
	}

	public int getCurrentdevices() {
		return currentdevices;
	}

	public void setCurrentdevices(int currentdevices) {
		this.currentdevices = currentdevices;
	}

	public String getLocationcode() {
		return locationcode;
	}

	public void setLocationcode(String locationcode) {
		this.locationcode = locationcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", locationname=" + locationname
				+ ", role=" + role + ", rolegroup=" + rolegroup + ", locationcode=" + locationcode + ", maxdevices="
				+ maxdevices + ", currentdevices=" + currentdevices + ", email=" + email + ", phonenumber="
				+ phonenumber + "]";
	}
	
	


	
	
	
}
