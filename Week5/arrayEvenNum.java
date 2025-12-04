package Week5;

import java.util.Scanner;
import java.util.Random;

public class arrayEvenNum {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	//in ra các phần tử chẵn trong dãy
	public static void main(String[] args) {
		int[] arr = inPutArray();
		outPutArray(arr);
		System.out.println();
		printEvenNum(arr);

	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}   

	// hàm tìm số chẵn trong array
	public static void outPutArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			if(a[i]%2==0)
			System.out.print(a[i] + " ");
	}
	
	//Cách 2: hàm in ra các phần tử chẵn trong dãy
	// chỉ áp dụng khi cần in ra VALUE của phần tử
	public static void printEvenNum(int [] a) {
		for(int arr:a) //  arr là số nguyên và là VALUE trong a, nếu arr là số chẵn thì in ra arr
			if (arr%2==0)
				System.out.print(arr+" ");
	}

}
