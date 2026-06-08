package ex0370;

import java.util.Scanner;

public class Ex0370 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String answer = args[0];
		
		Scanner sc = new Scanner(System.in);
		
		int count = 1;

		while (true) {
			System.out.println("(" + count + "回目)" + "予測数字を入力してください：");
			
			String guess = sc.nextLine();
			
			if (guess.isEmpty()) {
			    continue;
			}

			if (guess.length() != 4
			        && !guess.equals("999")) {

			    System.out.println("4桁で入力してください");
			    continue;
			}
			
			int hit = 0;
			
			if(guess.equals("999")) {
				System.out.println("正解は" + answer + "でした。");
				break;
			}

			for (int i = 0; i < 4; i++) {

			    if (answer.charAt(i)
			            == guess.charAt(i)) {

			        hit++;
			    }
			}
			
			int blow = 0;

			for (int i = 0; i < 4; i++) {

			    for (int j = 0; j < 4; j++) {

			        if (i != j
			                && answer.charAt(i)
			                   == guess.charAt(j)) {

			            blow++;
			        }
			    }
			}
			
			System.out.println("ヒット :" + hit + "　ブロー :" + blow);
			
			if(hit == 4) {
				System.out.println("正解です。");
				break;
			}
			
			
			count++;
			
		}
		
		sc.close();

	}

}
