package Week5;

import java.util.Scanner;

public class bai13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//tìm số tứ quý
		long n = sc.nextLong();
		if (occurThanFour(n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	// hàm tìm số xuất hiện từ 4 trở lên không
	public static boolean occurThanFour(long n) {
		long m = n;
		while (n != 0) {
			int t = (int) (n % 10);
			if (countDigit(t, m) >= 4)
				return true;
			n /= 10;
		}
		return false;
	}

	// hàm đếm số lần xuất hiện
	public static int countDigit(int x, long a) {
		int count = 0;
		while (a != 0) {
			int t = (int) (a % 10);
			if (t == x)
				count++;
			a /= 10;
		}
		return count;
	}
}
