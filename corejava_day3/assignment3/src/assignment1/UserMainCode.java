package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class UserMainCode {

	public static Integer getBigDiff(int nextInt) {
		Scanner scanner = new Scanner(System.in);
		Integer[] arr = new Integer[nextInt];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Element for array index--" + i);
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		if (nextInt == 1) {
			return arr[0];
		} else {
			return arr[nextInt-1]-arr[0];

		}
	}
}
