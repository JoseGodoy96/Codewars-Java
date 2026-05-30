/*
Create a function that accepts a sequence and a non-negative integer n, and returns a sequence of the first n elements from it.

If the sequence has fewer than n elements, return all of them.

[0, 1, 2, 3, 5, 8, 13], n = 3  =>  [0, 1, 2]
[0, 1, 2, 3, 5, 8, 13], n = 0  =>  []
					[], n = 3  =>  []
*/

public class ZywOo {
	public static int[] take(int[] arr, int n) {

    int size = Math.min(n, arr.length);
    int[] numbers = new int[size];

	for (int i = 0; i < size; i++) {
		numbers[i] = arr[i];
	}

	return numbers;
	}
}