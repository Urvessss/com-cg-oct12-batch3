package com.cg.oct12.batch3.Day7.collection;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack S1=new Stack();
	
	System.out.println(S1.push(10));
	S1.push(123);
	S1.push(33);
	System.out.println(S1.pop());
	S1.pop();
	S1.push(3);
	S1.push(32);
	S1.pop();
	
	System.out.println(S1.peek());
	System.out.println(S1);
	System.out.println(S1.pop());
	
}
}
