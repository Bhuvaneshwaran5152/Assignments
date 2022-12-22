
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
		int arr[] = new int[count];
		num = temp;

		for (int i = count-1; i >= 0; i--) {
			arr[i] = num % 10;
			num /= 10;

		}
		for (int i = 0; i < arr.length; i++) {
			if (i%2==0) {
				evensum+=arr[i];
			}
			else {
				oddsum+=arr[i];
			}
		}
		
		if (oddsum == evensum) {
			return 1;
		} else {
			return -1;
		}
	}
}
