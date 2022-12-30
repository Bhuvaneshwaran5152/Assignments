package com.te.assignment4;

import java.util.Iterator;
import java.util.Map;

public class UserMainCode {

	public static String getCapital(Map<String, String> map, String capital) {
		String output = "";
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (entry.getValue().equals(capital)) {
				String value = entry.getValue();
				String key = entry.getKey();

				output = key + "$" + value;
			}

		}
		return output;
	}

}
