package com.te.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserMainCode {

	public static ArrayList<Integer> sortMergedArrayList(List<Integer> list, List<Integer> list1) {
		ArrayList<Integer>list3=new ArrayList<Integer>();
		list.addAll(list1);
		Collections.sort(list);
		list3.add(list.get(2));
		list3.add(list.get(6));
		list3.add(list.get(8));
		return list3;
		
		
	}

	


}
