package ex071B;

import java.util.Scanner;

public class Ex071B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.print("> ");

		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		
		boolean[] exist = new boolean[26];
		

		for (int i = 0; i < S.length(); i++) {
		    char c = S.charAt(i);

		    int j = c - 'a';

		    exist[j] = true;
		}
		
		for (int i = 0; i < 26; i++) {
			if (!exist[i]) {
				System.out.println((char)('a' + i));
				sc.close();
				return;
			} 
		}
		
		System.out.println("None");
		
		sc.close();

	}

}
