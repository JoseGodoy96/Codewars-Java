
/*

Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]

*/

public class Sequence{

	public static int[] reverse(int n){
    
	int[] numbers = new int[n];

	for (int i = 0; i < n; i++) {
		numbers[i] = n - 1;
	}
	return numbers;
	}
}