package org.bank;

public  class Desktop implements Hardware,Software {

	

	@Override
	public void softwareResources() {
		System.out.println("kagcasg");
	}

	@Override
	public void hardwareResources() {
		System.out.println("acugas");
		
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.softwareResources();
		d.hardwareResources();

	}

}
