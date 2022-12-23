package com.te.str3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = scanner.nextLine();
		System.out.println("Enter the number");
		Integer s2 = scanner.nextInt();
		String res = UserMainCode.formNewWord(s1, s2);
		System.out.println(res);
	}
}
