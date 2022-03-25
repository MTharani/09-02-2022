package com.mavenproject1;

public class Example7 {

	public static void main(String[] args) {
		//Binary operators and Ternary operators
		int a = 3 , b= 5,  c,sum;
		boolean d =true, e = false;
		sum= a+b;                       //Arithmetic operators (sum = 8)
		sum*=2;                         // Assignment operators (sum =16)
		if (a>b)                        //Relational operators (condition is false)
		{
			System.out.println("(d&&e):"+(d&&e));    //logical operators
			
		}
		else if (sum<b)  //condition is false
		{		
          System.out.println("a&b:"+(a&b));      //bitwise operators
		}
		else //condition is true
		{
			System.out.println("the value of sum is:"+sum);
		}
		c=(a==b)?(a/b):(a*b);                      //Ternary operators condition is false so multiple the two number 
		System.out.println("the Value of c is:"+c);
	}

}
