package Week5;

import java.util.Scanner;

public class numOfNumInN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//in ra so chu so cua N
		long n = sc.nextLong();
		int count = 0;
		while (n != 0) {
			n/= 10;
			count++;
		}
		System.out.println(count);
	}
}
