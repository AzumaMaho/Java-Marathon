package ex088A;

import java.util.Scanner;

public class Ex088A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.print("> ");
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		
		int amari = N % 500;
		
		if (amari <= A) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		sc.close();

	}

}
