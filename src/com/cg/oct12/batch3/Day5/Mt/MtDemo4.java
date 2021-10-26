package com.cg.oct12.batch3.Day5.Mt;

class Table {

	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table t;

	MyThread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(12);
	}
}

// POJO - Plain Old Java Objects 

public class MtDemo4 {

	public static void main(String args[]) {

		Table obj = new Table();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		
		t1.start();
		t2.start();
	}
}