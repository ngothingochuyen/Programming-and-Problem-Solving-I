package Week3;

import java.util.Scanner;

public class EIUPH008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int n= sc.nextInt();
		int k= sc.nextInt();
		int exp;
		exp=(int)Math.pow(x,n)%k;
		System.out.println(exp);

	}

}
