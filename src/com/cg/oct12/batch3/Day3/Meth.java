package com.cg.oct12.batch3.Day3;

public class Meth {

	static void m1()
	{
		System.out.println("M1");
	}
	
  static double pi()
	{
		return 3.14;
	}
	public static void main(String[] args) {
		System.out.println("Main");
		Meth.m1();
		
		int ans=Meth.m2();
		System.out.println(ans);
		
	   System.out.println(Meth.m2());
	   //int i=Meth.M1();
		
	}
	static int m2()
	{
		return 10;
	}
	
}
