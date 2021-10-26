package com.cg.oct12.batch3.Day4;

//access static member in static context - class reference 
//access static member in non-static context - class reference 
//access non-static member in static context - object reference 
//access non-static member in non-static context - this reference 

public class ThisDemo {

	static int num1;
	int num2;

	static void staticMethod() {
		System.out.println("static="+ThisDemo.num1);
		ThisDemo obj = new ThisDemo();
		System.out.println("Static="+obj.num2);
	}

	void nonStaticMethod() {
		System.out.println("NON="+ThisDemo.num1);
		System.out.println("NON="+this.num2);
	}

	public static void main(String[] args) {

		ThisDemo.staticMethod();
		ThisDemo obj = new ThisDemo();
		obj.num2=10;
		obj.nonStaticMethod();

	}

}
