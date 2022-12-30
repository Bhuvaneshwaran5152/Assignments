package com.te.assignment1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UserMainCode {

	public static String getMaxKeyValue(HashMap<Integer, String> map) {
		int max = 0;
		String s2 = "";
		Iterator <Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			int a = it.next();
			if (a > max) {
				max = a;
				s2 = map.get(a);
			}
		}
		return s2;

	}

}
