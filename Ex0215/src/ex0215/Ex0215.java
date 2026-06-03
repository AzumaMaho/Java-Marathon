package ex0215;

import java.util.Scanner;

public class Ex0215 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		
		// スペース区切りで分割
		String[] str =  line.split(" ");
		
		// 文字列配列を整数配列に変換するための配列を作成
		int[] nums =new int[str.length];
		
		// String型をint型へ変換して配列に格納
		for (int i = 0; i < str.length; i++) {
			nums[i] = Integer.parseInt(str[i]);
		}
		
		
		String result = "";
		boolean found = false;

		// 全ての組み合わせを調べる
		for (int i = 0; i < nums.length; i++) {
			// iより後ろの要素と比較
		    for (int j = i + 1; j < nums.length; j++) {

		    	// 2つの数の合計が10だったら結果文字列に追加
		        if (nums[i] + nums[j] == 10) {

		            if (found) {
		                result += "、";
		            }

		            result += nums[i] + " と " + nums[j];
		            found = true;
		        }
		    }
		}

		
		System.out.println("input number :");
		System.out.println(line);
		System.out.println();
		
		// 結果を表示
		if (found) {
		    System.out.println(result + " は足して10となるペアです");
		} else {
		    System.out.println("ペアとなる数字はありません");
		}
		
		sc.close();
		
	}
}

/*
 * System.out.println("input number :");
	System.out.println(nums[i] + " " + nums[j]);
	System.out.println("");
	System.out.println(nums[i] + "と" + nums[j] + "は足して10になるペアです");
					 */
