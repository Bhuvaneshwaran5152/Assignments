package com.te.str2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String");
		String input = scanner.nextLine();
		String res = UserMainCode.checkCharacters(input);
		System.out.println(res);
	}
}
