package Week6;

import java.util.Scanner;
import java.util.Random;

public class arrayFindMaxValueInArray {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// tìm phần tử lớn nhất trong dãy

	public static void main(String[] args) {
		int[] arr = inPutArray();
		int index = findMaxValue2(arr);
		System.out.println(arr[index]);
	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	// hàm trả về value
	public static int findMaxValue(int[] a) {
		int max = a[0];
		for (int e : a)
			if (e > max)
				max = e;
		return max;

	}

	// hàm trả về index
	public static int findMaxValue2(int[] a) {
		int max = a[0];
		int index = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] > max) {
				max = a[i];
				index = i;
			}

		return index;
	}
}
