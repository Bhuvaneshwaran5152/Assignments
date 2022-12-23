package com.te.str5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int fr = sc.nextInt();
		String a[] = new String[fr];
		for (int i = 0; i < fr; i++) {
			System.out.println("Enter the String");
			a[i] = sc.next();
		}
		System.out.println("Enter the string to find position");
		String ba = sc.next();
		UserMainCode.getElemntPosition(a, ba);
	}
}
