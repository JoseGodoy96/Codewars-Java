
/*

You will be given a list of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars) and then return the first value.

The returned value must be a string, and have "***" between each of its letters.

You should not remove or add elements from/to the array.

*/

public class SortAndStar {

	public static String twoSort(String s) {
	
	StringBuilder str = new StringBuilder();

	for (int i = 0; i < s.length(); i++) {

		char c = s.charAt(i);

		if (c != '*') {
			str.append(c);
		}
	}
		
		return s;
	}
}
