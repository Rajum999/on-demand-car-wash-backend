package Nireekshan.Customer.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
public class Customer {
	
	@Id
	private int id;
	private String username;
	private String phone;
	private String email;
	private String address;
	private String password;
	
	public Customer(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer(int id, String username, String phone, String email, String address, String password) {
		super();
		this.id = id;
		this.username = username;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", phone=" + phone + ", email=" + email + ", address="
				+ address + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
}
	 
	
	