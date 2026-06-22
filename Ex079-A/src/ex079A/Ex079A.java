package ex079A;

import java.util.Scanner;

public class Ex079A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.print("> ");

		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		if (num.charAt(0) == num.charAt(1) && num.charAt(1) == num.charAt(2)) {
			System.out.println("Yes");
		} else if (num.charAt(1) == num.charAt(2) && num.charAt(2) == num.charAt(3)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		sc.close();

	}

}
