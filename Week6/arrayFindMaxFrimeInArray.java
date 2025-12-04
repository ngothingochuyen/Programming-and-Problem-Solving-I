package Week6;

import java.util.Scanner;
import java.util.Random;

public class arrayFindMaxFrimeInArray {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// tìm phần tử là SNT lớn nhất trong dãy

	public static void main(String[] args) {
		int[] arr = inPutArray();
		int index = findMaxValue2(arr);
		System.out.println(arr[index]);
		// System.out.println(findMaxValue(arr));
	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	// hàm trả về value, tìm max
	public static int findMaxValue(int[] a) {
		int max = -1;
		for (int e : a)
			if (isPrime(e) && e > max)
				max = e;
		return max;

	}

	// hàm trả về index, tìm max
	public static int findMaxValue2(int[] a) {
		int max = 0;
		int index = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] > max && isPrime(a[i])) {
				max = a[i];
				index = i;
			}

		return index;
	}

	// Hàm tìm snt
	public static boolean isPrime(int a) {
		if (a < 2)
			return false;
		else {
			for (int i = 2; i <= Math.sqrt(a); i++)
				if (a % i == 0)
					return false;

		}
		return true;
	}

}
