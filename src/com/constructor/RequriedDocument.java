package com.constructor;

public class RequriedDocument {

	int RollNum;
	String adhar;

	public RequriedDocument(int roo) {
		this.RollNum = roo;
	}
	public RequriedDocument(int roo,String  mm) {
		this.RollNum = roo;
		this.adhar = mm;

	}
	

	public void forFDAccount(String name, int mobile, int adhar, String photo) {

	}

	public void forFDAccount(String name, int mobile, int adhar) {

	}

}
