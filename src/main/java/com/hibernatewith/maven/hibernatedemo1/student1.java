package com.hibernatewith.maven.hibernatedemo1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  
public class student1 {
@Id
	int id;
	String name;
	String branch;
	int year;
	public student1(String name, String branch, int batch) {
		super();
		this.name = name;
		this.branch = branch;
		this.year = batch;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", branch=" + branch + ", year=" + year + "]";
	}
	

}
