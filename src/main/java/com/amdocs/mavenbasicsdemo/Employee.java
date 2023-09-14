package com.amdocs.mavenbasicsdemo;

public class Employee {
	
	public Integer id;
	public String name;
	public String salary;
	
	
	public Integer getId() {
		return this.id;
	}
	
	public String getName() {
			return this.name;
	}
	
	public String getSalary() {
		return this.salary;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setName(String name) {
			this.name = name;
	}
	
	public void setSalary(String salary) {
		this.salary = salary;
	} 
	
	public String toString() {
		return "id " + this.id + "name " + this.name + "salary " + this.salary;
	}
}
