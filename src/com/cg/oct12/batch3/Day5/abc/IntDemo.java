package com.cg.oct12.batch3.Day5.abc;

interface In1 {
	public abstract void m1();

	public static void m2() {
		System.out.println("M2");
	}

	public default void m3() {
		System.out.println("M3");
	}

}

public class IntDemo {
	public static void main(String[] args) {

	}

}
