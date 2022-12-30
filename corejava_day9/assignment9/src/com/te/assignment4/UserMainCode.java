package com.te.assignment4;

import java.util.Map;

public class UserMainCode {

	public static Float costEstimator(Map<String, Float> map, String[] str) {
		Float output=0.0f;
		for (int i = 0; i < str.length; i++) {
			for (Map.Entry<String, Float> entry : map.entrySet()) {
				if (str[i].equalsIgnoreCase(entry.getKey())) {
					output+=entry.getValue();
				}
				
			}
		}
		return output;
	}

}
