package Lab8;

import java.util.Scanner;

public class bai4 {
	static Scanner sc = new Scanner(System.in);
	// cho dãy N, nếu phần tử đó là số nguyên tố thì giữ nguyên, nếu nó không phải
	// là số nguyên tố thì thay bằng số nguyên tố gần và lớn hơn

	public static void main(String[] args) {
		int[] arr = inPutArray();
		for (int i =0;i<arr.length;i++) {
				while (!isPrime(arr[i]))
					arr[i]++;
				System.out.print(arr[i] + " ");
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

	// hàm tìm số nguyên tố
	public static boolean isPrime(int a) {
		if (a < 2)
			return false;
		else
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}

		}
		return true;
	}

}
