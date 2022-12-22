package assignment;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in); 
	System.out.println("Enter the size for Array");
	Integer res=UserMainMethod.getSumOfPower(scanner.nextInt());
	System.out.println("Sum Of Power = "+res);
	}
}
