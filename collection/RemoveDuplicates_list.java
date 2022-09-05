package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Number> list = Arrays.asList(1,2,4,1,7,2,1,7,4.8,9,4,9);
		list.stream().distinct().forEach(n->System.out.println(n));
		
		

	}

}
