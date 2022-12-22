package com.te6;

import java.util.Scanner;

public class Program7 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int res = UserMainCode6.getSumOfFibos(scanner.nextInt());
		System.out.println(res);
	}
}
