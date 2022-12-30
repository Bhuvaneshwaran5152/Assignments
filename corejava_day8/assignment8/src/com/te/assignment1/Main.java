package com.te.assignment1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("Enter the Size");
		Integer size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the Integer,String");
			map.put(scanner.nextInt(), scanner.next());
		}

		System.out.println(UserMainCode.getMaxKeyValue(map));
	}

}