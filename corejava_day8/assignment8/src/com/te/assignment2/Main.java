package com.te.assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size");
		Integer size = scanner.nextInt();
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the year and Admission count");
			mp.put(scanner.nextInt(), scanner.nextInt());
		}
		System.out.println(UserMainCode.getYear(mp));
	}
}
