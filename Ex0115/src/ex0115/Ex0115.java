package ex0115;

import java.util.Scanner;

public class Ex0115 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] str1 = str.split(" ");
		String[] Kisu = new String[(str1.length + 1) / 2];
		String[] Gusu = new String[str1.length / 2];
		
		int k = 0;
		int g = 0;

		for (int i = 0; i < str1.length; i++) {
			if (i % 2 == 0) {
				Kisu[k] = str1[i];
				k++;
			} else {
				Gusu[g] = str1[i];
				g++;
			}
		}
		
		System.out.print("奇数番目:");
		for (int i = 0; i < Kisu.length; i++) {
			System.out.print( Kisu[i] + " ");
		}
		
		System.out.println();
		
		
		System.out.print("偶数番目:");
		for (int i = 0; i < Gusu.length; i++) {
			System.out.print( Gusu[i] + " ");
		}

		sc.close();

	}

}
