package com.te6;

public class UserMainCode6 {

	public static int getSumOfFibos(int num) {
		int num1 = 0;
		int num2 = 1;
		int add = 0;
		for (int i = 2; i < num; i++) {
			int sum = num1 + num2;
			add = add + sum;
			num1 = num2;
			num2 = add;
		}

		return add;
	}
}
