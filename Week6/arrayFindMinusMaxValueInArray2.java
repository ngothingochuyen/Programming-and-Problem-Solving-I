package Week6;

import java.util.Scanner;
import java.util.Random;

public class arrayFindMinusMaxValueInArray2 {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// tìm phần tử âm lớn nhất trong dãy

	public static void main(String[] args) {
		int[] arr = inPutArray();
		int index = findMaxNeg(arr);
		if (index < 0)
			System.out.println("No");
		// System.out.println(findMaxValue(arr));
		else
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
		int max = -1;
		for (int e : a) {
			if (e < 0) {
				max = e;
				break;
			}
		}
		for (int z : a)
			if (z < 0 && z > max)
				max = z;
		return max;

	}

	// Cach 2 - tìm vị trí của số cần tìm

	public static int findMaxNeg(int[] a) {
		int i = 0;
		while (i < a.length && a[i] >= 0) // tìm số âm
			i++;
		if (i == a.length)
			return -1;
		int max = a[i]; // có số âm đầu thì cho nó là mẫ
		int pos = i;
		for (; i < a.length; i++)
			if (a[i] < 0 && a[i] > max) {
				max = a[i];
				pos = i;
			}
		return pos;
	}

	// cách 3
	public static int findMaxNeg2(int[] a) {
		int max = Integer.MIN_VALUE;
		int pos = -1;
		for (int i = 0; i < a.length; i++)
			if (a[i] < 0 && a[i] > max) {
				max = a[i];
				pos = i;
			}
		return pos;
	}
}
