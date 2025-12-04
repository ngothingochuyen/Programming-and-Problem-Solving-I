package Week5;

import java.util.Scanner;

public class specialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// tìm số hoàn hảo khi số đó chia hết cho số tạo thành từ số đầu và số cuối
		long n = sc.nextLong();
		int last = (int) (n % 10);
		int num = (int) findFirstNum(n) * 10 + last;
		if (num != 0 && n % num == 0 && n > 99)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	public static long findFirstNum(long a) {
		while (a >= 10) {
			a /= 10;
		}
		return a;
	}
}
