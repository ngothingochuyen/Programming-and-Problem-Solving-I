package lab7;

import java.util.Scanner;
import java.util.Random;

public class arrayLargestEvenNumberArray2 {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// tìm phần tử dương lớn nhất trong dãy

	public static void main(String[] args) {
		int[] arr = inPutArray();
		int max = Integer.MIN_VALUE;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				if (arr[i] > max) {
					flag = true;
					max = arr[i];
				}
		}
		if (!flag)
			max = -1;
		System.out.println(max);
	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

}
