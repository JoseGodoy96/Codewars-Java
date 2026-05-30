/*
Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'
*/

public class Reversal {

	public static String solution(String str) {
	
		String reversal = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversal += str.charAt(i);
		}
		return reversal;
	}
}
