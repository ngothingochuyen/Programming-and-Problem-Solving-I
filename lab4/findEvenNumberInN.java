package lab4;

import java.util.Scanner;

public class findEvenNumberInN {
	// tìm trong N xem có số chẵn nào không
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if (findEvenNumber(n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static boolean findEvenNumber(long a) {
		while (a != 0) {
			int temp = (int) (a % 10);
			if (temp%2==0)
				return true;
			a/=10;
		}
		return false;
	}
}

