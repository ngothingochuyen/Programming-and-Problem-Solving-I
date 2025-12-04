package lab7;

import java.util.Scanner;

public class arrayTheMostCommonNumber {
	static Scanner sc = new Scanner(System.in);

	// tìm số xuất hiện nhiều nhất trong dãy; nếu số lần xuất hiện bằng nhau, lấy
	// giá trị nhỏ nhất
	public static void main(String[] args) {
		int[] arr = inPutArray();
		sortArray(arr);
		countMax(arr);
	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	// hàm xuất dữ liệu của array
	public static void outPutArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	// hàm đếm số lần lặp lớn nhất của
	public static void countMax(int[] a) {
		int max = countX(a, a[0]);
		int value = a[0];
		for (int i = 1; i < a.length; i++) {
			int count = countX(a, a[i]);
			if (count > max) {
				max = count;
				value = a[i];
			}

		}
		System.out.println(value + " " + max);
	}

	// hàm đếm số lần xuất hiện của x trong N
	public static int countX(int[] a, int x) {
		int count = 0;
		for (int arr : a) // arr là số nguyên và là VALUE trong a []
			if (arr == x)
				count++;
		return count;
	}

	// hàm sort array giảm dần
	public static void sortArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
	}
}