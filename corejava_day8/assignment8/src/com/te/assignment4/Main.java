package com.te.assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size");
		Integer size = scanner.nextInt();
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the State and Capital");
			map.put(scanner.next(), scanner.next());
		}
		System.out.println("Enter the capital to find state");
		String capital=scanner.next();
		String res=(UserMainCode.getCapital(map,capital));
		System.out.println("\n"+res.toUpperCase());
	}
}
