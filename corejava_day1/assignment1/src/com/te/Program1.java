package com.te;

import java.util.Scanner;

public class Program1 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int res=UserMainCode.checkSum(scanner.nextInt());
		System.out.println(res);
	}
}
