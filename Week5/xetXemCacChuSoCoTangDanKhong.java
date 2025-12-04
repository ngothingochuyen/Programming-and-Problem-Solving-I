package Week5;

import java.util.Scanner;

public class xetXemCacChuSoCoTangDanKhong {
	// xét xem các chữ số trong N có được sắp xếp tăng dần từ trái qua phải không
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if (findNumber(n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static boolean findNumber(long a) {
		int privious = 9;
		while (a != 0) {
			int temp = (int) (a % 10);
			if (temp>=privious)
				return false;
			a/=10;
			privious=temp;
		}
		return true;
	}
}

