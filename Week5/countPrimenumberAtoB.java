package Week5;

import java.util.Scanner;

public class countPrimenumberAtoB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// đếm có bao nhiêu số nguyên tố trong đoạn [a;b]
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for (int i = a; i <= b; i++) {
			if (isPrime(i) && i != 1 && i != 0)
				count++;
		}
		System.out.println(count);
	}

	

	public static boolean isPrime(int a) {
		if(a<2)
			return false;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}

		}
		return true;
	}
}
