package assignment2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		Integer res = UserMainCode.checkLargestAmongCorner(scanner.nextInt());
		System.out.println(res);
	}
}
