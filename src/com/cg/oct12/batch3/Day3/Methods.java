package com.cg.oct12.batch3.Day3;

public class Methods {
	
	//static -free access with class ref
	static void hello() {
		System.out.println("Hello world");
	}
//Non static -restricted access with obj ref
	void hi() {
		System.out.println("Hi..");
	}

	public static void main(String[] args) {
		System.out.println("Start");
		Methods.hello();

		Methods M1 = new Methods();
		M1.hi();
		M1.hello();
		System.out.println("End");

	}

}
