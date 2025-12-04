package t2w2;

import java.util.Scanner;

public class EIUPH005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String gender = sc.next();
		if (age <= 5)
			System.out.println("Be");
		else {
			if (age <= 20)
				System.out.println("Em");
			else {
				if (age <= 35) {
					if (gender.compareTo("Nam") == 0)
						System.out.println("Anh");
					else
						System.out.println("Chi");
				} else {
					if (age <= 60) {
						if (gender.compareTo("Nam") == 0)
							System.out.println("Chu");
						else
							System.out.println("Co");
					} else {
						if (gender.compareTo("Nam") == 0)
							System.out.println("Ong");
						else
							System.out.println("Ba");
					}
				}
			}
		}
	}
}