package com.te.assignment2;

import java.util.ArrayList;

public class UserMainCode {

	public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> list) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (i % 3 != 0 && i != 0) {
				list1.add(list.get(i));
			}
		}
		return list1;

	}

}
