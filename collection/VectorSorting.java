package com.collection;

import java.util.Collections;
import java.util.Vector;

public class VectorSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v = new Vector<>();
		v.add("nisha");
		v.add("priya");
		v.add("ranil");
		v.add("anaya");
		v.add("tisha");
		
		System.out.println(v);
		Collections.sort(v);
		
		System.out.println(v);

	}

}
