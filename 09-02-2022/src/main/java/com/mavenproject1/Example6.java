package com.mavenproject1;

public class Example6 {

	public static void main(String[] args) {
		// Bitwise OPerators
		int a= 5, b= 7;
		System.out.println("a&b:"+(a&b));   //bitwise AND between 5 and 7(This operator returns 1 if and only if both the operands are 1. otherwise, it return 0)
		System.out.println("a|b:"+(a|b));   // bitwise OR between 5 and 7(this operator returns  1 if at least one of the operands is 1. otherwise, it return 0)
		System.out.println("a^b:"+(a^b));   // bitwise XOR between 5 and 7( this operator returns 1 if and only if one of the operands is 1. however, if both the operands are 0 and 1, then the result is 0)
        System.out.println("right shift:"+(a>>2));  //signed Right Shift (This operator shifts all bits towards the right by a certain number of specified bits.) 
        System.out.println("Left shift:"+(a<<2));   //signed Left Shift (This operator shifts all bits towards the Left by a certain number of specified bits.)
        System.out.println("~a:"+(~a));      // bitwise tilde ( It changes binary digits 1 to 0 and 0 to 1 and any integer N is equal to -(N+1))
	}

}
