package lab7;

import java.util.Scanner;

public class arrayPalindrome {
	static Scanner sc = new Scanner(System.in);

	// xét xem có phải là dãy có các số mà lật đi lật lại vẫn giống nhau không
	public static void main(String[] args) {
		int[] arr = inPutArray();
//		outPutArray(dayNguoc(arr));
		if (isEqual(arr,dayNguoc(arr)))
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

	// hàm gán giá trị ngược lại cho dãy 2
	public static int[] dayNguoc(int[] a) {
		int[] arr2 = new int[a.length];
		int j = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			arr2[j] = a[i];
			j++;
		}
		return arr2;
	}

	// hàm xuất dữ liệu của array
	public static void outPutArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
	//hàm xét xem hai hàm có bằng nhau không
	public static boolean isEqual(int [] a,int[]b) {
		for(int i = 0; i<a.length;i++)
			if(a[i]!=b[i])
				return false;
		return true;
	}

}
