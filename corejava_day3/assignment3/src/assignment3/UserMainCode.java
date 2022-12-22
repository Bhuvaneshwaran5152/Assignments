package assignment3;

import java.util.Scanner;

public class UserMainCode {
	static Integer sum = 0;
	static Integer count = 0;
	static Double prime_count = 0.0;

	public static Double averageElements(Integer nextInt) {
		if (nextInt == 0 || nextInt > 20) {
			System.out.println("Minimum array size required 1 and size should not exceed 19");
		} else {
			Integer arr[] = new Integer[nextInt];
			Scanner scanner = new Scanner(System.in);
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the element for index--" + i);
				arr[i] = scanner.nextInt();
			}
			for (int i = 2; i < arr.length; i++) {
				count = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						count++;
					}

				}
				if (count == 2) {
					System.out.println("elements in prime Indexes--" + arr[i]);
					sum += arr[i];
					prime_count++;
				}

			}
			System.out.println("Sum of prime index--" + sum);
			System.out.println("Prime_count--" + prime_count);

		}
		return sum / prime_count;
	}

}
