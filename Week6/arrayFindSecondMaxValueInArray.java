package Week6;

import java.util.Scanner;
import java.util.Random;

public class arrayFindSecondMaxValueInArray {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// tìm phần tử lớn thứ 2 trong dãy

	public static void main(String[] args) {
		int[] arr = inPutArray();
		// int index = findSecondMaxValue2(arr);
		// System.out.println(arr[index]);
		// System.out.println(findSecondMaxValue(arr));
		System.out.println(findSecMax(arr));
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
		int max = a[0];
		for (int e : a)
			if (e > max)
				max = e;
		return max;

	}

	// hàm trả về value tìm second max
	public static int findSecondMaxValue(int[] a) {
		int max = a[0];
		for (int e : a)
			if (e > max && e < findMaxValue(a))
				max = e;
		return max;

	}

	// hàm trả về index, tìm max
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

	// hàm trả về index, tìm second max
	public static int findSecondMaxValue2(int[] a) {
		int max = a[0];
		int index = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] > max && a[i] < a[findMaxValue2(a)]) {
				max = a[i];
				index = i;
			}

		return index;
	}

	/*
	 * cách khác xét max1 max2 xét các phần tử trong dãy, nếu ptu đang xét lớn hơn
	 * max1 max2=max1 max1=ptu đang xét ngược lại, nếu phần tử đang xét lớn hơn max2
	 * và khác với max 1 max2 = ptu đang xét ra khỏi vòng lặp, in ra max2
	 */
	public static int findSecMax(int[] a) {
		int max1 = a[0];
		int max2 = a[1];
		for (int e:a) {
			if (e > max1) {
				max2 = max1;
				max1 = e;
			} else {
				if (e> max2 && e!= max1)
					max2 = e;
			}
		}
		return max2;
	}
}
