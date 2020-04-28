package com.sanjeev.iq;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapItr {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "sanjeev");
		hm.put(2, "sanjeev");
		hm.put(5, "smith");
		hm.put(1, "john");
		hm.put(9, "peter");
		hm.put(18, "sanjeev");
		System.out.println(hm.size());

		Set set = hm.entrySet();
		System.out.println(set);
		Iterator itr = set.iterator();
		hm.forEach((key, value) -> System.out.println("[key]:" + key + "[value]" + value));

		/*
		 * for (Map.Entry<Integer, String> entry : hm.entrySet()) {
		 * System.out.println(entry.getKey() + "----->" + entry.getValue()); }
		 */

	}
}