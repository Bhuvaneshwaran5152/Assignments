package com.te.assignment2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Input");
	Boolean result=UserMainCode.LeapYear(scanner.next());
	System.out.println(result);
	}
}
