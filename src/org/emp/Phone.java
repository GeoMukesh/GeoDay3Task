package org.emp;

public class Phone {
	
	public void phoneInfo(String name) {
		System.out.println(name);
	}
	public void phoneInfo(int value,float ram) {
		System.out.println(value);
		System.out.println(ram);
		
	}
	
	
	public static void main(String[] args) {
		
		Phone p = new Phone();
		p.phoneInfo(1356, 124.2154f);
		
	}

}
