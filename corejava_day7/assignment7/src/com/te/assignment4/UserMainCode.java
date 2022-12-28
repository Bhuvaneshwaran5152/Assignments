package com.te.assignment4;

import java.util.ArrayList;

public class UserMainCode {
	public static ArrayList<Integer> display(ArrayList<Integer> al1, ArrayList<Integer> al2) {
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		for (int i = 0; i < al1.size(); i++) {
		if (i % 2 == 0)
		al3.add(al2.get(i));
		else
		al3.add(al1.get(i));
		}
		return al3;
		}
}
