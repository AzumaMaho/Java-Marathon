package ex079B;

import java.util.Scanner;

public class Ex079B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.print("> ");

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long[] Lucas = new long[N + 1];
		
		Lucas[0] = 2;
		if (N >= 1) {
		    Lucas[1] = 1;
		}
		
		long result = 0;
		
		for (int i = 2; i <= N; i++) {
			result = Lucas[i - 1] + Lucas[i - 2];
			Lucas[i] = result;
		}
		
		System.out.println(Lucas[N]);
		
		sc.close();

	}

}
