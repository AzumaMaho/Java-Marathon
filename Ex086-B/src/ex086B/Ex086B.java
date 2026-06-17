package ex086B;

import java.util.Scanner;

public class Ex086B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("> ");

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String num = String.valueOf(a) + String.valueOf(b);
		
		int n = Integer.parseInt(num);
		
		int root = (int)Math.sqrt(n);
		
		if (root * root == n) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		sc.close();

	}

}
