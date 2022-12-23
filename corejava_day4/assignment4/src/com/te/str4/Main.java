package com.te.str4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = scanner.nextLine();
		System.out.println(UserMainCode.removeEvenVowels(input));
	}
}
