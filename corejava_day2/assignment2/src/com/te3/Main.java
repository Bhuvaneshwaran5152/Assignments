package com.te3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the three positive numbers");
		Integer res=UserMainCode.getLuckySum(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
	System.out.println(res);
	}
}
