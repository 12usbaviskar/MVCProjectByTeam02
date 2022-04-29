package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class User {
	
	private Integer id;
	
	private String name;
	
	private Integer phno;
	
	private String address;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhno() {
		return phno;
	}

	public void setPhno(Integer phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phno=" + phno + ", address=" + address + "]";
	}
	
	
	

}
