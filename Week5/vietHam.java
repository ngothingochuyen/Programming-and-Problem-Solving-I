package Week5;

import java.util.Scanner;

public class vietHam {

	// ***in ra 100 lần chữ Hello

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 10; i++) //i này hàng chục
//			sayhello(i);
//	}
//
//	public static void sayhello(int chuc) {
//		for (int dv = 1; dv <= 10; dv++) // này hàng đơn vị
//			System.out.println(chuc*10+dv + ". Hello");
//	}

	// ***tính diện tích hình chữ nhật

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int d = sc.nextInt();
//		int r = sc.nextInt();
//		int dt = tinhDienTich(d,r);
//		System.out.println(dt);
//	}
//	public static int tinhDienTich(int dai,int rong) {
//		int dientich=dai*rong;
//		return dientich; 
//}
	// trả giá trị tính được về dientich để sử dụng trong hàm main
	// trong hàm, khi nào gặp return thì những dòng lệnh tiếp theo sẽ bỏ qua, là
	// lệnh ngắt hàm

	// **cách ngắn hơn, xóa bớt
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int d = sc.nextInt();
//		int r = sc.nextInt();
//		System.out.println(tinhDienTich(d, r));
//	}	
//	public static int tinhDienTich(int dai, int rong) {
//		return dai * rong;
//
//	}

	// ***kiểm tra số nguyên tố và in ra n snt đầu tiên

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int i = 2;
		while (count < n) {
			if (isPrime(i)) {
				System.out.println(i + " ");
				count++;
			}
			i++;

		}
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}
}