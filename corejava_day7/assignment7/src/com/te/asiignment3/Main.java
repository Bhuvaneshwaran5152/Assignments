package com.te.asiignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		Integer size = scanner.nextInt();
		ArrayList<String> list = new ArrayList<String>(size);
		for (int i = 0; i < size; i++) {
			list.add(scanner.next());
		}
		String[] arr = UserMainCode.convertToStringArray(list);
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
