package com.cg.oct12.batch3.Day7.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
public static void main(String[] args) {
	
Queue q1=new	PriorityQueue();
q1.add(10);
q1.add(20);
q1.add(30);
q1.add(40);
q1.add(50);
q1.add(60);

System.out.println(q1.remove());
System.out.println(q1);
System.out.println(q1.poll());
System.out.println(q1.peek());
System.out.println();
}
}
