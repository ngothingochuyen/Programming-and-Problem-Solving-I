package Lab9;

import java.util.Scanner;

public class bai1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// xóa các phần tử có giá trị bằng giá trị của phần tử xuất hiện nhiều lần nhất
		int[] arr = inPutArray();
		int k = countMax(arr);
		int [] arr1=arr;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == arr1[k]) {
				arr = deletePos(arr, i);
				i--;
			}
		outPut(arr);

	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	// hàm xuất
	public static void outPut(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	// hàm đếm số lần xuất hiện của x trong N
	public static int countX(int[] a, int x) {
		int count = 0;
		for (int arr : a) // arr là số nguyên và là VALUE trong a []
			if (arr == x)
				count++;
		return count;
	}

	// hàm đếm số lần lặp lớn nhất của
	public static int countMax(int[] a) {
		int max = countX(a, a[0]);
		int index = 0;
		for (int i = 1; i < a.length; i++) {
			int count = countX(a, a[i]);
			if (count > max) {
				max = count;
				index = i;
			}

		}
		return index;
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
