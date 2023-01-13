package com.umsa.umsapp.dto;

import java.util.Objects;

public class UserDTO {
	private int id;
	private String name;
	private String username;
	private String email;
	private String phone;
	
	
	public UserDTO() {
		super();
	}
	public UserDTO(int id, String name, String username, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, phone, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone) && Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", phone="
				+ phone + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
