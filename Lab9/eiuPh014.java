package Lab9;

import java.util.Scanner;

public class eiuPh014 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * nhập vào n testcase, đếm số lần
		 */
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] arr = inPutArray(n);
			int count = 0;
			while (!isEqual(arr) && count <= 1000) {
				arr = calculateValue(arr);
				count++;
			}
			if(count<=1000)
				System.out.println(count);
			else
				System.out.println(-1);

		}
	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	// hàm tính giá trị của phần tử a[i]=|a[i]-a[i+1]
	public static int[] calculateValue(int[] a) {
		int temp = a[0];
		for (int i = 0; i < a.length-1; i++)
			a[i] = Math.abs(a[i] - a[i + 1]);
		a[a.length - 1] = Math.abs(a[a.length - 1] - temp);
		return a;
	}

	// hàm kiểm tra xem các số trong dãy có bằng nhau không
	public static boolean isEqual(int[] a) {
		for (int i = 1; i < a.length; i++)
			if (a[i] != a[0])
				return false;
		return true;
	}
}
