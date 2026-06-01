package ex0112;

import java.util.Scanner;

public class Ex0112 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		boolean error = false;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c >= 'ｦ' && c <= 'ﾟ') {
				error = true;
				break;
			}
		}

		if (error) {
			System.out.println("半角カナが含まれます");
		} else {
			System.out.println("許可する文字列です");
		}
		sc.close();
	}

}
