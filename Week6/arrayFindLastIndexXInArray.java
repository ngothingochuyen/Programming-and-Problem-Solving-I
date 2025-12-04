package Week6;

import java.util.Scanner;
import java.util.Random;

public class arrayFindLastIndexXInArray {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// nhập vào X, tìm vị trí xuất hiện cuối cùng của x trong dãy

	public static void main(String[] args) {
		int numOfElements = sc.nextInt();
		int x = sc.nextInt();
		int[] array = inputArray(numOfElements);
		System.out.println(findLastIndex(array, x));
	}

	/**
	 * Reads an array of integers from user input.
	 *
	 * @param numOfElements the number of elements in the array
	 * @return the array of integers entered by the user
	 */
	public static int[] inputArray(int numOfElements) {
		int[] array = new int[numOfElements];
		for (int i = 0; i < array.length; i++)
			array[i] = sc.nextInt();
		return array;
	}

	/**
	 * Finds the last index of a given number in the array.
	 *
	 * @param array the array to search
	 * @param x     the number to find
	 * @return the last index of the number, or 0 if not found
	 */
	public static int findLastIndex(int[] array, int x) {
		int lastIndex = 0;
		for (int i = 0; i < array.length; i++)
			if (array[i] == x)
				lastIndex = i;
		return lastIndex;

	}

}
