package ex0235;

import java.util.Scanner;

public class Ex0235 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		
		// 
		int num = Integer.parseInt(sc.nextLine()); 
		
		// 2進数の文字列に変換
		String Binary = Integer.toBinaryString(num);
		// 16進数の文字列に変換
		String Hex = Integer.toHexString(num).toUpperCase();
		
		// 2進数を8桁表示にし足りない部分は0に置き換える
		Binary = String.format("%8s", Binary).replace(' ', '0');
		
		System.out.println("0~225の範囲の10進数 :");
		System.out.println(num);
		System.out.println();
		System.out.printf("2進数の変換結果 :" + Binary);
		System.out.println();
		System.out.println("16進数の変換結果 :" + Hex);
		
		sc.close();
		
		
	}

}
 