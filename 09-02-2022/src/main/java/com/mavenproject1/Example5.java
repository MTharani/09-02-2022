package com.mavenproject1;

public class Example5 {

	public static void main(String[] args) {
		// Ternary Operator
		int a=70, b=20, c, d;        //declare variable 
		c =(a>=b) ? (a+b) : (a-b);  //Ternary operator the condition is true so add the two number
		d= (a==c) ? (a/c) : (a*b);  // the condition is false so multiple the two number
		System.out.println("The value of c is:"+c);
		System.out.println(" the value of d is:"+d);

	}

}
