package Week3;

import java.util.Scanner;

public class lab5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for (int j = 1; j <= n; j++) {
			System.out.println();
			for (int i = 1; i <= m; i++)
				System.out.print("* ");
		}

	}
}
