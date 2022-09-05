package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AscendingOrder {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("neha", "arun","neelu","ajay");
		
		
		Collections.sort(list);
		System.out.println(list);

	}

}
