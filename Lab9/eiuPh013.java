package Lab9;

import java.util.Scanner;

public class eiuPh013 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * n số phần tử m là queries 0 - xóa ; 1 - in ra nhập n , m nhập 0 hoặc 1 , vị
		 * trí số cần thực hiện (xóa hoặc in ra)
		 */
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = inPutArray(n);
		for (int i = 0; i < m; i++) {
			int num = sc.nextInt();
			int index = sc.nextInt();
			if (num == 0 && index < arr.length)
				arr = deletePos(arr, index);
			else {
				if (num == 1 && index < arr.length)
					System.out.println(arr[index]);
				else if (index >= arr.length) {
					System.out.println(-1);
				}
			}
		}
	}

	// viết hàm nhập vào dãy
	public static int[] inPutArray(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
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
