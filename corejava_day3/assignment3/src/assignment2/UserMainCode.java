package assignment2;

import java.util.Scanner;

public class UserMainCode {
	static Integer res1;

	public static Integer checkLargestAmongCorner(int nextInt) {
		Scanner scanner = new Scanner(System.in);
		if (nextInt % 2 == 0 || nextInt > 20) {
			System.out.println("Enter Only Odd numbers and maximum length is 20");
			System.out.println("Your entry is =" + nextInt);
		} else {
			Integer[] arr = new Integer[nextInt];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the element");
				arr[i] = scanner.nextInt();

			}
			res1 = (arr[0] > arr[arr.length / 2] && arr[0]>arr[arr.length]) ? arr[0]
					: arr[arr.length / 2] > arr[arr.length-1] ? arr[arr.length / 2] : arr[arr.length-1];
		}
		return res1;
	}

}
