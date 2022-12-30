package com.te.assignment3;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Date");
	Integer day=UserMainCode.getLastDate(scanner.next());
	System.out.println(day);
}
}
