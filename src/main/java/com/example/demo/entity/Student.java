package com.example.demo.entity;

public class Student {
	private long id;
	private String name;
	private Address address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(long id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

}
