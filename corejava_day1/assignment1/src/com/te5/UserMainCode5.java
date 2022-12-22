package com.te5;

public class UserMainCode5 {
	static Integer reverse = 0;
	static Integer sum = 0;

	public static int addPalindromes(int num1,int num2) {
		
		
		for (int i = num1; i <= num2; i++) {
			reverse = reverse * 10 + i % 10;
			num1/=10;
			for (int j = 0; j < i; j++) {
				if (reverse==i) {
					sum=sum+reverse;
				return sum;
				}
			}
			
		}
	}
}
