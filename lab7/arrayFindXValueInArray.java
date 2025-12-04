package lab7;

import java.util.Scanner;
import java.util.Random;

public class arrayFindXValueInArray {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// xét xem dãy có chẵn hết không
	public static void main(String[] args) {
		int[] arr = inPutArray();
		if (isEven(arr))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	// hàm tìm X
	public static boolean isEven(int[] a) {
		for (int arr : a) // arr là số nguyên và là VALUE trong a []
			if (arr %2!=0)
				return false;
		return true;
	}

}
