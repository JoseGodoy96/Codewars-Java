
/*

Write a function which calculates the average of the numbers in a given array.

Note: Empty arrays should return 0.

*/

public class FindAverage {
	public static double findAverage(int[] array) {
        double total = 0;

		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		total = total / array.length;
		return total;
    }
}
