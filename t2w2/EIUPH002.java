package t2w2;

import java.util.Scanner;

public class EIUPH002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 0)
			System.out.println("YES");
		else if (n % 400 == 0 || n % 100 != 0 && n % 4 == 0)
			System.out.println("YES");

		else
			System.out.println("NO");
	}

}
