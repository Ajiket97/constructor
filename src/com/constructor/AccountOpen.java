package com.constructor;

public class AccountOpen {
	String Name;
	int Adharnumber;
	int MoblileNumber;
	boolean yes;
	public AccountOpen() {
		// TODO Auto-generated constructor stub
	}
	public AccountOpen(String nav, int adhar ){
		Name = nav;
		Adharnumber = adhar;
	}
	AccountOpen(int UID , int mob){
		MoblileNumber = mob;
		Adharnumber = UID;
	}
	public static void main(String[] args) {
		AccountOpen ac = new AccountOpen("ajit",7987595);
		System.out.printf(ac.Name,ac.Adharnumber);
	}
}
