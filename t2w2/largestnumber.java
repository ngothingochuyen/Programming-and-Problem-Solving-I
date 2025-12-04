package t2w2;

import java.util.Scanner;

public class largestnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// tìm số lớn nhất trong 3 sốint a = sc.nextInt();
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//
//		int max = a;
//		if (b > max)
//			max = b;
//		if (c > max)
//			max = c;
//		System.out.println(max);

		// hoán vị, đổi vị trí
		int a = 5;
		int b = 10;
		int t = a;
		a=b;
		b=t;
		System.out.println(a+" "+b);

	}

}