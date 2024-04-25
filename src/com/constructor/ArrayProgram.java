package com.constructor;

public class ArrayProgram {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5 };
		int[] y = { 6, 7, 8, 9, 10 };
		int[] z = new int[x.length + y.length];
		int i = 0;
		for (; i < x.length; i++) {
			z[i] = x[i];
			//System.out.println(z[i]);
		}
		for (int j = 0; j < y.length; j++) {
			z[i] = y[j];

			//System.out.println(z[i]);
			i++;

		}
		for (int k = 0; k < x.length+y.length; k++) {
				System.out.print(z[k]+",");		
		}
	}

}
