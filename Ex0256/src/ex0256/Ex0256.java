package ex0256;

import java.util.Scanner;

public class Ex0256 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		
		String date = sc.nextLine();
		
		System.out.println("input date :");
		System.out.println(date);

		if (date.matches("\\d{4}/\\d{2}/\\d{2}")) {
		    System.out.println("指定した形式です");
		} else {
		    System.out.println("指定した形式ではありません");
		}
		
		sc.close();

	}

}
