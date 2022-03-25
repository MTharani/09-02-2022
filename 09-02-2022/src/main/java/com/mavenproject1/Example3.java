package com.mavenproject1;

public class Example3 {

	public static void main(String[] args) {
		// Logical Operators
		boolean a = true;
		boolean b = false;
		boolean c = true;
		System.out.println("a&&b:"+(a&&b));   //&& operator (true = only if all condition are true)
		System.out.println("a&&c:"+(a&&c));
		System.out.println("a||b:"+(a||b));     //|| operator ( true = if atleast one condition is true)
		System.out.println("!(a||b):"+!(a||b));  //! operator ((!true means false) and (!false means true)) 
		System.out.println("!(a&&b):"+!(a&&b));


	}

}
