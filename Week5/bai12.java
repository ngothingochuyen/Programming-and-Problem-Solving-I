package Week5;

import java.util.Scanner;

public class bai12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * nhập a, b, c, d 
		 * đếm số lượng số nguyên trong đoạn[c,d] 
		 * chia hết cho a, không chia hết cho b
		 */
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int count=0;
		for(int i=c;i<=d;i++) {
			if(i%a==0&i%b!=0)
				count++;
		}
		System.out.println(count);

	}

}
