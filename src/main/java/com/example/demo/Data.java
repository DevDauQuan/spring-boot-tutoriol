package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Address;
import com.example.demo.entity.Student;


@Component
public class Data {
	List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	
	public Data() {
		students = new ArrayList<>();
		students.add( new Student(0, "Nien", new Address("Vietnam", "HCM", "ThuDuc")));
		students.add( new Student(1, "Quan", new Address("Vietnam", "HCM", "ThuDuc")));
		students.add( new Student(2, "Sy", new Address("Vietnam", "HCM", "ThuDuc")));
		students.add( new Student(3, "Sy2", new Address("Vietnam", "HCM", "ThuDuc")));
	}
	
	
	
	
	
	
}
