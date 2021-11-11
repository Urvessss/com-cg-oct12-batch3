package com.cg.oct12.batch3.Day10;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack<Integer> stack1=new Stack<>();
	stack1.add(1);
	stack1.add(2);
	stack1.add(3);
	System.out.println(stack1);
	System.out.println(stack1.capacity());
}
}
