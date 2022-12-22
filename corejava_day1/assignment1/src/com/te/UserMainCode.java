package com.te;

public class UserMainCode {

	static Integer count = 0;
	static Integer oddsum = 0;
	static Integer evensum = 0;

	public static Integer sumOfOddEvenPositioned(Integer num) {
		Integer temp = num;
		while (num > 0) {
			num /= 10;
			count++;
		}
		System.out.println(count);
		int arr[] = new int[count - 1];
		num = temp;
		do {
			arr[count - 1] = num % 10;
			num /= 10;
			count--;
		} while (num != 0);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evensum += arr[i];
			} else {
				oddsum += arr[i];

			}
		}
		if (oddsum == evensum) {
			return 1;
		} else {
			return -1;
		}
	}
}
