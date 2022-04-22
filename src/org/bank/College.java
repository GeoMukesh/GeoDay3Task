package org.bank;

public class College extends University {
	public void ug() {
		System.out.println("GHI");
	}
	public void pg() {
		System.out.println("JKL");
	}
	
	public static void main(String[] args) {
		College c = new College();
			c.ug();
		    c.pg();
		
	}

}
