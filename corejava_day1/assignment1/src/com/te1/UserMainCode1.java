package com.te1;

import java.util.Scanner;

public class UserMainCode1 {
	static Integer sum=0;
	static Integer square=1;
	static Integer last=0;
	public static int sumOfSquareOfEvenDigits(int num) {
	while (num>0) {
		last=num%10;
		if (last%2==0) {
			square=last*last;
			sum=sum+square;
		}
		num/=10;
	}
	
		return sum;
	}
}
