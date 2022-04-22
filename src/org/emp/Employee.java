package org.emp;

public class Employee {
	public void empId(int num) {
		System.out.println(num);
	}
	public void empId(String num) {
		System.out.println(num);
		
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId("123");
	}
	
	

}
