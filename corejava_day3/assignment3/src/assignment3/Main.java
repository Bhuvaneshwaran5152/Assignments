package assignment3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The size Of Array");
		Double res = UserMainCode.averageElements(scanner.nextInt());
		System.out.println(res);
	}

}
