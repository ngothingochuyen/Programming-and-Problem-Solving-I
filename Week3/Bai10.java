package Week3;

import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// in ra tổng các giai thừa từ 1!+2!+....+n!
		int n = sc.nextInt();
		int sum = 0;
//		for (int i = 1; i <= n; i++) {
//			int mul = 1;
//			for (int j = 1; j <= i; j++) {
//				mul *= j;
//			}
//			sum += mul;
//
//		}
//		System.out.println(sum);

		int mul = 1;
		for (int i = 1; i <= n; i++) {
			mul *= i;
			sum += mul;
		}

		System.out.println(sum);

//		for (int i = n; i >= 1; i--) {
//			int mul = 1;
//			for (int j = 1; j <= i; j++) {
//				mul *= j;
//			}
//			sum += mul;
//
//		}
//		System.out.println(sum);

	}

}
