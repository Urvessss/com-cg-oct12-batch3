package com.cg.oct12.batch3.Day7.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

//It is not order
//Does not allow duplicates
//Has initial capacity of 16

public class SetDemo {
public static void main(String[] args) {
	ArrayList A1=new ArrayList();
	HashSet H1=new HashSet();
	
	
		A1.add(101);
		H1.add(201);
		A1.add(101);
		H1.add(201);
		H1.add(null);
		H1.add(null);
		
		System.out.println(A1);
		System.out.println(H1);
	}
}
