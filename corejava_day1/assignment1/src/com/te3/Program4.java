package com.te3;

import java.util.Scanner;

public class Program4 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int res = UserMainCode3.getUnique(scanner.nextInt());
		System.out.println(res);
	}
}
