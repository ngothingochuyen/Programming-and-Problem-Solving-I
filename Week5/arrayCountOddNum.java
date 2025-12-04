package Week5;

import java.util.Scanner;
import java.util.Random;

public class arrayCountOddNum {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// Đếm xem có bao nhiêu phần tử lẻ

	public static void main(String[] args) {
		int[] arr = inPutArray();
		outPutArray(arr);
		countOddNum(arr);//cách 2

	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	// hàm đếm coi có bao nhiêu phần tử lẻ
	public static void outPutArray(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] % 2 != 0)
				count++;
		System.out.println(count);
	}
	
	//cách 2
	public static void countOddNum(int[] a) {
		int count = 0;
		for (int arr : a) // arr là số nguyên và là VALUE trong a []
			if (arr % 2 != 0)
				count++;
		System.out.println(count);
	}

}
