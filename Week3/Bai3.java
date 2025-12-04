package Week3;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// nhập N, in ra các số chẵn từ 2-N
		int n = sc.nextInt();
		int count = 0;
		for (int i = 2; i <= n; i += 2) {
			System.out.printf("%4d",i);
			count++;
			if (count % 10 == 0) {
				System.out.println();
			}
		}
//		int i = 2;
//		while (i <= n) {
//			System.out.printf("%4d", i);
//			count++;
//			if (count % 10 == 0)
//				System.out.println();
//			i += 2;
//		}

	}

}
