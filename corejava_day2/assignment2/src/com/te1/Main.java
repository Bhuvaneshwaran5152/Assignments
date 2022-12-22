package com.te1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the positive number");
			Integer res=UserMainCode.validateNumber(scanner.nextInt());
			System.out.println(res);
			
		}
}
