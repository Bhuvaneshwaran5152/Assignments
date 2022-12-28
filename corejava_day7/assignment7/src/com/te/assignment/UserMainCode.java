package com.te.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMainCode {

	public static List<String> matchCharacter(String[] arr) {
		Scanner scanner = new Scanner(System.in);
		
		List<String> list1 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {

			if ((arr[i].charAt(0) == 'a' || arr[i].charAt(0) == 'e' || arr[i].charAt(0) == 'i'
					|| arr[i].charAt(0) == 'o' || arr[i].charAt(0) == 'u')
					&& (arr[i].charAt(arr.length - 1) == 'a' || arr[i].charAt(arr.length - 1) == 'e'
							|| arr[i].charAt(arr.length - 1) == 'i' || arr[i].charAt(arr.length - 1) == 'o'
							|| arr[i].charAt(arr.length - 1) == 'u')) {
				list1.add(arr[i]);
			}
		}
		return list1;
	}

}
