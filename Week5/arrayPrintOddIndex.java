package Week5;

import java.util.Scanner;
import java.util.Random;

public class arrayPrintOddIndex {
	static Random rd = new Random();
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	//In ra các phần tử tại vị trí lẻ
	public static void main(String[] args) {
		int[] arr = inPutArray();
		outPutArray(arr);

	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			//arr[i] = sc.nextInt();
			arr[i]=rd.nextInt(50);
		return arr;
	}

	// hàm xét vị trí lẻ
	public static void outPutArray(int[] a) {
		int count=0;
		for (int i = 0; i < a.length; i++)
			if(i%2!=0)
			System.out.print(a[i]+" ");
	}

}
