package com.te;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the positive number");
		Integer res=UserMainCode.sumOfOddEvenPositioned(scanner.nextInt());
		System.out.println((res==1)?"Yes":"No");
	}

}
