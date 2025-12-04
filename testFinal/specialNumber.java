
package testFinal;

import java.util.Scanner;
import java.util.Random;

public class specialNumber {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	// tìm số đặc biệt mà nó không phải là snt nhưng tổng các chữ số của nó tạo
	// thành snt
	public static void main(String[] args) {
		int[] arr = inPut();
		System.out.println(countSpecial(arr));

	}

	// hàm input
	public static int[] inPut() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	// hàm output
	public static void outPut(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	// hàm tìm số đặc biệt
	public static int countSpecial(int[] a) {
		int count = 0;
		for (int e : a) {
			if (!isPrime(e) && isPrime(sum(e))) {
				count++;
			}
		}
		return count;
	}

	// hàm tính tổng các số
	public static int sum(int a) {
		int sum = 0;
		while (a != 0) {
			sum += a % 10;
			a /= 10;
		}

		return sum;
	}

	// hàm xét snt
	public static boolean isPrime(int a) {
		if (a < 2)
			return false;
		else {
			for (int i = 2; i < Math.sqrt(a); i++)
				if (a % i == 0)
					return false;
		}
		return true;
	}

}
