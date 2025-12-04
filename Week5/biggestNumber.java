package Week5;

import java.util.Scanner;

public class biggestNumber {
	// tìm số lớn nhất trong số n có nhiều chữ số
	// cách thường
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

//		long n = sc.nextLong();
//		int max = -1;
//		while (n != 0) {
//			int temp = (int) n % 10;
//			if (temp > max)
//				max = temp;
//			n /= 10;
//		}
//		System.out.println(max);
	// }

	// cách viết hàm
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(findMaxDigit(n));

	}
	public static int findMaxDigit(long a) {
		int max = -1;
		while (a != 0) {
			int temp = (int) (a % 10);
			if (temp > max)
				max = temp;
			a /= 10;
		}
		return max;
	}
}
