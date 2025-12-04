package Week5;

import java.util.Scanner;
import java.util.Random;

public class arrayPrintPrimeNum {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// in ra các phần tử là SNT trong dãy

	public static void main(String[] args) {
		int[] arr = inPutArray();
		outPutArray(arr);

	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	// hàm tìm SNT
	public static void outPutArray(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++)
			if (isPrime(a[i]))
				count++;
		System.out.print(count);
	}

	// Hàm tìm snt
	public static boolean isPrime(int a) {
		if (a < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

}
