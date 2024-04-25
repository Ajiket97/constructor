package com.constructor;

public class ForAccount {
	RequriedDocument rd = new RequriedDocument(0);


	public void m1() {

		rd.forFDAccount("ait", 55, 88);
		System.out.println("done");
	}
	public void m2() {
		RequriedDocument nm = new RequriedDocument(0, null);
		nm.forFDAccount(null, 0, 0, null);
		System.out.println("done");
	}
	public static void main(String[] args) {
		ForAccount fa = new ForAccount();
		fa.m1();
		fa.m2();

		
	}

}
