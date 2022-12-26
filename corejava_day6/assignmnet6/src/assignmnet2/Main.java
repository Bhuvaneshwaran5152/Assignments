package assignmnet2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		Integer size = scanner.nextInt();
		Integer[] arr = new Integer[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element for index-" + i);
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the input number");
		Integer input = scanner.nextInt();

		UserMainCode.addAndReverse(arr, input);
	}
}
