package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.demo.entity.Student;

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
		students.add( new Student(0, "Nien"));
		students.add( new Student(1, "Quan"));
		students.add( new Student(2, "Sy"));
		students.add( new Student(3, "Sy2"));
	}
	
	
	
	
	
	
}
