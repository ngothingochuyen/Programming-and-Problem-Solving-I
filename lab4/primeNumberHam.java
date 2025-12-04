package lab4;

import java.util.Scanner;

public class primeNumberHam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (primeNumber(n))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	public static boolean primeNumber(int a) {
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}

}
