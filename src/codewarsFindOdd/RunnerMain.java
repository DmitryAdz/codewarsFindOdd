package codewarsFindOdd;

import java.util.Arrays;

/*
 * Given an array, find the integer that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 */
public class RunnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 4, 1, 6, 4, 6, 6};
		int result = FindOdd.findIt(arr);
		
		System.out.println("\n RUN :: arr : " + Arrays.toString(arr));
		System.out.println(" result : " + result);
	}

}
