package com.code;

import com.functionalInterface.FunctionalInterfaceTest;
import java.util.Objects;

public class Student {

	private int id;
	private String fname;
	private String lname;
	private double marks;
	
	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fname, id, lname, marks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(fname, other.fname) && id == other.id && Objects.equals(lname, other.lname)
				&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks);
	}
	
	
}
