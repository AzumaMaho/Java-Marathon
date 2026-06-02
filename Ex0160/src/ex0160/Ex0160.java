package ex0160;

import java.util.Scanner;

public class Ex0160 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		// 二次元配列 fortune を宣言し、占いの結果を格納する
		String[][] fortune = {
				{ "吉", "吉", "凶", "凶", "凶", "吉" },
				{ "吉", "吉", "凶", "吉", "凶", "吉" },
				{ "凶", "凶", "吉", "吉", "吉", "吉" },
				{ "凶", "吉", "吉", "吉", "凶", "凶" },
				{ "凶", "凶", "凶", "吉", "吉", "凶" },
				{ "凶", "吉", "吉", "凶", "凶", "凶" }
		};

		System.out.println("一つ目の数字 (0~5) :");
		System.out.println(num1);
		System.out.println("二つ目の数字 (0~5) :");
		System.out.println(num2);
		System.out.println("占いの結果は" + fortune[num1][num2] + "です。");

		sc.close();
	}
}
