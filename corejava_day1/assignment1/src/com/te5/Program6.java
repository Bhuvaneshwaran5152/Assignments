package com.te5;

import java.util.Scanner;

import com.te.UserMainCode;

public class Program6 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Numbers starting and ending");
		int res=UserMainCode5.addPalindromes(scanner.nextInt(),scanner.nextInt());
		System.out.println(res);
	}
}
