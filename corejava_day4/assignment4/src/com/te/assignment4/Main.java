package com.te.assignment4;

import java.util.Scanner;

public class Main {
	static String res;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter The NAME in EVEN Length");
			String name = scanner.next();
			res = UserMainCode.getMiddleChars(name);
			System.out.println(res);
		}
	}

}
