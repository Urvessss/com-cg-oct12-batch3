package com.cg.oct12.batch3.Day9.conc;

//class ClassOne extends Thread
class ClassOne implements Runnable
{
   int m1() {
	System.out.println("M1");
	return 10;
}
   public void run()
   {
	   System.out.println("Run");
	   this.m1();
   }

}
public class App {
public static void main(String[] args) {
	System.out.println("Main");
	//classOne obj=new ClassOne();
	for(int i=0;i<10;i++)
	{
	Thread obj=new Thread(new ClassOne());
	obj.start();
	}
	System.out.println("End");
}
}
