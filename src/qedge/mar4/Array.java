package qedge.mar4;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		// store integer values into array
		int x[] = new int[6];
				x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		x[3] = 400;
		x[4] = 500;
		x[5] = 600;
		//print length of array
		System.out.println(x.length);
		//print specific value from array
		System.out.println(x[3]);
		System.out.println("===================");
		for (int each : x) {
			System.out.println(each);
		}
		System.out.println("====================");
		for (int i = 0; i < x.length; i++) {
System.out.println(x[i]);			
		}
				
	}

}
