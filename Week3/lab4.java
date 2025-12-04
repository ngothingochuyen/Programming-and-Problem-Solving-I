package Week3;

import java.util.Scanner;

public class lab4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int P = 1;
		for (int i = 1; i <= y; i++) {
			P *= x;
		}
		System.out.println(P);

	}
}
