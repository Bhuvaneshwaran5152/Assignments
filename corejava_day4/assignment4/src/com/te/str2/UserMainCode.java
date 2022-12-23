package com.te.str2;

public class UserMainCode {

	public static String checkCharacters(String input) {
		
		if (input.substring(0, 1).equals(input.substring(input.length() - 1))) {
			System.out.println(input.substring(input.length()));
			return "Valid";
		} else {
			return "Invalid";
		}

	}

}
