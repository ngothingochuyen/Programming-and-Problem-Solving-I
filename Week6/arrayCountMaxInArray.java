package Week6;

import java.util.Scanner;
import java.util.Random;

public class arrayCountMaxInArray {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// tìm giá trị xuất hiện nhiều nhất trong dãy

	public static void main(String[] args) {
		int[] arr = inPutArray();
		System.out.println(countMax(arr));

	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	// hàm đếm số lần lặp lớn nhất của
	public static int countMax(int[] a) {
		int max = countX(a, a[0]);
		int value = a[0];
		for(int i=1;i<a.length;i++) {
			int count = countX(a, a[i]);
			if (count > max) {
				value = a[i];
				max = count;
			}
		}
		return value;
	}

	// hàm đếm số lần xuất hiện của x trong N
	public static int countX(int[] a, int x) {
		int count = 0;
		for (int arr : a) // arr là số nguyên và là VALUE trong a []
			if (arr == x)
				count++;
		return count;
	}

}
