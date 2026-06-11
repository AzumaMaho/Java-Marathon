package ex098A;

import java.util.Scanner;

public class Ex098A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.print("> ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		
		int max = add;
		
		if(sub > max) {
			max = sub;
		}
		
		if(mul > max) {
			max = mul;
		}
		
		System.out.println(max);
		
		sc.close();

	}

}
