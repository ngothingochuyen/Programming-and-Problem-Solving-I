package Week5;

import java.util.Scanner;

public class tim2SoCoTongBang10 {
	// xét xem các chữ số trong N có hai số nào có tổng bằng 10 không
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		long n = sc.nextLong();
//		if (findNumber(n))
//			System.out.println("Yes");
//		else
//			System.out.println("No");
//	}
//
//	public static boolean findNumber(long a) {
//		long b = a;
//		long c = a;
//		long d = a;
//		int first = 0;
//		int temp = 0;
//		int i = 0;
//		int count = 0;
//		while (a != 0) {
//			i++; //xét vị trí cho first
//			first = (int) (a % 10); //tách số cho first
//			while (c != 0) {
//				count++; //xét vị trí cho temp
//				if (i != count) { //vị trí của số first với số chuẩn bị tách ra khác nhau thì cộng
//					temp = (int) (c % 10); //tách số cho temp
//					if (first + temp == 10)
//						return true;
//				}
//				c /= 10; //bỏ số đã xét để tách số tiếp theo
//			}
//			a = b / 10; //bỏ số đã ra để tách tiếp 
//			b = a; //gán lại để tí nữa bỏ số
//			count = 0; //cho lại về vị trí đầu
//			c = d; //cho lại dãy N
//
//		}
//		return false;

	// cách 2
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

//		long n = sc.nextLong();
//		int countDigit=countDigit(n); //cho biến này là độ dài của dãy N
//		long[] arr = new long[countDigit]; // cho mảng arr có độ dài là độ dài của N
//		boolean flag = true;
//		 //gán từng số của N dô mảng
//		for (int i = 0; i<countDigit; i++) {
//			arr[i] = n % 10;
//			n /= 10;
//		}
//		for (int i = 0; i < arr.length ; i++) { //cho i chạy từ 0 đến độ dài của mảng
//			for (int j = 0; j < arr.length ; j++) { //cho j chạy từ 0 đến độ dài của mảng
//				if (arr[i] + arr[j] == 10 && i != j) { //nếu phần tủ i+phần tử j =10 và số thứ tự của 2 phần tử khác nhau
//					flag = false; // ra kết quả và dừng
//					break;
//				}
//			}
//		}
//		if (flag)
//			System.out.println("No");
//		else
//			System.out.println("Yes");
//
//	}
//	public static int countDigit(long n) { // đếm coi dãy N có bao nhiêu số
//		int count=0;
//		while(n!=0) {
//			count++;
//			n/=10;
//		}
//		return count;

	// cách 3
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (isEqualTen(n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static boolean isEqualTen(int n) { // rã từng số trong n ra gán dô x để đem xuống hàm dưới
		while (n != 0) {
			int t = n % 10;
			n /= 10;
			if (isEqualTen(t, n))
				return true;
		}
		return false;
	}

	public static boolean isEqualTen(int x, int n) { // rã từng số trong n ra để cộng với x
		while (n != 0) {
			int temp = n % 10;
			if (temp + x == 10)
				return true;
			n /= 10;
		}
		return false;
		
	}

}
