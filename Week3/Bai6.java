package Week3;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// tìm số chính phương từ 1 đến N
		// CÁCH 1
//		for (int i = 1; i <= n; i++) {
//			if (Math.sqrt(i) % 1 == 0) // chia hết cho 1 vì không có dư
//				System.out.println(i);
//		}

//		int i = 1;
//		while (i <= n) {
//			if (Math.sqrt(i) % 1 == 0)
//				System.out.println(i);
//			i++;
//		}
		// CÁCH 2
//		int i = 1;
//		while (i*i<=n) {
//			System.out.println(i*i+" ");
//			i++;
//		}

//		for(int i=1;i<=n;i++) {
//			if (i*i>=n)
//				break;
//			System.out.println(i*i);
//		}

		// CÁCH 3
//		for (int i = 1; i <= n; i++) {
//			double sqrt = (int) Math.sqrt(i);
//			if (sqrt * sqrt == i)
//				System.out.println(i);
//		}

		int i = 1;
		while (i <= n) {
			double sqrt = (int) Math.sqrt(i);
			if (sqrt * sqrt == i)
				System.out.println(i);
			i++;
		}

	}

}
