package insertDeleteSort;

import java.util.Scanner;
import java.util.Random;

public class arraySortArray3 {
	static Random rd = new Random();
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// nhập dãy đã sắp xếp, thêm x sao cho thứ tự vẫn giữ nguyên

	public static void main(String[] args) {
		int[] arr = inPutArray();
		outPutArray(arr);
		System.out.println();
		sortArray(arr);
		outPutArray(arr);
		int x = sc.nextInt();
		int i = 0;
		while (i < arr.length && arr[i] < x)
			i++;
		arr = insertPos(arr, x, i);
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

	// hàm sort array tăng dần
	public static void sortArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
	}

	public static int[] insertPos(int[] a, int x, int k) {
		int[] newArr = new int[a.length + 1]; // tạo một mảng mới có dộ dài lớn hơn mảng cũ 1 đơn vị
		for (int i = 0; i < k; i++) // copy lại các phần tử ở mảng cũ qua mảng mới, tới vị trí muốn chèn vào
			newArr[i] = a[i];
		newArr[k] = x; // chèn x vào vị trí muốn chèn
		for (int i = k + 1; i < newArr.length; i++)
			newArr[i] = a[i - 1]; // copy phần tử tiếp theo sau phần tử cần chèn từ dãy cũ vào dãy mới
		return newArr;
	}

}
