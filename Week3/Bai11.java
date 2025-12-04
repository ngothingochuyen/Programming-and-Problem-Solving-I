package Week3;

import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// in ra bảng cửu chương của n;
//		int n = sc.nextInt();
//		int mul=1;
//		for (int i = 1;i<=10;i++) {
//			mul=n*i;
//			System.out.printf("%d x %2d = %2d\n",n,i,mul);
//		}

		// in ra cửu chương từ 1-9
		int mul = 1;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				mul = i * j;
				System.out.printf("%d x %2d = %2d\n", i, j, mul);
			}
			System.out.println("-----------");
		}
	}

}
