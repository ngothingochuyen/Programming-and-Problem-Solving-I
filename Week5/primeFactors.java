package Week5;

import java.util.Scanner;

public class primeFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Tìm số lần xuất hiện của số nguyên tố mà khi nhân các số đó lại = n
		int n = sc.nextInt();
		if(isPrime(n)) {
			System.out.println(n+" "+1);
			
		}
		int i = 2;
		while (n != 1) {
			int count = 0;
			while (n % i == 0) { //n chia hết cho 1 số thì cộng dồn lên
				count++;
				n /= i; //chia cho số đó để tính tiếp
			}
			if (count > 0) //để không xuất ra các số mà không chia hết
				System.out.println(i + " " + count);
			i++; //nếu không chia hết cho số cũ thì cộng dồn i lên để tìm i khác tiếp
		}
	}

	public static boolean isPrime(int a) {
		if (a < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}

		}
		return true;
	}
}
