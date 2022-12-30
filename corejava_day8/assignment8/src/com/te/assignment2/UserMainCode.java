package com.te.assignment2;

import java.util.Iterator;
import java.util.Map;

public class UserMainCode {

	public static Integer getYear(Map<Integer, Integer> mp) {
		Integer max = 0;
		Integer b = 0;
		Integer c = 0;
		Integer d = 0;
		Iterator<Integer> it = mp.keySet().iterator();
		while (it.hasNext()) {
			b = it.next();
			c = mp.get(b);
			if (c > max) {
				max = c;
				d = b;
			}
		}
		return d;

	}

}
