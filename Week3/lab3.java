package Week3;

import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sub = 1;
		for (int i = 1; i <= n; i++) {
			sub *= i;
		}
		System.out.println(sub);
	}
}
