package com.te.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < 5 ; i++) {
			System.out.println("Enter the element for 1st arraylist index:"+i);
			list.add(scanner.nextInt());
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the element for 2nd arraylist index:"+i);
			list1.add(scanner.nextInt());
		}
		ArrayList<Integer> res = UserMainCode.sortMergedArrayList(list, list1);
		System.out.println(res);
	}
}
