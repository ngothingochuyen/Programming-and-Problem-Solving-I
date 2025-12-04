package lab7;

import java.util.Scanner;

public class arrayPalindrome2 {
	static Scanner sc = new Scanner(System.in);

	// xét xem có phải là dãy có các số mà lật đi lật lại vẫn giống nhau không
	public static void main(String[] args) {
		int[] arr = inPutArray();
		int i = 0;
		int j = arr.length - 1;
		boolean flag = true;
		while (i < j) {
			if (arr[i] != arr[j]) {
				flag = false;
				break;
			}
			i++;
			j--;
		}
		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	// hàm xuất dữ liệu của array
	public static void outPutArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

}
