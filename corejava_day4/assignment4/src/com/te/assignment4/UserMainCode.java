package com.te.assignment4;

import java.util.Iterator;

public class UserMainCode {

	public static String getMiddleChars(String name) {
		if (name.length()%2==0) {
			return name.substring(name.length()/2-1, name.length()/2+1);	
		}else {
			return "\n******Enter Even Valued Name******\n";
		}
		
	}

}
