
package testFinal;

import java.util.Scanner;
import java.util.Random;

public class tromVaoNha {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	// có N món đồ nặng V0;V1...Vn; trộm chỉ lấy được tổng khối lượng K; tìm món đồ
	// có khối lượng nặng nhất mà trộm có thể lấy
	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		///int[] arr = inPut(n);
		// outPut(arr);
	//	System.out.println(maxWeight(arr, k));
		// cách 3
		int max = -1;
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			if (t <= k && t > max)
				max = t;
		}
		System.out.println(max);

	}

	// hàm input
	public static int[] inPut(int n) {
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

	// tìm khối lượng lớn nhất
	public static int maxWeight(int[] a, int k) {
		int max = -1;
		for (int e : a) {
			if (e > max && e <= k)
				max = e;
		}
		return max;
	}

	// cách 2
	public static int maxWeight2(int[] a, int k) {
		int i = 0;
		while (i < a.length && a[i] > k)
			i++;
		if (i == a.length)
			return -1;
		else {
			int max = a[i];
			for (; i < a.length; i++)
				if (a[i] < k && a[i] > max)
					max = a[i];
			return max;
		}
	}

}
