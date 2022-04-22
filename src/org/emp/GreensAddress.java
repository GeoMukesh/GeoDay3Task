package org.emp;

public class GreensAddress {
	
	public void greensOmr(String name) {
		System.out.println(name);
		
	}
	public void greensOmr(int name) {
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		GreensAddress e= new GreensAddress();
		e.greensOmr(1246);

	}

}


/*     Project   :GreensAddress
Package   :org.add
Class     :GreensTech
Methods   :greensOmr()

Description
You have to overload the method greensOmr() based on order,type,number.
*/