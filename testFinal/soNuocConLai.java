
package testFinal;

import java.util.Scanner;
import java.util.Random;

public class soNuocConLai {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	/*
	 * thùng nước chứa K lít, có X lít ban đầu, thực hiện N lần châm/bớt T lít nước,
	 * nếu châm vào + X có sẵn > K thì false -> còn K lít trong thùng; nếu bớt ra >
	 * X có sẵn thì false -> còn 0 lít trong thùng, in ra số nước có trong thùng sau
	 * mỗi lần châm/bớt, nếu false thì in -1
	 */
	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = inPut(n);
		findV(arr, k, x);
		// cách 2
//		for (int i = 0; i < n; i++) {
//			int t = sc.nextInt();
//			if (t >= 0) {
//				if (t + x > k) {
//					System.out.print(-1 + " ");
//					x = k;
//				} else {
//					x += t;
//					System.out.print(x + " ");
//				}
//			} else {
//				if (t + x < 0) {
//					System.out.print(-1 + " ");
//					x = 0;
//				} else {
//					x += t;
//					System.out.print(x + " ");
//				}
//			}
//		}

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

	// tìm số lượng nước có sau mỗi lần châm/bớt
	public static void findV(int[] a, int k, int x) {
		for (int e : a) {
			x += e;
			if (x > k) {
				x = k;
				System.out.print(-1 + " ");
			} else {
				if (x < 0) {
					x = 0;
					System.out.print(-1 + " ");
				} else
					System.out.print(x + " ");
			}
		}
	}

}
