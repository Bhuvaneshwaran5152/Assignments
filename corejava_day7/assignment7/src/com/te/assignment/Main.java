package com.te.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		Integer size = scanner.nextInt();
		String[] arr = new String[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the string index value-" + i);
			arr[i] = scanner.next();
		}

		List<String> list =UserMainCode.matchCharacter(arr);
		for (String string : list) {
			System.out.println(string);
		}
	}
}
