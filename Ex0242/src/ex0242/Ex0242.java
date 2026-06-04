package ex0242;

import java.util.Scanner;

public class Ex0242 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println("input number :");
		System.out.println(num);

		for (int i = 1; i <= num; i++) {

		    for (int j = 0; j < num - i; j++) {
		        System.out.print(" ");
		    }

		    for (int j = 0; j < i * 2 - 1; j++) {
		        System.out.print("*");
		    }

		    System.out.println();
		}
		
		
		sc.close();
		
	}

}
