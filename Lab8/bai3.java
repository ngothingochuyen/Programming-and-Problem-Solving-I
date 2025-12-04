package Lab8;

import java.util.Scanner;

public class bai3 {
	static Scanner sc = new Scanner(System.in);
	// cho dãy N, thay tất cả các phần tử của dãy bằng phần tử K trong dãy, nếu
	// không có K trong dãy thì lấy số gần nhất mà lớn hơn K

	public static void main(String[] args) {
		int[] arr = inPutArray();
		int K = sc.nextInt();
		if (findK(arr, K)) {
			for (int e : arr) {
				e = K;
				System.out.print(e + " ");
			}
		} else {
			for (int e : arr) {
				e = findNearK(arr, K);
				System.out.print(e + " ");
			}

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

	// hàm tìm gtri gần K
	public static int findNearK(int[] a, int K) {
			int nearX = a[0]; 
			int minDis = Integer.MAX_VALUE; //Để tìm giá trị nhỏ hơn
			if (!findK(a, K)) {
				for (int i = 1; i < a.length; i++) {
					int dis = Math.abs(K - a[i]); //khoảng cách từ giá trị thứ i đến K
					if (dis < minDis) {
						minDis = dis;
						nearX = a[i];
					} else if (dis == minDis && a[i] > nearX)
						nearX = a[i];
				}
			}
			return nearX;
		}

	// hàm tìm K
	public static boolean findK(int[] a, int K) {
		for (int arr : a) // arr là số nguyên và là VALUE trong a []
			if (arr == K)
				return true;
		return false;
	}

}
