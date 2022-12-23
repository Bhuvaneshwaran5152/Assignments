package com.te.str3;

public class UserMainCode {

	public static String formNewWord(String s1, Integer s2) {
	String str1=s1.substring(0,1).toUpperCase();
	String str2=s1.substring(1,s2);
	String str3=s1.substring(s1.length()-s2);
	
	
		return str1.concat(str2).concat(str3);
		
	}

}
