package assignmnet1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserMainCode {

	public static void removeTens(int nextIn) {
		Scanner scanner = new Scanner(System.in);
		Integer[] arrays = new Integer[nextIn];
		for (int i = 0; i < arrays.length; i++) {
			System.out.println("Enter the entry for index-" + i);

			arrays[i] = scanner.nextInt();
		}
		Integer count = 0;
		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] == 10) {
				arrays[i] = 0;
			}

		}
		Arrays.sort(arrays);

		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] != 10 && arrays[i] != 0) {
				System.out.println(arrays[i]);
			}

		}
	}

}
