package Week3;

import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// tìm số hoàn hảo
//		int n = sc.nextInt();
//		int sum = 1;
//		for (int i = 2; i <= n / 2; i++) {
//			if (n % i == 0)
//				sum += i;
//			if (sum == n)
//				System.out.println("Yes");
//			else
//				System.out.println("No");
//		}

//		int i=2;
//		while (i<=n/2) {
//			if(n%i==0)
//				sum+=i;
//		if (sum == n)
//			System.out.println("Yes");
//		else
//			System.out.println("No");
//			i++;
//		}
//			tìm số hoàn hảo từ 1-100000 là số mà các số mà số đó chia hết cộng lại bằng n

		for (int i = 6; i <= 100000; i++) {
			int sum = 1;
			for (int j = 2; j <= i / 2; j++)
				if (i % j == 0)
					sum += j;
			if (sum == i)
				System.out.println(sum);
		}
//		
//		int i = 6;
//		while(i<=100000) {
//			int sum = 1;
//			for (int j = 2; j <= i / 2; j++)
//				if (i % j == 0)
//					sum += j;
//			if (sum == i)
//				System.out.println(sum);
//			i++;
//		}

	}

}
