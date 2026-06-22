package ex080B;

import java.util.Scanner;

public class Ex080B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.print("> ");

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String num = String.valueOf(N);
	
		int result = 0;
		
		for (int i = 0; i < num.length(); i++) {
			result += num.charAt(i) - '0';
		}
		
		if (N % result == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		sc.close();

	}

}
