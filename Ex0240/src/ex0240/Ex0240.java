package ex0240;

import java.util.Scanner;

public class Ex0240 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("input number :");
		System.out.println(num);
		System.out.println();
		
		// 九九表を格納する9×9の二次元配列を作成
		int [][] kuku = new int [9][9]; 
		// 数値が見つかったかどうかを判定
		boolean found = false;
			
		// 九九表を作りながら入力値を探索
			for (int i =0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					// 九九の値を配列に格納
					kuku[i][j] = (i + 1) * (j + 1);
					
					if (kuku[i][j] == num) {
			            found = true;
			            System.out.println("九九の表（" + (i + 1) + " * " + (j + 1) + "）にあります");
			            break;
					}
				}
				
				// 見つかったらfor文終了
				if (found) {
					break;
				}
			}	
				if (!found) {
					System.out.println("九九の表にありません");
			}
			
			sc.close();

		
	}

}
