package Week3;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//nhập vào tên và password, nếu sai thì nhập lại, đúng thì đăng nhập thành công
		String user, pass;
		boolean flag = true;
		do {
			if (!flag)
				System.out.println("nhap sai, moi nhap lai: ");
			user = sc.next();
			pass = sc.next();
			flag = false;
		} while (!user.equals("admin") || !pass.equals("1234")); //khi 1 trong 2 cái sai thì nhập lại, đúng hết thì đăng nhập thành côgn
		System.out.println("dang nhap thanh cong!");

	}

}
