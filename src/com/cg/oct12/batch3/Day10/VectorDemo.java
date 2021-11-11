package com.cg.oct12.batch3.Day10;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>(10, 10);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(30);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
	}
}
