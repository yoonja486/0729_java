package com.kh.hw.person.model.vo;

public class Employee {

	private int salary;
	private String dept;
	
	public Employee() {}
	public Employee(String name, int age, double height, double weight, int salaty, String dept) {
		
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
//	public String toString() {
//		
//	}
//	
}
