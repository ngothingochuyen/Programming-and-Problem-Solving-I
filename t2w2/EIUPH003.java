package t2w2;

import java.util.Scanner;

public class EIUPH003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int temp = a;
		if (a > b) {
			a = b;
			b = temp;
		}
		temp = b;
		if (b > c) {
			b = c;
			c = temp;
		}
		temp = a;
		if (a > b) {
			a = b;
			b = temp;
		}

		System.out.println(b );
	}
}