package ex096;

import java.util.Scanner;

public class Ex096 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.print("> ");
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		int i = sc.nextInt(); //月の数値
		int j = sc.nextInt(); //日の数値
		
		for(int month = 1; month <= i; month++) {
			
			if(i > month) {
				count++;
			} else if(j >= month) {
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();

	}

}
