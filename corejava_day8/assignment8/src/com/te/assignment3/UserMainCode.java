package com.te.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class UserMainCode {

	public static List<String> obtainDesignation(Map<String, String> map, String des) {
		Iterator<String> iterator = map.keySet().iterator();
		List<String> hm = new ArrayList<String>();
		while (iterator.hasNext()) {
			String s2 = iterator.next();
			String s3 = map.get(s2);
			if (s3.equals(des)) {
				hm.add(s2);
			}
		}
		Collections.sort(hm);
		return hm;

	}

}
