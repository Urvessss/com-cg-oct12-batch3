package com.cg.oct12.batch3.Day7.collection;
import java.util.LinkedList;

import java.util.*;

public class link {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add("Urvesh");
	l1.add(25);

	
    for(int num=0;num<l1.size();num++)
	System.out.println(l1);
    
    Iterator i=l1.iterator();
    while(i.hasNext())
    System.out.println(i.next());
	
}
}
