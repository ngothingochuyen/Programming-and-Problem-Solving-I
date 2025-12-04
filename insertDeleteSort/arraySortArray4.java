package insertDeleteSort;

import java.util.Scanner;
import java.util.Random;

public class arraySortArray4 {
	static Random rd = new Random();
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được
	// xóa các phần tử xuất hiện nhiều lần trong dãy

	public static void main(String[] args) {
		int[] arr = inPutArray();
		outPutArray(arr);
		System.out.println();
		arr = xoaTrung(arr);
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

	// hàm xóa các phần tử trùng nhau
	public static int[] xoaTrung(int[] a) {
		for (int i = 0; i < a.length; i++)
			if (findX(a, a[i], i)) { // nếu trong dãy a có số nằm trong đoạn [0;i] trùng với a[i] thì xóa
				a = deletePos(a, i);
				i--;
			}
		return a;
	}

	// hàm tìm x trong đoạn [0;k]
	public static boolean findX(int[] a, int x, int k) {
		for (int i = 0; i < k; i++)
			if (a[i] == x)
				return true;
		return false;
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
