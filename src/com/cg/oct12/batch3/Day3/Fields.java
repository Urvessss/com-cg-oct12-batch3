package com.cg.oct12.batch3.Day3;

public class Fields {
	// static field
	static int num1;
	// non static field
	int num2;

	public static void main(String[] args) {
		int num3;
		num3 = 3;
		System.out.println(num3);

		System.out.println(Fields.num1);

		Fields F1 = new Fields();
		System.out.println(F1.num2);

	}
}
