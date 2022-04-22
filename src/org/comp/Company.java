package org.comp;

public class Company {
	
	public void companyName(String name) {
		System.out.println(name);
	}
	
	public void companyName(int name, float salary, char c) {
		
		System.out.println(name);
		System.out.println(salary);
		System.out.println(c);
	}

	public static void main(String[] args) {
		Company c = new Company();
		c.companyName(123, 21575.35f, 'm');
		

	}

}
