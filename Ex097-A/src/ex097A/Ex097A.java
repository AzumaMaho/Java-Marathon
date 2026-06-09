package ex097A;

import java.util.Scanner;

public class Ex097A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.print("> ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if(Math.abs(a - c) <= d || Math.abs(a - b) <= d && Math.abs(b - c) <= d) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		sc.close();

	}

}
