package com.te.assignment1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Date");
		String age = UserMainCode.getAge(scanner.next());
		System.out.println(age);
	}
}
