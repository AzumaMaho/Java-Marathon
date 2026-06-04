package ex0250;

import java.util.Scanner;

public class Ex0250 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("input number :");
		System.out.println(num);
		
		// 100以下の素数を格納する配列
		int[] sosu = new int[100];
		// 配列に格納する位置を管理する変数
		int index = 0;
		

		for (int n = 2; n <= 100; n++) {
			// 素数判定
		    boolean prime = true;
		    // 2~n-1で割り切れるか確認
		    for (int i = 2; i < n; i++) {

		        if (n % i == 0) {
		            prime = false;
		        }
		    }
		 // 素数なら配列に格納
		    if (prime) {
		        sosu[index] = n;
		        index++;
		    }
		}
		
		// 二分探索の開始位置
		int left = 0;
		// 二分探索の終了位置
		int right = index - 1;
		// 入力値が見つかったかどうかを管理
		boolean found = false;
		
		// 二分探索
		while (left <= right) {
			int mid = (left + right) / 2;
			
			if (sosu[mid] == num) {
				found = true;
				break;
				// 入力値の方が小さい場合は左側を探索
			} else if(num < sosu[mid]) {
				right = mid - 1;
				// 入力値の方が大きい場合は右側を探索
			} else if(num > sosu[mid]) {
				left = mid + 1;
			}
		}
		
		
		if (found) {
		    System.out.println("素数です");
		} else {
		    System.out.println("素数ではありません");
		}
		
		
		sc.close();

	}

}
