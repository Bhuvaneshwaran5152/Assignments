package com.te4;

public class UserMainCode4 {
static Integer last=0;
static Integer count=0;
	public static int countSeven(int num) {
	while (num>0) {
		last=num%10;
		
		if (last==7) {
			count++;
		}
		num/=10;
	}
return count;
}
}
