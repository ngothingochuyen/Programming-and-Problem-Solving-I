package Week3;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// tính tổng từ 1 đến N
		int n = sc.nextInt();
		int sum = 1;
		for (int i = 2; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);

//		int i = 2;
//		while (i <= n) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);

	}

}
