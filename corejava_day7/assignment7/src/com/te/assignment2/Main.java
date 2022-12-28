package com.te.assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the size");
		Integer num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the Input");
			list.add(scanner.nextInt());
		}
	ArrayList<Integer>res= UserMainCode.removeMultiplesOfThree(list);
		for (Integer integer : res) {
			System.out.println(integer);
		}
	}
}
