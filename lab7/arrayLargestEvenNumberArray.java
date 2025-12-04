package lab7;

import java.util.Scanner;
import java.util.Random;

public class arrayLargestEvenNumberArray {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// tìm phần tử dương lớn nhất trong dãy

	public static void main(String[] args) {
		int[] arr = inPutArray();
		if (checksochan(arr)) {
			int index = findMaxValue(arr);
			System.out.println(index);
		} else {
			System.out.print(-1);
		}
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
		for (int z : a)
			if (z % 2 == 0 && z > max)
				max = z;
		return max;
	}

	public static boolean checksochan(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				return true;
		}
		return false;
	}

}
