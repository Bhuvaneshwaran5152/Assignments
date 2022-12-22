package com.te1;

import java.util.ArrayList;

public class UserMainCode {
	public static Integer validateNumber(Integer num1) {
		Integer count = 0;
		Integer temp = num1;
		Integer sum = 0;


		for (int i = 1; i <= num1; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count != 2) {
				sum += i;
			}
		}

		return sum(sum);
	}


	public static Integer sum(Integer num) {

		return num;
	}
}
