package com.te2;

import java.util.Scanner;

public class UserMainCode2 {
	static Integer reverse = 0;

	public static int reverseNumber(int num) {

		while (num > 0) {
			reverse = reverse * 10 + num % 10;
			num /= 10;
		}
		return reverse;
	}

}
