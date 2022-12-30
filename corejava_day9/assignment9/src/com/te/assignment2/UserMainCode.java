package com.te.assignment2;

import java.util.Scanner;

public class UserMainCode {

	public static Boolean LeapYear(String input) {
		Scanner scanner = new Scanner(System.in);
		String[] split = input.split("-");
		Integer year = Integer.parseInt(split[2]);
		if (year % 4 == 0) {
			return true;
		}
		return false;
	}

}
