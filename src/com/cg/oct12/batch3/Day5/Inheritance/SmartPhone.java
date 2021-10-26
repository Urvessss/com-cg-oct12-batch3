package com.cg.oct12.batch3.Day5.Inheritance;

public class SmartPhone extends FeaturePhone
{
	void camera() {
		System.out.println("Snap a pic");
	}
@Override
	void music() {
		System.out.println("Play music with Dolby");
	}
}
