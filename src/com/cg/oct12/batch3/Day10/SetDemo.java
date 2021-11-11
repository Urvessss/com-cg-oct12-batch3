package com.cg.oct12.batch3.Day10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	Set<Integer> set=new HashSet<>();
	set.add(10);
	set.add(10);
	set.add(20);
	set.add(5);
	set.add(60);
	set.add(null);
	set.add(null);
	System.out.println(set);
	
	Set<Integer> set1=new LinkedHashSet<>();
	set1.add(10);
	set1.add(10);
	set1.add(20);
	set1.add(5);
	set1.add(60);
	set1.add(null);
	set1.add(null);
	System.out.println(set1);
	
	
}
}
