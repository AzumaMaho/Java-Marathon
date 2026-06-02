package ex0200;

import java.util.Scanner;

public class Ex0200 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i = 0;
		int sum = 0;
		
		while (i <= num) {
			sum += i;
			i++;
		}
		
		System.out.println("input number :");
		System.out.println("合計値 = " + sum);
		
		sc.close();
	}

}
