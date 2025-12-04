package Week5;

import java.util.Scanner;

public class debug {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 5;
		int b = 9;
		// đặt breakpoint -> debug -> f5 để vào nếu có hàm/f8 để chạy từng dòng tìm lỗi
		int kq = sum(a, b);
		System.out.println(a + " + " + b + " = " + kq);
	}

	public static int sum(int a, int b) {
		return a + b;
		
	}

}
