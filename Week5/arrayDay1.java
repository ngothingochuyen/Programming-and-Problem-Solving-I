package Week5;

import java.util.Scanner;
import java.util.Random;

public class arrayDay1 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
	// Nhập ngẫu nhiên giá trị của array
//		Random rd = new Random(); //chọn số ngẫu nhiên để truyền vào array
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++)
//			arr[i]=rd.nextInt(100); //phần tử thứ i trong array là 1 số ngẫu nhiên từ 1-100
//		for (int i = 0; i < arr.length; i++)
//			System.out.print(arr[i] + " ");
//	}
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được

	public static void main(String[] args) {
		int[] arr = inPutArray();
		outPutArray(arr);

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
