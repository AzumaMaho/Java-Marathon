package ex0114;

import java.util.Scanner;

public class Ex0114 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] str1 = str.split(" ");

		for (int i = str1.length - 1; i >= 0; i--) {

			if (str1[i].equals("")) {
				continue;
			}
			System.out.print(str1[i] + " ");
		}

		sc.close();

	}
}
