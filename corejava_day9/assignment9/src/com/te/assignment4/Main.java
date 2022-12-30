package com.te.assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Float>map=new HashMap<String, Float>();
		System.out.println("Enter the number of Devices");
		Integer input=scanner.nextInt();
		
		for (int i = 0; i < input; i++) {
			map.put(scanner.next(), scanner.nextFloat());
		}
		System.out.println("Enter the Device");
	Integer inp=scanner.nextInt();
	
	String[]str=new String[inp];
	
	for (int i = 0; i < str.length; i++) {
		System.out.println("Enter the Device");
		str[i]=scanner.next();
	}
	
	Float res=UserMainCode.costEstimator(map,str);
	System.out.println(res);
	}
}
