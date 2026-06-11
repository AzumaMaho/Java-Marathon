

/*
i円を作る最小回数を配列に保存し、
1円・6のべき乗・9のべき乗を使った場合を比較しながら最小値を更新していく
*/


package ex099C;

import java.util.Scanner;

public class Ex099C {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("> ");

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		// 0円～N円までの最小回数を保存する配列
		int[] dp = new int[N + 1];

		dp[0] = 0;

		// i円を作る最小回数を求める
		for (int i = 1; i <= N; i++) {

			// 1円を使う場合
			dp[i] = dp[i - 1] + 1;

			// 6のべき乗を使う場合
			for (int money = 6; money <= i; money *= 6) {

				//比較して小さい方を採用
				dp[i] = Math.min(
						dp[i],
						dp[i - money] + 1);

			}

			// 9のべき乗を使う場合
			for (int money = 9; money <= i; money *= 9) {

				//比較して小さい方を採用
				dp[i] = Math.min(
						dp[i],
						dp[i - money] + 1);
			}

		}

		// N円を作る最小回数を出力
		System.out.println(dp[N]);

		sc.close();

	}

}
