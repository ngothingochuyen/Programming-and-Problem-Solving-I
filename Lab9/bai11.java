package Lab9;

import java.util.Scanner;

public class bai11 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// cho dãy, viết chương trình xóa tất cả phần tử mà giá trị của nó bằng với phần
				// tử xuất hiện nhiều nhất trong dãy
				int n = sc.nextInt();
				int[] arr = new int[n];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				int mostOccur = findMostOccur(arr);
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == mostOccur) {
						arr = deleteAtPos(arr, i);
						i--;
					}
				}
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
			}

			// tìm phần tử xuất hiện nhiều nhất
			public static int findMostOccur(int[] arr) {
				int mostOccur = arr[0];
				int maxCount = 0;
				for (int i = 0; i < arr.length; i++) {
					int count = 0;
					for (int j = 0; j < arr.length; j++) {
						if (arr[i] == arr[j]) {
							count++;
						}
					}
					if (count > maxCount) {
						maxCount = count;
						mostOccur = arr[i];
					}
				}
				return mostOccur;
			}

			// hàm xóa
			public static int[] deleteAtPos(int[] arr, int k) {
				int[] res = new int[arr.length - 1];
				for (int i = 0; i < k; i++) {
					res[i] = arr[i];
				}
				for (int i = k; i < res.length; i++) {
					res[i] = arr[i + 1];
				}
				return res;
			}
		}