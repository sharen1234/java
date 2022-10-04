package org.array;

import java.util.*;
import java.util.Map.Entry;

public class MapCls {
public static void main(String[] args) {

	Map<Integer, Integer> m = new TreeMap<>();
	m.put(10, 100);m.put(20, 200);
	System.out.println(m);
	
//		String string = m.get(10);
//		System.out.println(string);
//
 Set<Entry<Integer, Integer>> s = m.entrySet();
//  
//	for (Entry<Integer, String> entry : entrySet) {
//		System.out.println(entry);
//	}
//	
	for (int i = 0; i < m.size(); i++) {
		Set<Integer> s1 = m.keySet();
		System.out.println(s1);
	}
	for (Entry<Integer, Integer> i : s) {
		System.out.println(i);
	}

}

	
	
	
}
