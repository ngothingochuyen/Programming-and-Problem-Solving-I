package Week5;

import java.util.Scanner;
import java.util.Random;

public class arrayAverage {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// Tính trung bình cộng các phần tử trong dãy

	public static void main(String[] args) {
		int[] arr = inPutArray();
		System.out.printf("%.3f",outPutArray(arr));

	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	// hàm tính trung bình cộng
	public static double outPutArray(int[] a) {
		double avg = 0;
		int sum = 0;
		for (int i:a)
			sum +=i;
		avg = (double)sum / a.length;
		return avg;
	}

}
