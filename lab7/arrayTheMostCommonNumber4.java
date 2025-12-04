package lab7;

import java.util.Scanner;

public class arrayTheMostCommonNumber4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = inPutArray();
		int maxCount = 0;
		int finalValue = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int value = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == value)
					count++;
			}
			if (maxCount < count) {
				maxCount = count;
				finalValue = value;
			} else if (maxCount == count && finalValue > value)
				finalValue = value;
		}
		System.out.println(finalValue + " " + maxCount);

	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}
}