package com.cg.oct12.batch3.Day5.Mt;

public class MtDemo2 implements Runnable {

	public void myLoop() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		this.myLoop();
	}

	public static void main(String[] args) {

		Thread obj = new Thread(new MtDemo2());
		obj.start();
		Thread obj2 = new Thread(new MtDemo2());
		obj2.start();

	}
}