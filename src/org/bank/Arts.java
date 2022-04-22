package org.bank;

public class Arts extends Education {
	
	public void bSc() {
		System.out.println("Degree");
	}
	public void bEd() {
		System.out.println("Teaching");
	}
	public void bA() {
		System.out.println("History");
	}
	public void bBA() {
		System.out.println("Business");
	}
	public void ug() {
		System.out.println("CSC");
	}
	public void pg() {
		System.out.println("MCA");
	}
	public static void main(String[] args) {
		Arts a = new Arts();
		a.bA();
		a.bBA();
		a.bEd();
		a.bSc();
		a.ug();
		a.pg();
	}

}
/*     Project   :EducationInformation
     Package   :org.edu
     Class     :Education
     Methods   :ug(),pg()

     Class     :Arts
     Methods   :bSc(),bEd(),bA(),bBA(),ug(),pg()
*/