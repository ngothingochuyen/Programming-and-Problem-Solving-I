package lab7;

import java.util.Scanner;

public class arrayTheMostCommonNumber3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long[] arr = input();
		long count = arr[0];
		long value = 0;
		for (int i = 0; i < arr.length; i++) {
			if (count < arr[i]) {
				value = i;
				count = arr[i];
			}
			if (count == arr[i] && value > i)
				value = i;
		}
		System.out.print(value + " " + count);
	}

	public static long[] input() {
		int n = sc.nextInt();
		long[] arr = new long[1000000];
		while (n >0) {
			int i = sc.nextInt();
			arr[i]++; // một mảng sẳn nên i chứ kh phải i -1
			n--;
		}
		return arr;
	}
}