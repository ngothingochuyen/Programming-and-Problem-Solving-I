package lab4;

import java.util.Scanner;

public class primeDivisor {

	public static void main(String[] args) {
		//đếm xem có bao nhiêu số nguyên tố mà n có thể chia hết
		/* tìm số mà n có thể chia hết
		 * tìm xem số n đó có phải là số nguyên tố không
		 * nếu phải thì flag = true
		 * nếu không thì flag = false
		 * nếu flag=true thì count++*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n=Math.abs(n);
		System.out.println(findDivisor(n));
	}
	public static int findDivisor(int a) {
		int count = 0;
		for (int i = 2; i <= a; i++) {
			if (a % i == 0) {
				boolean flag = true;
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}

				}
				if (flag)
					count++;
			}

		}
		return count;

	}

}
