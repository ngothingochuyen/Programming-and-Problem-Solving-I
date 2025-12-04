package Week6;

import java.util.Scanner;

import java.util.Random;

public class arrayFindOddMinValueInArray {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	static Random rd = new Random ();
	// tìm phần tử lẻ nhỏ nhất
	// CHƯA XONG 

	public static void main(String[] args) {
		int[] arr = inPutArray();
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		
		}
		System.out.println();
		System.out.println(arr[minOddNumber(arr)]);
	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			//arr[i] = sc.nextInt();
			arr[i]=rd.nextInt(100);
		return arr;
	}

	// hàm tìm số lẻ nhỏ nhất
	public static int minOddNumber(int[] a) {
		int i = 0;
		while (a[i] % 2 == 0)
			i++;
		int min = a[i];
		int index = i;
		for (; i < a.length; i++)
			if (a[i] % 2 == 1 && a[i] < min) {
				min = a[i];
				index = i;
			}
		return index;
	}

}
