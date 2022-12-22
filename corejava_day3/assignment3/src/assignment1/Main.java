package assignment1;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of Array");
	Integer res=UserMainCode.getBigDiff(scanner.nextInt());
	System.out.println(res);
}
}
