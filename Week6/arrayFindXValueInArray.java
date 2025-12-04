package Week6;

import java.util.Scanner;
import java.util.Random;

public class arrayFindXValueInArray {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// tìm phần tử X, không có thì phần tử gần với x nhất trong dãy là phần nào.
	// nếu có 2 phần tử gần với x thì ưu tiên phần tử nhỏ hơn

	public static void main(String[] args) {
		int[] arr = inPutArray();
		int x = sc.nextInt();
		if (findX(arr, x))
			System.out.println("Yes");
		else
			System.out.println(findNearToX(arr, x));
		// System.out.println(findSecondMaxValue(arr));
	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	// hàm tìm X
	public static boolean findX(int[] a, int x) {
		for (int arr : a) // arr là số nguyên và là VALUE trong a []
			if (arr == x)
				return true;
		return false;
	}

	// hàm tìm gtri gần X
	public static int findNextToX(int[] a, int x) {
		int nearX = a[0];
		if (!findX(a, x)) {
			for (int arr : a)
				if (arr > nearX && arr < x)
					nearX = arr;
		}
		return nearX;
	}

	/* thêm mindis = |x-a[0]| */
	public static int findNearToX(int[] a, int x) {
		int nearX = a[0];
		int mindis = Math.abs(x - a[0]);
		if (!findX(a, x)) {
			for (int i = 1; i < a.length; i++) {
				int dis = Math.abs(x - a[i]);
				if (dis < mindis) {
					mindis = dis;
					nearX = a[i];
				} else if (dis == mindis && a[i] < nearX)
					nearX = a[i];
			}
		}
		return nearX;
	}
}
