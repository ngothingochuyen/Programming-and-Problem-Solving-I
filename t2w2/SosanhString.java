package t2w2;

import java.util.Scanner;

public class SosanhString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 0:
			System.out.println("Zero");
			break;
		default:
			System.out.println("Wrong input!");
		}
	}

}
