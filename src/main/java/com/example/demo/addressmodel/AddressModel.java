package com.example.demo.addressmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AddressModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private  String phoneno;
	private String name;
	private String email;
	private String address;
	
	public String getPhoneno() {
		return phoneno;
	}
	public AddressModel(int id, String phoneno, String name, String email, String address) {
		super();
		this.id = id;
		this.phoneno = phoneno;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	
	public AddressModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AddressModel [id=" + id + ", phoneno=" + phoneno + ", name=" + name + ", email=" + email + ", address="
				+ address + "]";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
