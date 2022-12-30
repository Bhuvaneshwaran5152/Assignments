package com.te.assignment3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		Integer size = scanner.nextInt();
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter name and designation");
			map.put(scanner.next(), scanner.next());
		}
		System.out.println("Enter the Designation to obtain employees");
		String des = scanner.next();
		List<String> res = UserMainCode.obtainDesignation(map, des);
		for (String string : res) {
			System.out.println(string);
		}
	}
}
