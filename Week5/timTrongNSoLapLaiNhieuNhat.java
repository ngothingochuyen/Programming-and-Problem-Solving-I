package Week5;

import java.util.Scanner;

public class timTrongNSoLapLaiNhieuNhat {
	// xét xem các chữ số trong N có số nào lặp lại hơn 1 lần không
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(findMaxCount(n));
	}

//hàm tìm số lần xuất hiện lớn nhất của số x trong n
	public static int findMaxCount(long n) {
		int max = 0;
		int value = -1;
		while (n != 0) {
			int temp = (int) (n % 10);
			int count = countDigit(temp, n);
			if (count > max) {
				max = count;
				value = temp;
			}
			n /= 10;
		}
		return value;
	}

//hàm đếm số lần xuất hiện của x trong n
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
