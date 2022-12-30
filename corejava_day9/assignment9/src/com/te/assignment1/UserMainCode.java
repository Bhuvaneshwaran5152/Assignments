package com.te.assignment1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class UserMainCode {

	public static String getAge(String next) {
		Scanner scanner = new Scanner(System.in);
		LocalDate input = LocalDate.parse(next);
		System.out.println("Enter the Date");
		String check = scanner.next();

		int years = Period.between(LocalDate.parse(check), input).getYears();
		System.out.println(years);
		if (years > 18) {
			return "Eligible";
		}

		else {
			return "Not Eligible";
		}
	}

}
