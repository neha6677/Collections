package com.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ListInDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Number> list = Arrays.asList(1,2,4,1,7,2,1,7,4,9,4,9);
		Stream<Number> distinct = list.stream().distinct();
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		//in decending order
		System.out.println(list);
		
		

	}

}
