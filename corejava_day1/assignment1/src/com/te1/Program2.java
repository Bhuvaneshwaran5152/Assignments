package com.te1;

import java.util.Scanner;

import com.te.UserMainCode;

public class Program2 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int res=UserMainCode1.sumOfSquareOfEvenDigits(scanner.nextInt());
		System.out.println(res);
	}
}
