package com.cg.oct12.batch3.Day8.comparisons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class S {
public static void main(String[] args) {
	List<E> el=new ArrayList<E>();
	el.add(new E(101,"U",100));
	el.add(new E(103,"R",101));
	el.add(new E(104,"V",102));
	el.add(new E(102,"E",103));
	el.add(new E(106,"S",104));
	el.add(new E(105,"H",105));
	
	System.out.println(el);
	
	System.out.println("Iterator using");
	Iterator<E> ei=el.iterator();
	while(ei.hasNext())
		System.out.println(ei.next().toString());
System.out.println("..............................................");
el.forEach(new Consumer<E>() {
	public void accept(E e)
	{
		System.out.println(e.toString());
	}
});
System.out.println(">>>>>.................<<<<<<<<<");

}

}
