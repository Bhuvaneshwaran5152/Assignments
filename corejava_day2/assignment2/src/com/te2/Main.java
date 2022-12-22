package com.te2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the positive number");
		Integer res = UserMainCode.getSumOfSquareDigits(scanner.nextInt());
		System.out.println(res);
	}
}