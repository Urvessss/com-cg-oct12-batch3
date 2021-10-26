package com.cg.oct12.batch3.Day4;

public class Conversion {
public static void main(String[] args) {
	byte a=100;
	String b=Byte.toString(a);
	Byte c=Byte.valueOf(b);
	byte d=c.byteValue();
	Byte e=Byte.valueOf(d);
	String f=e.toString();
	byte g=Byte.parseByte(f);
	System.out.println(g);
}
}
