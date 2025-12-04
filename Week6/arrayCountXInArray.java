package Week6;

import java.util.Scanner;
import java.util.Random;

public class arrayCountXInArray {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// nhập vào X, kiểm xem có X trong dãy không

	public static void main(String[] args) {
		int[] arr = inPutArray();
		System.out.println(countX(arr));

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

	// hàm đếm X
	public static int countX(int[] a) {
		int count=0;
		int x = sc.nextInt();
		for (int arr : a) // arr là số nguyên và là VALUE trong a []
			if (arr == x)
				count++;
		return count;
	}

}
