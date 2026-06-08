package ex0320;

import java.util.Scanner;

public class Ex0320 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);

		System.out.println("input number：");
		int num = sc.nextInt();
		System.out.println();
		
		System.out.println(num +"の階乗は" + factorial(num) + "です。");
		
		sc.close();

	}
	
	// 再帰呼び出しで階乗を計算するメソッド
	public static int factorial(int num) {
		
		if (num == 1) {
			return 1;
		}
		
		return num * factorial(num - 1);
	}

}
