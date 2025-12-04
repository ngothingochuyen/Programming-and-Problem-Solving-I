package Week5;

import java.util.Scanner;

public class timTrongNSoLapLaiHon1Lan {
	// xét xem các chữ số trong N có số nào lặp lại hơn 1 lần không
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//cách 1
//		long n = sc.nextLong();
//		if (findNumber(n))
//			System.out.println("Yes");
//		else
//			System.out.println("No");
//	}
//
//	public static boolean findNumber(long a) {
//		int privious=-1;
//		while (a != 0) {
//			int temp = (int) (a % 10);
//			if (temp==privious)
//				return true;
//			a/=10;
//			privious=temp;
//		}
//		return false;
		
		// cách 2
		long n=sc.nextLong();
		if(occurThanOne(n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
		//hàm tìm số xuất hiện hơn 1 lần
		public static boolean occurThanOne(long n) {
			long m = n;
			while (n!=0) {
				int t = (int)(n%10);
				if (countDigit(t,m)>1)
					return true;
				n/=10;
		}
			return false;
		
		}
		// hàm đếm số lần xuất hiện
		public static int countDigit(int x, long a) {
			int count=0;
			while(a!=0) {
				int t =(int)(a%10);
				if(t==x)
					count++;
				a/=10;
			}
			return count;
		}
		
	}

