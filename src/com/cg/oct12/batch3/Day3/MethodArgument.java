package com.cg.oct12.batch3.Day3;

public class MethodArgument {
	static int addTwoNumbers(int i,int j)
	{
		return i+j;
	}
	static int addTwoPrint(int i,int j)
	{
		return i+j;
	}
	
	public static void main(String[] args) {
	int out=	MethodArgument.addTwoNumbers(10,20);
	System.out.println(out);
	System.out.println(MethodArgument.addTwoNumbers(10,20));
	MethodArgument.addTwoPrint(10,40);
	System.out.println(MethodArgument.addTwoPrint(10,40));
	
	
	
	}

}