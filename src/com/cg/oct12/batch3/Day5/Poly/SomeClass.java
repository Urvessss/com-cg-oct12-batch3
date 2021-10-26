package com.cg.oct12.batch3.Day5.Poly;

class Parent {

	public void someMethod() {
		System.out.println("some method from parent");
	}

}

class Child extends Parent {

	@Override
	public void someMethod() {
		System.out.println("some method from child");
	}
	
}

public class SomeClass {
	
}