package com.te.str5;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode {

	public static void getElemntPosition(String[] input, String str2) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			al.add(input[i]);
		}
		Collections.sort(al);
		Collections.reverse(al);
		for (int i = 0; i < al.size(); i++) {
			if (str2.equals(al.get(i))) {
				System.out.println(i+1);
			}

		}
		

	}

}
