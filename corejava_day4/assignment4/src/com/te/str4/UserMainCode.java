package com.te.str4;

import java.util.Iterator;

public class UserMainCode {

	public static String removeEvenVowels(String input) {

		StringBuffer sb1 = new StringBuffer();
		for (int i = 0; i < input.length(); i++)
			if ((i % 2) == 0)
				sb1.append(input.charAt(i));
			else if ((i % 2) != 0)
				if (input.charAt(i) != 'a' && input.charAt(i) != 'e' && input.charAt(i) != 'i' && input.charAt(i) != 'o'
						&& input.charAt(i) != 'u')
					if (input.charAt(i) != 'A' && input.charAt(i) != 'E' && input.charAt(i) != 'I'
							&& input.charAt(i) != 'O' && input.charAt(i) != 'U')
						sb1.append(input.charAt(i));
		return sb1.toString();

	}

}