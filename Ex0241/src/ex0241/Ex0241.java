package ex0241;

import java.util.Scanner;

public class Ex0241 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// 行数分繰り返す
		for (int i = 1; i <= num; i++) {
			// i の数だけ * を表示する
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			// 1行分の * を表示し終えたら改行する
			System.out.println();
		}
		
		sc.close();
		
	}

}
