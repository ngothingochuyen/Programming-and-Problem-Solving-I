package Lab8;

import java.util.Scanner;

public class bai2 {
	static Scanner sc = new Scanner(System.in);
	// cho dãy N, thay tất cả các phần tử của dãy bằng trung bình cộng của dãy làm
	// tròn

	public static void main(String[] args) {
		int[] arr = inPutArray();
		for (int e : arr) {
			e = (int)average(arr);
			System.out.print(e + " ");
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

	// tìm trung bình cộng
	public static double average(int[] a) {
		int sum = 0;
		for(int e:a) {
			sum+=e;
		}
		return (double)sum/(a.length-1);
	}

	// hàm xuất dữ liệu của array
	public static void outPutArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

}
