package Week5;

import java.util.Scanner;

public class primenumber2toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//in ra so nguyen to tu 2 den N
		int n = sc.nextInt();
		int i = 2;
		int count = 0;
		while (count < n) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}

	}

}
