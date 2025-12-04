package Week5;

import java.util.Scanner;

public class abcd {
	static Scanner sc = new Scanner(System.in); // đem ra đây, bỏ thêm static để hàm nào cũng sài được

	public static void main(String[] args) {
		long n = sc.nextLong();
		

	}
	

	// số đối xứng
	public static long palindNumm(long n) {
		long palind = 0;
		while (n != 0) {
			int temp = (int) (n % 10);
			n /= 10;
			palind = palind * 10 + temp;
		}
		return palind;
	}

	// hàm tìm số lớn nhất trong n
	public static int biggest(long n) {
		int temp = 0;
		while (n != 0) {
			int biggest = (int) (n % 10);
			if (biggest > temp)
				temp = biggest;
			n /= 10;

		}
		return temp;
	}

	// xét xem có phải số nguyên tố không
	public static boolean isPrimee(long n) {
		if (n < 2)
			return false;
		else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}

	// xét hàm tăng dần
	public static boolean increasing(long n) {
		int temp = 9;
		while (n != 0) {
			int temp2 = (int) (n % 10);
			if (temp2 > temp)
				return false;
			temp = temp2;
			n /= 10;
		}
		return true;
	}

	// xét số đối xứng
	public static void isPalind(long n) {
		if (n == palindNum(n))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	// hàm tìm số viết ngược lại của n
	public static long palindNum(long n) {
		long num = 0;
		while (n != 0) {
			int temp = (int) (n % 10);
			num = num * 10 + temp;
			n /= 10;
		}
		return num;
	}

	// hàm input array
	public static int[] inPut() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	// hàm xét sắp xếp từ lớn đến bé - giảm dần
	public static boolean tachSo(long a) {
		int temp = -1;
		while (a != 0) {
			int last = (int) (a % 10);
			if (last < temp)
				return false;
			temp = last;
			a /= 10;
		}
		return true;
	}

	// hàm đếm snt từ a-b
	public static int countPrime(long a, long b) {
		int count = 0;
		for (long i = a; i <= b; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	// hàm tách số đầu, tính số tạo ra từ số đầu và số cuối
	public static long findNum(long n) {
		int last = (int) (n % 10);
		while (n >= 10)
			n /= 10;
		return n * 10 + last;
	}

	// hàm xét xem có phải là Special number không
	public static void isSpecial(long n) {
		if (n % findNum(n) == 0 && n > 99)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	// hàm đếm số lần của số mà n có thể chia hết - primefactor
	public static int countNum(long n) {
		int i = 2;
		int count = 0;
		if (isPrime(n))
			System.out.println(n + " " + 1); // vì nếu là snt thì nó chỉ có thể chia hết cho nó, và chia hết được 1 lần
		else {
			while (n != 1) {
				count = 0;
				while (n % i == 0) {
					count++;
					n /= i;
				}
				if (count != 0) {
					System.out.println(i + " " + count);
				}
				i++;
			}
		}
		return count;
	}

	// đếm xem có bao nhiêu số nguyên tố mà n có thể chia hết
	/*
	 * tìm số mà n có thể chia hết tìm xem số n đó có phải là số nguyên tố không nếu
	 * phải thì flag = true nếu không thì flag = false nếu flag=true thì count++ LƯU
	 * Ý LẤY TRỊ TUYỆT ĐỐI CỦA N VÌ CÓ TRƯỜNG HỢP SỐ ÂM
	 */

	// hàm tìm số mà n có thể chia hết
	public static int findDivisor(long a) {
		int count = 0;
		for (int i = 2; i <= a; i++) {
			if (a % i == 0) {
				if (isPrime(i))
					count++;
			}
		}
		return count;
	}

	// hàm tìm số lớn nhất trong dãy số n
	public static int biggestDigit(long n) {
		int temp = -1;
		if (n == 0)
			temp = 0;
		while (n != 0) {
			int temp2 = (int) (n % 10);
			if (temp2 % 2 == 0 && temp2 > temp)
				temp = temp2;
			n /= 10;
		}
		return temp;
	}

	// hàm tìm số nguyên tố
	public static boolean isPrime(long n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}
}
