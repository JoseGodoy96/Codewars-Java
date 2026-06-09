
/*

Define String.prototype.toAlternatingCase (or a similar function/method such as to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected language;
see the initial solution for details) such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase. For example:

*/

public class StringUtils {

	public static String toAlternativeString(String string) {
		
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < string.length(); i++) {
			
			char c = string.charAt(i);

			if (Character.isUpperCase(c)) {
				str.append(Character.toLowerCase(c));
			} else if (Character.isLowerCase(c)) {
				str.append(Character.toUpperCase(c));
			} else {
				str.append(c);
			}
		}

		return str.toString();
	}
}
