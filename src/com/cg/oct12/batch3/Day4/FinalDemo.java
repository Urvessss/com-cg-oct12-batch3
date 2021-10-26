package com.cg.oct12.batch3.Day4;

/*
 * Final keyword specifier
 * 
 * Final field/ variable - value can not be changed
 * Final method can not be overridden
 * Final class can not be extended
 */
public class FinalDemo {
	
	//final static int numberofOvers=20;
	final static int NUMBER_OF_OVERS=20;
	private static final int num = 10;
	private static int num2 = 20;

	public static void main(String[] args) {
		System.out.println(FinalDemo.num);
		System.out.println(FinalDemo.num2);
		//FinalDemo.num = 15;
		FinalDemo.num2 = 30;
		System.out.println(FinalDemo.num);
		System.out.println(FinalDemo.num2);

	}
}
