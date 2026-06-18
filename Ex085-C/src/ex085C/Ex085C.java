package ex085C;

import java.util.Scanner;

public class Ex085C {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.print("> ");

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Y = sc.nextInt();
		
		int a = 0;
		int b = 0;
		int c = 0;
	
		
		for (a = 0; a <= N; a++) {
			for (b = 0; b <= N - a; b++) {
				
				c = N - a - b;
				
				if (10000 * a + 5000 * b + 1000 * c == Y) {
					System.out.println(a + " " + b + " " + c);
					sc.close();
					return;
				} 
			}
			
		}
		
		System.out.println("-1 -1 -1");
	
		sc.close();

	}

}
