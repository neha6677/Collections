package com.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapKeyBasedSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("Indore", 6656778);
		hm.put("Jaipur", 893628);
		hm.put("Bhopal", 876543);
		hm.put("Kerela", 123465);
		hm.put("Jalandhar", 65672);
		
		TreeMap<String, Integer> tm = new TreeMap<>(hm);
		tm.putAll(hm);
		
		Iterator itr=tm.keySet().iterator();               
		while(itr.hasNext())    
		{    
		String key=(String)itr.next();  
		System.out.println("Roll no:  "+key+"     name:   "+hm.get(key)); 
	
	}

}
}