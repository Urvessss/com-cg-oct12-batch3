package com.cg.oct12.batch3.Day7.collection;

import java.util.ArrayList;

import com.cg.oct12.batch3.Day5.App;

public class ColDemo {
public static void main(String[] args) {
//	int[] arr=new int[5];
//	System.out.println(arr[4]);
	ArrayList myList=new ArrayList();
	System.out.println(myList);
	System.out.println(myList.size());
	App obj=new App();
	myList.add(10);
	myList.add(10.5);
	myList.add("Urvesh");
	myList.add(obj);
	
	System.out.println(myList);
	System.out.println(myList.size());
	myList.add("abc");
	System.out.println(myList);
	System.out.println(myList.size());
	myList.remove(2);
	System.out.println(myList);
	System.out.println(myList.size());
	
	ArrayList myList2=new ArrayList();
	myList2.add(22);
	//myList2.add(myList);//comment 
	myList2.addAll(myList);
	myList2.add("www");
	System.out.println(myList2);
	System.out.println(myList2.size());
	
	
	
}
}
