package Week6;

import java.util.Scanner;
import java.util.Random;

public class arrayFindFirstIndexOfXInArray {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// nhập vào X, tìm vị trí xuất hiện đầu tiên của x trong dãy

	public static void main(String[] args) {
		int[] arr = inPutArray();
		System.out.println(indexOfX(arr));
	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	// hàm tìm vị trí của x trong dãy
	public static int indexOfX(int[] a) {
		int x = sc.nextInt();
		for (int i = 0; i < a.length; i++)
			if (a[i] == x)
				return i;
		return -1;

	}

}
