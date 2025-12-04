package Week3;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// in ra các ước của N
		int n = sc.nextInt();
//		for (int i = 1; i <= n / 2; i++)
//			if (n % i == 0)
//				System.out.println(i);
//		System.out.println(n);
		
		int i = 1;
		while (i <= n / 2) {
			if (n % i == 0)
				System.out.println(i);
			i++;
		}
		System.out.println(n);

	}

}
