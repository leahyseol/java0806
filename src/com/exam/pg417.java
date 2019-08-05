package com.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class pg417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> scoreMap=new HashMap<String, Integer>();
		
		scoreMap.put("John", 98);
		scoreMap.put("James", 97);
		scoreMap.put("Leah", 95);
		scoreMap.put("Tommy", 85);

		System.out.println("HashMap factors: "+ scoreMap.size());
		
		Set<String> keys=scoreMap.keySet();
		Iterator<String> it=keys.iterator();
		
		while (it.hasNext()) {
			String name= it.next();
			int score=scoreMap.get(name);
			System.out.println(name+":" +score);
		}
	}

}
