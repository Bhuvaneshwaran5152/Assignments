package assignment;

import java.util.Scanner;

public class UserMainMethod {
	static Integer power = 1;
	static Integer sum = 0;

	public static Integer getSumOfPower(Integer num) {

		Scanner scanner = new Scanner(System.in);
		Integer[] a = new Integer[num];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the element value for index--" + i);
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				sum += 1;
			} else {
				power = 1;
				for (int j = 1; j <= i; j++) {
					power = power * a[i];

				}
				sum += power;

			}
		}

		return sum;
	}

}
