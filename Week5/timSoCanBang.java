package Week5;

import java.util.Scanner;

public class timSoCanBang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * nhập vào hai số a, b tìm số cân bằng trong đoạn [a,b], 
		 * tức là tổng các số chẵn trong a bằng tổng các số lẻ trong a
		 */
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(isEqualSum(a, b));
	}

	// xét xem hai tổng có bằng nhau không
	public static int isEqualSum(int a, int b) {
		int count =0;
		for (int i = a; i <= b; i++) {
			if (sumEven(i) == sumOdd(i))
				count++;
		}
		return count;
	}

	// tách và tính tổng các số chẵn trong a
	public static int sumEven(int a) {
		int sumEven = 0;
		while (a != 0) {
			int temp = a % 10;
			if (temp % 2 == 0) {
				sumEven += temp;
			}
			a/=10;
		}
		return sumEven;
	}

	// tách và tính tổng các số lẻ trong a
	public static int sumOdd(int a) {
		int sumOdd = 0;
		while (a != 0) {
			int temp = a % 10;
			if (temp % 2 != 0) {
				sumOdd += temp;
			}
			a/=10;
		}
		return sumOdd;
	}

}
