package Week3;

import java.util.Scanner;

public class lab6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println();
			for (int j = 1; j <= m; j++) {
				if (i == 1 || i == n || j == 1 || j == m)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		}

	}

}
