package Week5;

import java.util.Scanner;

public class palindromicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// xét xem có phải là 1 số mà lật đi lật lại vẫn giống nhau không
		long n = sc.nextLong();
		long temp = n;
		long palindNum = 0;
		while (n != 0) {
			int num = (int) (n % 10);
			palindNum = palindNum * 10 + num;
			n /= 10;
		}
		if (palindNum == temp)
			System.out.println("YES ");
		else
			System.out.println("NO ");

	}
}
