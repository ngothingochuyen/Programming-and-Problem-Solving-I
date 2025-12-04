package Week3;

import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// tính s = 1+1+2+1+2+3+...+1+2+3+...+n
		int n = sc.nextInt();
		int sum = 0;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++)
//				sum += j;
//		}
//		System.out.println(sum);
		
		int temp = 0;
		for (int i = 1; i <= n; i++) {
			temp += i;
			sum += temp;
		}
		System.out.println(sum);

	}

}
