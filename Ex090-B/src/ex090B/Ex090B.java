package ex090B;

import java.util.Scanner;

public class Ex090B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.print("> ");
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int count = 0;
		
		for (int i = A; i <= B; i++) {
			
			String number = String.valueOf(i);
			
			if (number.charAt(0) == number.charAt(4)
					&& number.charAt(1) == number.charAt(3)) {
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();

	}

}
