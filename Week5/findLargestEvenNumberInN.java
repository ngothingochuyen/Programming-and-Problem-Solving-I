package Week5;

import java.util.Scanner;

public class findLargestEvenNumberInN {
	// tìm số chẵn lớn nhất trong N
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int max = -1;
		if (n==0)
			max=0;
		while (n != 0) {
			int temp = (int) (n % 10);
			if (temp % 2 == 0 && temp > max)
				max = temp;
			n /= 10;
		}
		System.out.println(max);
	}

}
