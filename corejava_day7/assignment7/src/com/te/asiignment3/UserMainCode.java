package com.te.asiignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UserMainCode {

	public static String[] convertToStringArray(ArrayList<String> list) {
		String[] out = new String[list.size()];
		int i=0;
		Collections.sort(list);
		Iterator<String>ite=list.iterator();
		while (ite.hasNext()) {
			out[i]=ite.next();
			++i;
		}

		return out;
	}

}
