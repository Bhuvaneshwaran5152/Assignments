package com.te2;

import java.util.Scanner;

import com.te.UserMainCode;

public class Program3 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int res = UserMainCode2.reverseNumber(scanner.nextInt());
		System.out.println(res);
	}
}