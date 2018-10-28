package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise
	static boolean intArraySorted(int[] array) {
		boolean increase = true;
		for (int i = 0; i < array.length; i++) {
			if (i - 1 > -1) {
				if (array[i] >= array[i - 1]) {
					continue;
				} else {
					increase = false;
				}
			}
		}
		if (increase) {
			return true;
		} else {
			return false;
		}
	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise
	static boolean doubleArraySorted(double[] array) {
		boolean increase = true;
		for (int i = 0; i < array.length; i++) {
			if (i - 1 > -1) {
				if (array[i] >= array[i - 1]) {
					continue;
				} else {
					increase = false;
				}
			}
		}
		if (increase) {
			return true;
		} else {
			return false;
		}
	}

	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)
	static boolean charArraySorted(char[] array) {
		boolean increase = true;
		for (int i = 0; i < array.length; i++) {
			if (i - 1 > -1) {
				if (array[i] > array[i - 1]) {
					continue;
				} else {
					increase = false;
				}
			}
		}
		if (increase) {
			return true;
		} else {
			return false;
		}
	}

	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)
	static boolean stringArraySorted(String[] array) {
		boolean increase = true;
		for (int i = 0; i < array.length; i++) {
			if (i - 1 > -1) {
				if (array[i].compareTo(array[i - 1]) >= 0) {
					continue;
				} else {
					increase = false;
				}
			}
		}
		if (increase) {
			return true;
		} else {
			return false;
		}
	}

}
