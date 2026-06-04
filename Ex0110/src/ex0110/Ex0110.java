package ex0110;

import java.util.Scanner;

public class Ex0110 {

	public static void main(String[] args) {
		// TODO 自動生成された
		
		 Scanner sc = new Scanner(System.in);
		
		 String str = sc.nextLine();
	     String[] words = str.split(" ");
	     
	     System.out.println("文字列1 :");
	     System.out.println("words[0]");
	     System.out.println("文字列2 :");
	     System.out.println(words[1]);
	     System.out.println();

		if (words[0].equals(words[1])) {
			System.out.println("二つの文字列は同じです");
		} else if (words[0].compareTo(words[1]) < 0) {
			System.out.print(words[0] + " ");
			System.out.print(words[1] + " ");
		} else {
			System.out.print(words[1] + " ");
			System.out.print(words[0] + " ");
		}
		
		sc.close();

	}
}
