package insertDeleteSort;

import java.util.Scanner;
import java.util.Random;

public class arraySortArray2 {
	static Random rd = new Random();
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// sắp xếp dãy theo thứ tự chẵn đứng trước(a[i]) tăng dần, số lẻ đứng sau (a[j])
	// giảm dần

	public static void main(String[] args) {
		int[] arr = inPutArray();
		outPutArray(arr);
		System.out.println();
		sortArray(arr);
		outPutArray(arr);

	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			// arr[i] = sc.nextInt();
			arr[i] = rd.nextInt(50);
		}
		return arr;
	}

	// hàm xuất dữ liệu của array
	public static void outPutArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	// hàm sort array 
	public static void sortArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[i] % 2 != 0 && a[j] % 2 == 0 
					|| a[i] % 2 == 0 && a[j] % 2 == 0 && a[i] > a[j]
					|| a[i] % 2 != 0 && a[j] % 2 != 0 && a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
	}
}
