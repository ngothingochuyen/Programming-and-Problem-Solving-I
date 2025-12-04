package insertDeleteSort;

import java.util.Scanner;
import java.util.Random;

public class arrayDeleteXFromArray {
	static Random rd = new Random();
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// xóa phần tử thứ k khỏi dãy

	public static void main(String[] args) {
		int[] arr = inPutArray();
		outPutArray(arr);
		System.out.println();
		int k = sc.nextInt();
		arr = deletePos(arr, k);
		outPutArray(arr);

	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			// arr[i] = sc.nextInt();
			arr[i] = rd.nextInt(50);
		}
		return arr;
	}

	// hàm xuất dữ liệu của array
	public static void outPutArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	// hàm xóa 1 phần tử ở vị trí k trong dãy
	public static int[] deletePos(int[] a, int k) {
		int[] newArr = new int[a.length - 1];
		for (int i = 0; i < k; i++) // copy lại các phần tử từ đầu đến vị trí cần xóa
			newArr[i] = a[i];
		for (int i = k; i < newArr.length; i++) // bỏ qua vị trí cần xóa, không copy, copy tiếp các phần tử cần xóa +1
			newArr[i] = a[i + 1];
		return newArr;
	}

}
