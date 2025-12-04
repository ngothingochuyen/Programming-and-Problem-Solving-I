package Week3;

import java.util.Scanner;

public class bai12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		S=1+2^2+...+n^n
		int n = sc.nextInt();
		int S = 0;
//		for (int i = 1; i <= n; i++)
//			S += Math.pow(i, i);
//		System.out.println(S);

		for (int i = 1; i <= n; i++) {
			int mul = 1;
			for (int j = 1; j <= i; j++)
				mul *= i;
			S += mul;
		}
		System.out.println(S);

	}

}
