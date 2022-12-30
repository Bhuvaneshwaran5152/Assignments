package com.te.assignment3;

import java.time.LocalDate;
import java.util.Scanner;

public class UserMainCode {

	public static Integer getLastDate(String date) {
		Scanner scanner = new Scanner(System.in);
		String[] split = date.split("-");
		LocalDate date1 = LocalDate.of(Integer.parseInt(split[0]), Integer.parseInt(split[0]),
				Integer.parseInt(split[0]));
		int days = date1.lengthOfMonth();
		return days;
	}

}
