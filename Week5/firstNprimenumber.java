package Week5;

import java.util.Scanner;

public class firstNprimenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//in ra n so nguyen to dau tien
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.print(i+" ");
		}


	}

}
